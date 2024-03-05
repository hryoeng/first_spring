package com.busanit.controller;

import com.busanit.model.Blog;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ParamController {
    @RequestMapping("/requestParam")
    public String param(@RequestParam(name="year", required=false)String year) { // 파라미터가 필수가 아님 : required = false
//    public String param(String year) { 위의 내용과 같음
//      http://localhost:8080/requestParam                year = null
//      http://localhost:8080/requestParam?year           year =""
        System.out.println("year = " + year);

        return "test";
    }

    @RequestMapping("/requestParam2")
    public String param2(@RequestParam(name="year", required=true)String year) { // 파라미터가 필수: required = true
//    public String param2(@RequestParam String year) { 위의 내용과 같음
//      http://localhost:8080/requestParam2                year = null    400 에러 발생
//      http://localhost:8080/requestParam2?year           year =""
        System.out.println("year2 = " + year);

        return "test";
    }

    @RequestMapping("/requestParam3")
    public String param3(@RequestParam(name="year", required=false, defaultValue="1")int year) { // defaultValue 값을 넣어 에러 발생하지 않음
//    public String param3(@RequestParam(name="year", required=false)int year) { // 아래와 같음
//    public String param(String year) { 위의 내용과 같음
//      http://localhost:8080/requestParam3                year = null    500 에러 발생
//      http://localhost:8080/requestParam3?year           year =""       400 에러
        System.out.println("year3 = " + year);

        return "test";
    }

    @RequestMapping("/requestParam4")
    public String param4(@RequestParam(name="year", required=true)int year) { // 파라미터가 필수: required = true
//    public String param2(@RequestParam String year) { 위의 내용과 같음
//      http://localhost:8080/requestParam4                year = null    400 에러 발생
//      http://localhost:8080/requestParam4?year           year =""       400 에러 발생
        System.out.println("year4 = " + year);

        return "test";
    }

    @RequestMapping("/requestParam5")
    // @ModelAttribute - Model에 자동 저장
    public String param5(@ModelAttribute("blog") Blog blog, Model model) {
//    public String param5(@ModelAttribute Blog blog, Model model) { 위의 내용과 같음
//                                         Blog에서 첫글자 소문자로 변경되어 blog가 key 값이 됨

        model.addAttribute("blog",blog);

        return "test";
    }

    // 컨트롤러 메서드의 매개변수
    /*
    *   @RequestParam - 기본형, String
    *   @ModelAttribute - 참조형
    * */

}

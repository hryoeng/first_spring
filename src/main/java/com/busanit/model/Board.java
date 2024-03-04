package com.busanit.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Board {

    private int idx;
    private String title;
    private String content;
    private String writer;
    private String indate;
    private int count;
}

/*
*   빈(Bean) - 스프링 프레임워크에서 관리되는 자바 객체
*   ex ) Board
*   빈이 모여 서비스를 이루게 됨
*
*   의존성 주입(DI - Dependency Injection)
*   - 인스턴스의 생성과 의존 관계를 소스 코드가 아닌 IoC 컨테이너가 하는 소프트웨어 디자인 패턴 중 하나
*   - 스프링 컨테이너에 Bean을 미리 생성해두고, 해당 Bean이 필요한 객체에 스프링 컨테이너가 주입하는 방식
*
*   IoC(Inversion of Control, 제어의 역전)
*   -
*
*   의존성 주입의 종류
*   - Setter Injectiont
*   - Constructor Injection(생성자)
*   - Field Injection
*
*   컴포넌트 스캔(Component Scan)
*   - 애플리케이션이 시작될 때 특정 클래스를 탐색한 다음 IoC 컨테이너에 ComponentScan이 설정된 클래스의 패키지로부터 그 하위 패키지를 탐색
*   - 너무 넓은 범위 설정은 애플리케이션 기동 시간을 늦출 수 있음
* */
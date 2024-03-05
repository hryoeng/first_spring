package com.busanit.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Blog {
    private int num;
    private String title;
    private String content;
    private String id;
    private Date regdate;
}

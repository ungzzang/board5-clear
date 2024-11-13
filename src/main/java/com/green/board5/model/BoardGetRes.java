package com.green.board5.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BoardGetRes {
    private String title;
    private String contents;
    private String writer;
    private String createdAt;
}

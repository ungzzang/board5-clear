package com.green.board5.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class BoardPostReq {
    private String title;
    private String contents;
    private String writer;
}

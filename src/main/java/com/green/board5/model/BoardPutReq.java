package com.green.board5.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardPutReq {
    private int boardId;
    private String title;
    private String contents;
    private String writer;
}

package com.green.board5.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardDeleteReq {
    private int boardId;
    private String writer;
}

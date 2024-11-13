package com.green.board5;

import com.green.board5.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    int postBoard(BoardPostReq p);
    List<BoardGetRes> getBoard();
    BoardGetOneRes getBoardOne(int boardId);
    int putBoard(BoardPutReq p);
    int delBoard(BoardDeleteReq p);
}

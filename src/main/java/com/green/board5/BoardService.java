package com.green.board5;

import com.green.board5.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardMapper mapper;

    int postBoard(BoardPostReq p){
        return mapper.postBoard(p);
    }

    List<BoardGetRes> getBoard(){
        return mapper.getBoard();
    }

    BoardGetOneRes getBoardOne(int boardId){
        return mapper.getBoardOne(boardId);
    }

    int putBoard(BoardPutReq p) {
        return mapper.putBoard(p);
    }

    int delBoard(BoardDeleteReq p) {
        return mapper.delBoard(p);
    }
}

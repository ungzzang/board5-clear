package com.green.board5;

import com.green.board5.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {
    private final BoardService service;

    @PostMapping
    public int postBoard(@RequestBody BoardPostReq p){
        System.out.println(p);
        return service.postBoard(p);
    }

    @GetMapping
    public List<BoardGetRes> getBoard(){
        return service.getBoard();
    }

    @GetMapping("{boardId}")
    public BoardGetOneRes getBoardOne(@PathVariable int boardId){
        return service.getBoardOne(boardId);
    }

    @PutMapping
    public int putBoard(@RequestBody BoardPutReq p) {
        System.out.println(p);
        return service.putBoard(p);
    }

    @DeleteMapping
    public int delBoard(@ModelAttribute BoardDeleteReq p){
        System.out.println(p);
        return service.delBoard(p);
    }
}

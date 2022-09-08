package com.example.demo.Service;

import com.example.demo.Domain.Board;

import java.util.List;

public interface BoardService {
    List<Board> getBoardList(Board board);
    void insertBoard(Board board);
    void getBoard(Board board);
    void updateBoard(Board board);
    void deleteBoard(Board board);
}

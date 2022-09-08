package com.example.demo.Service;

import com.example.demo.Domain.Board;
import com.example.demo.Repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BoardServiceImpl implements BoardService {
    @Autowired
    private BoardRepository boardRepository;

    public List<Board> getBoardList(Board board) {
        return (List<Board>) boardRepository.findAll();
    }

}

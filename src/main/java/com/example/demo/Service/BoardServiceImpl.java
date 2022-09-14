package com.example.demo.Service;

import com.example.demo.Domain.Board;
import com.example.demo.Repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardRepository boardRepository;

    @Override
    public List<Board> getBoardList() { return (List<Board>) boardRepository.findAll();}


}

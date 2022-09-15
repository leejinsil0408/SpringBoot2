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
    public List<Board> getBoardList() { return  (List<Board>) boardRepository.findAll(); }

    @Override
    public void insertBoard(Board board) { boardRepository.save(board); }

    @Override
    public Board getBoard(Board board) { return boardRepository.findById(board.getSeq()).get(); }

    @Override
    public void updateBoard(Board board) {
        Board findBoard = boardRepository.findById(board.getSeq()).get();
        findBoard.setTitle(board.getTitle());
        findBoard.setContent(board.getContent());
        boardRepository.save(findBoard);
    }

    @Override
    public void deleteBoard(Board board) { boardRepository.deleteById(board.getSeq());}
}

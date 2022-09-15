package com.example.demo.Controller.Board;

import com.example.demo.Domain.Board;
import com.example.demo.Service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BoardController {
    @Autowired
    private BoardService boardService;

    @GetMapping("/getBoardList")
    public String getBoardList(Model model, Board board) {
        List<Board>boardList = boardService.getBoardList();

        model.addAttribute("boardList", boardList);
        return "getBoardList";
    }

    @GetMapping("/insertBoard")
    public String insertBoardView() {
        return "insertBoard";
    }

    @PostMapping("/insertBoard")
    public String insertBoard(Board board);



}

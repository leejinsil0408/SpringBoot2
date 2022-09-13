package com.example.demo.Domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@ToString
@Entity

public class Board {
    @Id
    @GeneratedValue
    private Long seq;

    private String title;

    private String content;

    private String writer;

    private Date createDate;

    private Long cnt;
}

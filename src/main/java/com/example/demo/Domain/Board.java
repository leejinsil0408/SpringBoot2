package com.example.demo.Domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@ToString
@Entity

public class Board {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seq;
    private String title;
    private String writer;
    private String content;
    private Date createDate;
    private Long cnt;
}

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
    @Id @GeneratedValue
    private Long seq;

    private String title;
    @Column(updatable = false)
    private String writer;

    private String content;

    @Column(insertable = false, updatable = false, columnDefinition = "date dafault sysdate" )
    private Date createDate;

    @Column(insertable = false, updatable = false, columnDefinition = "number default 0")
    private Long cnt;
}

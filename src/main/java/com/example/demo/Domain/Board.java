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
    @Id @GeneratedValue
    private Long seq;

    @Column(length = 40, nullable = false)
    private String title;

    @Column(updatable = false, nullable = false)
    private String writer;

    @Column(nullable = false)
    @ColumnDefault("'no content'")
    private String content;

    //시간 제약
    @Temporal(TemporalType.DATE)
    //데이터 값 삽입 불가, 값 변경 불가
    @Column(insertable = false, updatable = false, columnDefinition = "date dafault sysdate" )
    private Date createDate;

    @ColumnDefault("0")
    @Column(insertable = false, updatable = false, columnDefinition = "number default 0")
    private Long cnt;
}

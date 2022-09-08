package com.example.demo.Repository;

import com.example.demo.Domain.Board;
import org.springframework.data.repository.CrudRepository;

//repository : 엔티티에 의해 생성된 DB 테이블에 접근하는 메서드(findAll, save 등) 사용하기 위한 인터페이스
public interface BoardRepository extends CrudRepository<Board, Long> {

}

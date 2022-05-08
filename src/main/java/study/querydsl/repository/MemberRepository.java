package study.querydsl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.querydsl.entity.Member;

import java.util.List;

//Spring Data JPA 에서 제공하는 JPA 리포지토리(추가. 사용자 정의 리포지토리 상속)
public interface MemberRepository extends JpaRepository<Member, Long> ,MemberRepositoryCustom {
    List<Member> findByUsername(String username);
}

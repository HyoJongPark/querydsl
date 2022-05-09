package study.querydsl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import study.querydsl.entity.Member;

import java.util.List;

/**
 * JpaRepository - Spring Data JPA 에서 제공하는 JPA 리포지토리
 * MemberRepositoryCustom - 사용자 정의 리포지토리
 * QuerydslPredicateExecutor - Spring Data JPA 에서 Querydsl 를 위해 제공하는 리포지토리
 *                       단점 - 조인이 안되고, 클라이언트가 Querydsl 에 의존해야 한다.
 */
public interface MemberRepository extends JpaRepository<Member, Long> ,MemberRepositoryCustom, QuerydslPredicateExecutor<Member> {
    List<Member> findByUsername(String username);
}

package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); //회원 저장
    Optional<Member> findById(Long id); //저장소에서 findById로 찾아옴
    Optional<Member> findByName(String name);
    List<Member> findAll(); //지금까지 찾은 모든 회원 리스트 반환
}

package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.ObjectAssert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

class MemoryMemberRepositoryTest {
    // 인터페이스-클래스 객체생성이유?
    MemoryMemberRepository repository = new MemoryMemberRepository();

    // 테스트마다 서로 의존관계없이 설계되야함,
    // 테스트 하나 끝날때마다 저장소나 공용데이터를 지워야한다
    @AfterEach
    public void afterEach(){
        repository.clearStore();

    }
    @Test
    public void save(){
        Member member = new Member();
        member.setName(("spring"));
        repository.save(member);
        Member result = repository.findById(member.getId()).get();//optional에서 값을 꺼낼때 get()
        //Assertions.assertEquals(member, result);
        //Assertions.assertThat(result).isEqualTo(member);
        assertThat(result).isEqualTo(member);

    }
    @Test
    public void findByName(){
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        Member result = repository.findByName("spring1").get(); // get()하면 옵셔널 까서꺼낼수있다

        assertThat(result).isEqualTo(member1);

    }

    @Test
    public void findAll(){
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        List<Member> result = repository.findAll();
        assertThat(result.size()).isEqualTo(2);
    }

}

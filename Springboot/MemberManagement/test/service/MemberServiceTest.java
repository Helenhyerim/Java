package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemoryMemberRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {
    MemoryMemberRepository memberRepository;
    MemberService memberService;

    @BeforeEach
    public void beforeEach(){
//        MemberService memberService = new MemberService();
//        MemoryMemberRepository memberRepository = new MemoryMemberRepository();
// 테스트 실행할때마다 독립적으로 저장소 생성하기 위함
// 같은 MemoryMemberRepository 가 사용될 것임
        memberRepository = new MemoryMemberRepository();
        memberService = new MemberService(memberRepository); // 생성자호출
    }

    @AfterEach
    public void afterEach(){
        memberRepository.clearStore();
    }

    @Test
    void 회원가입 () {
        // given
        Member member = new Member();
        member.setName("spring");

        // when
        Long savedId = memberService.join(member);

        // then
        Member findMember = memberService.findOne(savedId).get();
        assertThat(member.getName()).isEqualTo(findMember.getName());
    }

    @Test
    public void 중복회원_예외(){
        // given
        Member member1 = new Member();
        member1.setName("spring");

        Member member2 = new Member();
        member2.setName("spring");

        memberService.join(member1);
        // 뒤의 로직을 실행했을 때 앞의 예외가 터져야함
        IllegalStateException e = assertThrows(IllegalStateException.class, () -> memberService.join(member2));
        // assertThrows 는 반환이 가능해서 메세지 검증이 가능하다
        assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다");

//        try {
//            memberService.join(member2);
//            fail();
//        } catch (IllegalStateException e){
//            assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다");
//        }


        // when

        // then

    }

    @Test
    void findMembers() {
    }

    @Test
    void findOne() {
    }
}

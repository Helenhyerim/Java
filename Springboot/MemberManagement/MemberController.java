package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
// 스프링 컨테이너에서 객체 생성하고 스프링에 넣어두고 스프링에서 관리하기 시작하는 어노테이션
// 스프링 컨테이너에서 스프링 빈이 관리된다고 표현함
@Controller
public class MemberController {

    // 아래처럼 멤버서비스 객체를 생성할 수도 있지만, 멤버컨트롤러 말고도 다른 컨트롤러들이 가져다쓸수 있기때문에
    // 하나만 생성하고 공용으로 쓰도록 스프링 컨테이너에 딱 하나만 등록하고 받아서 쓰도록 바꿔야 한다
    // private final MemberService memberService = new MemberService();
    private final MemberService memberService;

    // 생성자로
    // 스프링컨테이너에 있는 멤버서비스와 연결됨
    // 'hello.hellospring.service.MemberService' that could not be found -> 스프링빈으로 등록되어 있지 않은상태
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}

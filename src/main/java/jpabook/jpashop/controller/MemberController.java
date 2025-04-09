package jpabook.jpashop.controller;

import jakarta.validation.Valid; // @NotEmpty, @Size 등 유효성 검사를 위한 Bean Validation 사용
import jpabook.jpashop.domain.Address; // 값 타입 주소
import jpabook.jpashop.domain.Member;  // 회원 엔티티
import jpabook.jpashop.service.MemberService; // 회원 가입 비즈니스 로직을 담당하는 서비스
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; // 템플릿에 데이터를 전달할 때 사용하는 모델 객체
import org.springframework.validation.BindingResult; // 바인딩 결과와 검증 오류를 담는 객체
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller // 이 클래스가 스프링 MVC 컨트롤러임을 나타냄
@RequiredArgsConstructor // final 필드를 자동으로 생성자 주입
public class MemberController {

    private final MemberService memberService; // 회원 서비스 의존성 주입

    // 회원 등록 페이지를 요청했을 때 호출되는 메서드 (GET 요청)
    @GetMapping("/members/new")
    public String createForm(Model model) {
        model.addAttribute("memberForm", new MemberForm()); // 템플릿에서 사용할 빈 폼 객체를 전달
        return "members/createMemberForm"; // templates/members/createMemberForm.html 렌더링
    }

    // 회원 등록 form을 제출했을 때 실행되는 메서드 (POST 요청)
    @PostMapping("/members/new")
    public String create(@Valid MemberForm form, BindingResult result) {

        /**
         * 📌 @Valid: MemberForm의 필드에 선언된 유효성 검사 어노테이션(@NotEmpty 등)을 기준으로 입력값을 검증함
         * 📌 BindingResult: 검증 실패 시 발생하는 오류 정보를 담고 있음
         *    - @Valid 바로 오른쪽에 있어야 작동함!
         *    - 유효성 검사 실패 시에도 예외가 터지지 않고, 컨트롤러 안에서 직접 오류 처리 가능
         */

        if (result.hasErrors()) {
            // 유효성 검증에서 오류가 발생한 경우, 다시 회원가입 폼 페이지로 되돌아감
            // 입력했던 데이터와 에러 메시지를 담아서 화면에 출력 가능
            return "members/createMemberForm";
        }

        // 유효성 통과 후, Address 객체 생성
        Address address = new Address(form.getCity(), form.getStreet(), form.getZipCode());

        // Member 엔티티 생성 후, 값 세팅
        Member member = new Member();
        member.setName(form.getName());
        member.setAddress(address);

        // 비즈니스 로직 실행: 회원 저장
        memberService.join(member);

        // 저장 완료 후, 홈 화면으로 리다이렉트
        return "redirect:/";
    }

    @GetMapping("/members")
    public String list(Model model) {
        List<Member> members = memberService.findMembers();
        model.addAttribute("members", members);
        return "members/memberList";
    }
}

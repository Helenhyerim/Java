package hello.hellospring.domain;

public class Member {
    // new Member() 같은 객체생성시 id값이 없어야하는데
    // long은 null을 입력할수없기때문
    private Long id; // 시스템이 저장하는 id
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

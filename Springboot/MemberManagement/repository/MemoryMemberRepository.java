package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.*;

// 실무에서는 동시성문제때문에 ConcurrentHashMap, AtomicLong 사용
public class MemoryMemberRepository implements MemberRepository{
    // value가 Member타입인 이유: name외에 다른정보가 들어갈 수 있기때문
    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;

    @Override
    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        // 결과로 null이 반환될 가능성
        return Optional.ofNullable(store.get(id));

    }

    @Override
    public Optional<Member> findByName(String name) {
        // name은 중복이 가능하기때문에 stream()으로 돌려서 찾기
        return store.values().stream()
                .filter(member -> member.getName().equals(name))
                .findAny();

    }

    @Override
    public List<Member> findAll() {

        return new ArrayList<>(store.values());
    }

    public void clearStore(){
        store.clear();
    }
}

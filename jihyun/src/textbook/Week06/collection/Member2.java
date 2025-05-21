package textbook.Week06.collection;

import java.util.Comparator;

public class Member2 implements Comparator<Member2> {
    private int memberId;
    private String memberName;

    public Member2(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String toString() {
        return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
    }

    public int hashCode() {
        return memberId; // hashCode는 원래 메모리 주소 기반 해시값을 반환하는데, 회원 아이디로 반환
        // hashCode는 메모리 주소랑 아무 상관 없음. 재정의하면 주소가 같아지는게 아닌, 같은 숫자를 리턴하도록 코드를 바꾸는 것
    }

    public boolean equals(Object obj) {
        if(obj instanceof Member2) {
            Member2 member = (Member2)obj;
            if(this.memberId == member.memberId)
                return true;
            else
                return false;
        }
        return false;
    }

    public int compare(Member2 mem1, Member2 mem2) {
        return (mem1.getMemberId() - mem2.getMemberId());
    } // compare 메서드 재정의, 전달받은 두 매개변수를 비교
    // 같은 클래스 내에 있으면 private라도 mem1.memberId라고 사용할 수 있으나,
    // compare() 메서드 안에서 멤버 변수 값을 비교할 땐 캡슐화 원칙대로 getter (getMemberId())를 사용하는 습관이 좋음
}

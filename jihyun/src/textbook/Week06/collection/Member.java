package textbook.Week06.collection;

// import singleton.Company;

public class Member implements Comparable<Member> {
    // <Member>은 제네릭--> compareTo() 메서드가 비교할 대상의 타입

    private int memberId;
    private String memberName;

    public Member(int memberId, String memberName) {
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
        if(obj instanceof Member) {
            Member member = (Member)obj;
            if(this.memberId == member.memberId)
                return true;
            else
                return false;
        }
        return false;
    } // equals 메서드를 재정의하는 것은 어떤 값이 같을 때 이 객체를 같다고 판단할지 정의하는 것
    // hashCode()가 같고, equals()가 true를 반환하는 것은 메모리 주소가 같은 것이 아닌, 논리적으로 같은 객체라고 간주하는 것 (논리적 동일성)
    // 물리적으로 (== 연산 기준) 메모리 주소가 같은 객체가 아님! (물리적 동일성)

    public int compareTo(Member member) { // Comparable 인터페이스의 메서드 오버라이딩
        return (this.memberId - member.memberId) * (-1);
    } // 두 값을 비교하여 양수, 음수, 0으로 반환
    // compareTo() 메서드는 Comparable 인터페이스를 구현할 때 쓰는 메서드
    // this.memberId는 지금 compareTo() 메서드를 실행하고 있는 그 Member 객체 자기 자신의 memberId 값을 의미함
    // m1.compareTo(m2)에서 this는 m1을 의미
    // compareTo()는 객체가 TreeSet에 요소를 추가할 때 자동으로 호출되는 메서드
    // 콜백 메서드 : 시스템이나 자바 컬렉션 프레임워크가 호출하는 메서드
    // 리턴 값 3-5= -2 > 왼쪽 먼저 (오름차순) // 3-5=-2 * (-1)시 2(양수) > 오른쪽 먼저 (내림차순)
    // 양 쪽 값이 같으면 순서 동일
}

// Comparable 인터페이스 --> compareTo() 메서드
// Comparator 인터페이스 --> compare() 메서드

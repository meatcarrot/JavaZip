package ch12;
import java.util.Iterator;
import java.util.TreeSet;

class Member2 implements Comparable<Member2>{

    private int memberId;
    private String memberName;

    public Member2(int memberId, String memberName){
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {  //
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

    @Override
    public String toString(){   //toString �޼ҵ� �����ε�
        return memberName + " 회원님의 아이디는 " + memberId + "입니다";
    }

    @Override
    public int hashCode() {
        return memberId;
    }

    @Override
    public boolean equals(Object obj) {
        if( obj instanceof Member2){
            Member2 member = (Member2)obj;
            if( this.memberId == member.memberId )
                return true;
            else
                return false;
        }
        return false;
    }

    @Override
    public int compareTo(Member2 member) {

        return this.memberName.compareTo(member.memberName);

    }
}

class MemberTreeSet {

    private TreeSet<Member2> treeSet;

    public MemberTreeSet(){
        treeSet = new TreeSet<Member2>();
    }

    public void addMember(Member2 member){
        treeSet.add(member);
    }

    public boolean removeMember(int memberId){

        Iterator<Member2> ir = treeSet.iterator();

        while( ir.hasNext()){
            Member2 member = ir.next();
            int tempId = member.getMemberId();
            if( tempId == memberId){
                treeSet.remove(member);
                return true;
            }
        }

        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember(){
        for(Member2 member : treeSet){
            System.out.println(member);
        }
        System.out.println();
    }
}

public class week06_p465_09 {
    public static void main(String[] args) {

        MemberTreeSet memberTreeSet = new MemberTreeSet();


        Member2 memberPark = new Member2(1003, "박서훤");
        Member2 memberLee = new Member2(1001, "이지원");
        Member2 memberSon = new Member2(1002, "손민국");


        memberTreeSet.addMember(memberLee);
        memberTreeSet.addMember(memberSon);
        memberTreeSet.addMember(memberPark);
        memberTreeSet.showAllMember();

        Member2 memberHong = new Member2(1003, "홍길동");  //1003 아이디 중복
        memberTreeSet.addMember(memberHong);
        memberTreeSet.showAllMember();
    }
}

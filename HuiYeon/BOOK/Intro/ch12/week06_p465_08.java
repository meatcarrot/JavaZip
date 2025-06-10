package ch12;
import java.util.ArrayList;
import java.util.Iterator;
class Member {

    private int memberId;
    private String memberName;

    public Member(int memberId, String memberName){
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
        if( obj instanceof Member){
            Member member = (Member)obj;
            if( this.memberId == member.memberId )
                return true;
            else
                return false;
        }
        return false;
    }


}

class MemberArrayList {

    private ArrayList<Member2> arrayList;

    public MemberArrayList(){
        arrayList = new ArrayList<Member2>();
    }

    public void addMember(Member2 member){
        arrayList.add(member);
    }

    public void insertMember(Member2 member, int position) {
        if(position <0 || position > arrayList.size()+1) {
            System.out.println("지정된 자리에 추가할 수 없습니다.");
            return;
        }
        arrayList.add(position-1, member);
    }

    public boolean removeMember(int memberId){

        for(int i =0; i<arrayList.size(); i++){
            Member2 member = arrayList.get(i);
            int tempId = member.getMemberId();
            if(tempId == memberId){
                arrayList.remove(i);
                return true;
            }
        }

        Iterator<Member2> ir = arrayList.iterator();
        while(ir.hasNext()) {
            Member2 member = ir.next();
            int tempId = member.getMemberId();
            if(tempId == memberId){
                arrayList.remove(member);
                return true;
            }
        }

        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember(){
        for(Member2 member : arrayList){
            System.out.println(member);
        }
        System.out.println();
    }
}
public class week06_p465_08 {
    public static void main(String[] args) {

        MemberArrayList memberArrayList = new MemberArrayList();

        Member2 memberLee = new Member2(1001, "이지원");
        Member2 memberSon = new Member2(1002, "손민국");
        Member2 memberPark = new Member2(1003, "박서훤");
        Member2 memberHong = new Member2(1004, "홍길동");

        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberSon);
        memberArrayList.addMember(memberPark);
        memberArrayList.addMember(memberHong);

        memberArrayList.showAllMember();

        memberArrayList.removeMember(memberHong.getMemberId());
        memberArrayList.showAllMember();

        memberArrayList.insertMember(memberHong, 3);
        memberArrayList.showAllMember();
    }
}

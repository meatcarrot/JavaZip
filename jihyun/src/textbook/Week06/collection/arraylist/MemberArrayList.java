package textbook.Week06.collection.arraylist;

import java.util.ArrayList;
import textbook.Week06.collection.Member;

public class MemberArrayList {
    private ArrayList<Member> arrayList;

    public MemberArrayList() {
        arrayList = new ArrayList<Member>();
    }

    public void addMember(Member member) {
        arrayList.add(member);
    }

    public boolean removeMember(int memberId) {
        for(int i = 0; i < arrayList.size(); i++) {
            Member member = arrayList.get(i);
            int tempId = member.getMemberId();

            if(tempId == memberId) {
                arrayList.remove(i);
                return true;
            }
        }
        // arrayList를 다 돌때까지 memberId가 나오지 않으면
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember() {
        for (Member member : arrayList) {
            System.out.println(member);
        }
        System.out.println( );
    }
}
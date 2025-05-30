package collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

import collection.Member;

public class MemberTreeSet {
    private TreeSet<Member> treeSet;

    public MemberTreeSet() {
        treeSet = new TreeSet<Member>();
    }

    public void addMember(Member member) {
        treeSet.add(member);
    }
    public boolean removeMember(int memberId) {
        Iterator<Member> ir = treeSet.iterator();

        while(ir.hasNext()) {
            Member member = ir.next();
            int tmpId = member.getMemberId();
            if(tmpId == memberId) {
                treeSet.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "가 존재X");
        return false;
    }
    public void showAllMember() {
        for(Member member : treeSet) {
            System.out.println(member);
        }
        System.out.println();
    }
}

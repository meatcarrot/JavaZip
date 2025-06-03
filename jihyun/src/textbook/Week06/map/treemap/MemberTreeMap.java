package textbook.Week06.map.treemap;

import java.util.Iterator;
import java.util.TreeMap;

// import java.util.Collections; 내림 차순에 필요한 라이브러리

import textbook.Week06.collection.Member;

public class MemberTreeMap {
    private TreeMap<Integer, Member> treeMap;

    public MemberTreeMap() {
        treeMap = new TreeMap<>(); // 오름차순 default
        // treeMap = new TreeMap<>(Collections.reverseOrder()); 내림차순 진행시
    }

    public void addMember(Member member) {
        treeMap.put(member.getMemberId(), member);
    }

    public boolean removeMember(int memberId) {
        if(treeMap.containsKey(memberId)) {
            treeMap.remove(memberId);
            return true;
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember() {
        Iterator<Integer> ir = treeMap.keySet().iterator();

        while(ir.hasNext()) {
            int key = ir.next();
            Member member = treeMap.get(key);
            System.out.println(member);
        }
        System.out.println();
    }
}

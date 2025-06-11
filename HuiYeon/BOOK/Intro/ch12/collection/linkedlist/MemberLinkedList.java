package ch12.collection.linkedlist;

import java.util.LinkedList;

import ch12.collection.Member;

public class MemberLinkedList {

    private LinkedList<Member> linkedList;

    public MemberLinkedList(){
        linkedList = new LinkedList<Member>();
    }

    public void addMember(Member member){
        linkedList.add(member);
    }

    public boolean removeMember(int memberId){

        for(int i =0; i<linkedList.size(); i++){
            Member member = linkedList.get(i);
            int tempId = member.getMemberId();
            if(tempId == memberId){
                linkedList.remove(i);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다");
        return false;
    }

    public void showAllMember(){
        for(Member member : linkedList){
            System.out.println(member);
        }
        System.out.println();
    }
}
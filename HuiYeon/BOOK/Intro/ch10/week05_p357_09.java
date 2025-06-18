package ch10;
import java.io.IOException;

interface Scheduler {

    public void getNextCall();
    public void sendCallToAgent();

}

class LeastJob implements Scheduler{

    @Override
    public void getNextCall() {
        System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다");

    }

    @Override
    public void sendCallToAgent() {
        System.out.println("현재 상담업무가 없거나 상담대기가 가장 작은 상담원에게 할당합니다.");

    }

}

class RoundRobin implements Scheduler{

    @Override
    public void getNextCall() {
        System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다");

    }

    @Override
    public void sendCallToAgent() {
        System.out.println("다음 순서 상담원에게 배분합니다.");

    }

}

class PriorityAllocation implements Scheduler{

    @Override
    public void getNextCall() {
        System.out.println("고객 등급이 높은 고객의 전화를 먼저 가져옵니다.");

    }

    @Override
    public void sendCallToAgent() {
        System.out.println("업무 skill 값이 높은 상담원에게 우선적으로 배분합니다.");

    }
}

class AgentGetCall implements Scheduler{

    @Override
    public void getNextCall() {
        System.out.println("상담원이 다음 전화 요청");

    }

    @Override
    public void sendCallToAgent() {
        System.out.println("상담원이 전화 상담을 가져갔습니다.");
    }

}


public class week05_p357_09 {
    public static void main(String[] args) throws IOException{
        System.out.println("전화 상담 할당 방식을 선택 하세요.");
        System.out.println("R : 한명씩 차례로 할당 ");
        System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당 ");
        System.out.println("P : 우선순위가 높은 고객 먼저 할당 ");
        System.out.println("A : 상담원이 상담 가져가기 ");

        int ch = System.in.read();
        Scheduler scheduler = null;

        if(ch == 'R' || ch == 'r'){
            scheduler = new RoundRobin();
        }
        else if(ch == 'L' || ch == 'l'){
            scheduler = new LeastJob();
        }
        else if(ch == 'P'|| ch == 'p'){
            scheduler = new PriorityAllocation();
        }
        else if(ch == 'A'|| ch == 'a'){
            scheduler = new AgentGetCall();
        }
        else{
            System.out.println("지원되지 않는 기능입니다.");
            return;
        }

        scheduler.getNextCall();
        scheduler.sendCallToAgent();
    }
}

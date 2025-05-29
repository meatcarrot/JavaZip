package textbook.Week05;
import java.io.IOException;

public class Week05_p357_09 {
    public static void main(String[] args) throws IOException{
        System.out.println("전화 상담 할당 방식을 선택하세요.");
        System.out.println("R : 한 명씩 차례로 할당");
        System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
        System.out.println("P : 우선순위가 높은 고객 먼저 할당");
        System.out.println("A : 상담원이 필요할 때마다 대기열에서 가져옴");

        int ch = System.in.read();
        Scheduler scheduler = null;

        if(ch == 'R' || ch == 'r') {
            scheduler = new RoundRobin();
        }
        else if(ch == 'L' || ch == 'l') {
            scheduler = new LeastJob();
        }
        else if(ch == 'P' || ch == 'p') {
            scheduler = new PriorityAllocation();
        }
        else if(ch == 'A' || ch == 'a') {
            scheduler = new AgentGetCall();
        }
        else {
            System.out.println("지원되지 않는 기능입니다.");
            return;
        }

        scheduler.getNextCall();
        scheduler.sendCallToAgent();
    }
}

interface Scheduler {
    public void getNextCall();
    public void sendCallToAgent();
}

class RoundRobin implements Scheduler {
    public void getNextCall() {
        System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");
    }

    public void sendCallToAgent() {
        System.out.println("다음 순서 상담원에게 배분합니다.");
    }
}

class PriorityAllocation implements Scheduler {
    public void getNextCall() {
        System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");
    }

    public void sendCallToAgent() {
        System.out.println("업무 skill 값이 가장 높은 상담원에게 우선적으로 배분합니다.");
    }
}

class LeastJob implements Scheduler {
    public void getNextCall() {
        System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");
    }

    public void sendCallToAgent() {
        System.out.println("현재 상담 업무가 없거나 대기가 가장 적은 상담원에게 할당합니다.");
    }
}

class AgentGetCall implements Scheduler {
    public void getNextCall() {
        System.out.println("상담원이 다음 전화 요청");
    }

    public void sendCallToAgent() {
        System.out.println("상담원이 전화 상담을 가져갔습니다.");
    }
}
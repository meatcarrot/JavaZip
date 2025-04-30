package ch4;

public class test10 {
    public static void main(String[] args) {

        int floor = 2;
        String message = switch(floor) {

            case 1 -> "1층 입니다.";
            case 2 -> "2층 입니다.";
            case 3 -> "3층 입니다.";
            case 4 -> "4층 입니다.";
            case 5 -> "5층 입니다.";
            default -> "층수가 없습니다";

        };
        System.out.println(message);
    }
}

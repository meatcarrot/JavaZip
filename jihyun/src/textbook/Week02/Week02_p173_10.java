package textbook.Week02;

public class Week02_p173_10 {
    public static void main(String[] args) {
        Shopping order = new Shopping();

        order.orderNum = 20240731;
        order.id = "abc123";
        order.date = "2024년 7월 31일";
        order.name = "홍길순";
        order.serialNum = "PD0345-12";
        order.destination = "서울시 영등포구 여의도동 20번지";

        System.out.println("주문번호: " + order.orderNum);
        System.out.println("주문자 아이디: " + order.id);
        System.out.println("주문 날짜: " + order.date);
        System.out.println("주문자 이름: " + order.name);
        System.out.println("주문 상품 번호: " + order.serialNum);
        System.out.println("배송 주소: " + order.destination);
    }
}

class Shopping {
    public int orderNum;
    public String id;
    public String date;
    public String name;
    public String serialNum;
    public String destination;
}
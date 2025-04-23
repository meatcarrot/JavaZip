package ch5;

public class OnlineMall {
    long orderId;
    String customerId;
    String Date;
    String Name;
    String product;
    String Address;

    public static void main(String [] args){
        OnlineMall order = new OnlineMall();

        order.orderId = 202407310001L;
        order.customerId = "abc123";
        order.Date = "2024년 7월 31일";
        order.Name = "홍길순";
        order.product = "PD345-12";
        order.Address = "서울시 영등포구 여의도동 20번지";

        System.out.println(order.orderId);
        System.out.println(order.customerId);
        System.out.println(order.Date);
        System.out.println(order.Name);
        System.out.println(order.product);
        System.out.println(order.Address);
    }
}

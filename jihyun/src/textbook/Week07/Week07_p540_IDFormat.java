package textbook.Week07;

public class Week07_p540_IDFormat {
    public static void main(String[] args) {
        IDFormat test = new IDFormat();

        String userID = null;
        try {
            test.setUserID(userID);
        } catch (IDFormatException e) {
            System.out.println(e.getMessage());
            // getMessage()로 Exception 클래스에 저장되어 있는 사용자가 작성한 메시지 가져옴
        }

        userID = "1234567";
        try {
            test.setUserID(userID);
        } catch (IDFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}

class IDFormatException extends Exception {
    public IDFormatException(String message) {
        super(message); // super() : 부모 클래스의 생성자 호출하는 키워드(예약어)
        // Exception 클래스의 생성자를 호출함 -> 예외 message를 Exception 클래스에 전달
        // getMessage()를 사용할 때, 사용자가 작성한 메시지 출력할 수 있도록 함
    }
}

class IDFormat {
    private String userID;

    public String getUserId() {
        return userID;
    }

    public void setUserID (String userID) throws IDFormatException {
        // throws : 예외를 발생시킬 수 있다고 선언하고 책임을 미룸.
        // 예외를 호출한 곳으로 넘겨주어 거기서 try-catch로 처리할 수 있도록 함.
        if(userID == null) {
            throw new IDFormatException("아이디는 null일 수 없습니다.");
            // throw : 예외를 실제로 발생시킴.
        }
        else if(userID.length() < 8 || userID.length() > 20) {
            throw new IDFormatException("아이디는 8자 이상 20자 이하로 쓰세요.");
        }
        this.userID = userID;
    }
}
package textbook.Week07;

public class Week07_p543_05 {
    public static void main(String[] args) {
        PWFormat test = new PWFormat();

        String pass = null;
        try {
            test.setPassword(pass);
        } catch(PWFormatException e) {
            System.out.println(e.getMessage());
        }

        pass = "abcd";
        try {
            test.setPassword(pass);
        } catch(PWFormatException e) {
            System.out.println(e.getMessage());
        }


//        String pass = new String("abc");
//        System.out.println(pass.matches("[a-zA-Z]+")); // true
//
//        String pass2 = new String("abc1");
//        System.out.println(pass2.matches("[a-zA-Z]+")); // false
    }
}

class PWFormat {
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws PWFormatException {
        if(password == null) {
            throw new PWFormatException("비밀번호는 null일 수 없습니다.");
        }
        else if(password.matches("[a-zA-Z]+")) {
            if(password.length() < 5) {
                throw new PWFormatException("비밀번호가 문자열로만 이루어진 경우, 5자 이상으로 쓰세요.");
            }
        }
        this.password = password;
    }
}

class PWFormatException extends Exception {
    public PWFormatException(String message) {
        super(message); // getMessage()를 사용할 때, 사용자가 작성한 메시지를 출력할 수 있도록 함
    }
}
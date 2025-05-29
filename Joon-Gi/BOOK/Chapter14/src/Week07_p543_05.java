class PasswordException extends Exception {
    public PasswordException(String message) {
        super(message);
    }
}

class User {
    private String password;

    public void setPassword(String password) throws PasswordException {
        if (password == null) {
            throw new PasswordException("비밀번호는 null일 수 없습니다.");
        } else if (password.matches("[a-zA-Z]+")) {
            throw new PasswordException("비밀번호는 문자와 숫자로 이루어져야 합니다.");
        } else if (password.length() < 5) {
            throw new PasswordException("비밀번호는 5자 이상이어야 합니다.");
        }
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}

public class Week07_p543_05 {
    public static void main(String[] args) {
        User user = new User();

        String pw = null;
        try {
            user.setPassword(pw);
            System.out.println(user.getPassword());
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }

        pw = "1234";
        try {
            user.setPassword(pw);
            System.out.println(user.getPassword());
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }

        pw = "RIdhaiengi";
        try {
            user.setPassword(pw);
            System.out.println(user.getPassword());
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }

        pw = "JAVA14";
        try {
            user.setPassword(pw);
            System.out.println(user.getPassword());
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}

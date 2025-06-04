package ch14;

class PasswordException extends IllegalArgumentException{

    public PasswordException(String message) {
        super(message);
    }
}

class PasswordTest {
    private String password;

    public String getPassword(){
        return password;
    }

    public void setPassword(String password) throws PasswordException {

        if(password == null){
            throw new PasswordException("비밀번호는 NULL일 수 없다.");
        }
        else if( password.length() < 5){
            throw new PasswordException("비밀번호는 5자 이상으로 해야한다.");
        }
        else if (password.matches("[a-zA-Z]+")){
            throw new PasswordException("비밀번호는 숫자나 특수문자를 포함해야 한다.");
        }

        this.password = password;
    }
}
public class week07_p543_05 {

    public static void main(String[] args) {

        PasswordTest test = new PasswordTest();
        String password = null;
        try {
            test.setPassword(password);
            System.out.println("통과");
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }

        password = "abcd";
        try {
            test.setPassword(password);
            System.out.println("통과");
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }

        password = "abcde";
        try {
            test.setPassword(password);
            System.out.println("통과");
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }

        password = "abcde1";
        try {
            test.setPassword(password);
            System.out.println("통과");
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}

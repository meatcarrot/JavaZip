import java.util.*;

public class CDM_비밀번호찾기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputs = input.split(" ");
        ArrayList<String> result = new ArrayList<>();

        for(String i : inputs) {
            if(i.equals("c")) {
                result.add(i);
                break;
            }
            result.add(i);
        }

        for(String i : result) {
            System.out.print(i + " ");
        }
    }
}

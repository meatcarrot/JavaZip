public class PGS_지폐접기 {
    public static int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int wallet_min = Math.min(wallet[0], wallet[1]);
        int wallet_max = Math.max(wallet[0], wallet[1]);
        int bill_min = Math.min(bill[0], bill[1]);
        int bill_max = Math.max(bill[0], bill[1]);

        while(bill_min > wallet_min || bill_max > wallet_max) {
            if(bill[0] > bill[1]) {
                bill[0] = bill[0] / 2;
            } else {
                bill[1] = bill[1] / 2;
            }
            bill_min = Math.min(bill[0], bill[1]);
            bill_max = Math.max(bill[0], bill[1]);

            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] wallet = {50, 50};
        int[] bill = {100, 241};

        System.out.println("return: " + solution(wallet, bill));
    }
}

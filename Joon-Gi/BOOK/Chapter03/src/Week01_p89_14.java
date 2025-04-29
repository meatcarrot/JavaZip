public class Week01_p89_14 {
    public static void main(String[] args) {
        int n = 5;
        int k = ~n;

        System.out.println("원래 값: " + n);
        System.out.println("비트를 반대로 뒤집은 값: " + k);
        System.out.println("이진수로 표현한 원래 값: " + Integer.toBinaryString(n));
        System.out.println("이진수로 표현한 뒤집은 값: " + Integer.toBinaryString(k));

        /*
        * 5를 비트 반전했을 때, 왜 -6이 나올까
        * 1. 5 = 00000000 00000000 00000000 00000101 (32비트)
        * 2. ~5 = 11111111 11111111 11111111 11111010
        * 3. 2번은 2의 보수법에서 음수를 나타냄. 따라서, 이 값이 어떤 음수인지 알기 위해선 2의 보수를 구해봐야함
        *   2번을 다시 비트 반전: 00000000 00000000 00000000 00000101
        *   1을 더함: 00000000 00000000 00000000 00000110 (-> 6)
        *   따라서 원래 값(2번)은 -6을 나타낸다
        * */
    }
}

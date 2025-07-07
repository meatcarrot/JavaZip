package textbook.Week09.Chapter3_자료구조;

// import java.io.BufferedReader;
// import java.io.InputStreamReader;
import java.io.*;
import java.util.StringTokenizer;

public class _003_2_구간_합_구하기_P11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // System.in : 표준 입력 스트림 (바이트 기반)
        // InputStreamReader : 표준 입력 스트림의 바이트 데이터를 문자로 변환해주는 중간 다리
        // BufferedReader : Scanner 보다 훨씬 빠른 입력용 도구.
        // 한 글자씩 읽는게 아니라, 한 줄 단위로 모아서(readLine) 빠르게 처리함.

        // 첫 줄 입력: 5 4
        StringTokenizer st = new StringTokenizer(br.readLine());
        // StringTokenizer : 입력받은 문자열을 공백 단위로 잘라주는 도구
        // br.readLine() : 문자열 한 줄 전체를 입력받는 메서드 (Scanner.nextLine()과 유사)
        // readLine()은 입력 실패할 가능성 있으므로 반드시 예외처리를 해야 함.
        // nextLine()은 내부적으로 예외를 RuntimeException으로 처리하므로 예외처리 하지 않아도 됨

        int number = Integer.valueOf(st.nextToken());
        // nextToken() : StringTokenizer 객체가 문자열을 공백이나 구분자로 나눴을 때, 다음 조각을 꺼내오는 메서드
        int line = Integer.parseInt(st.nextToken());

        // 둘째 줄 입력: 5 4 3 2 1
        st = new StringTokenizer(br.readLine());
        // StringTokenizer는 Scanner와 다르게 입력받을 때마다 new로 다시 만들어야 함
        // Scanner는 입력 스트림(System.in)을 연결해서 계속 읽는 구조 (객체 생성 한번만 해도 됨)
        int[] arr = new int[number + 1];
        for(int i = 1; i <= number; i++) {
            arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());
        }

        int a, b;
        for(int j = 0; j < line; j++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.valueOf(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            System.out.println(arr[b] - arr[a - 1]);
        }
    }
}
// 걸린 시간 1104ms
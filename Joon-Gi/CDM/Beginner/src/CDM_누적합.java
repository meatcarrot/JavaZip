import java.util.*;
import java.io.*;

public class CDM_누적합 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = scanner.nextInt();
        }

        // 리프 노드 개수, n보다 큰 첫번째 2의 배수
        int leafCount = 1;
        while (leafCount < n) {
            leafCount *= 2;
        }

        // 총 노드 개수
        int totalNodes = 2*leafCount-1;
        int[] tree = new int[totalNodes];

        // 리프 노드 채우기
        for (int i=0; i<leafCount; i++) {
            if (i<n) {
                tree[totalNodes - leafCount + i] = input[i];
            } else {
                tree[totalNodes - leafCount + i] = 0;
            }
        }

        // 윗 노드 채우기, 더해야 하기 때문에 아래에서 위로
        for (int i=totalNodes-leafCount-1; i>=0; i--) {
            tree[i] = tree[2*i + 1] + tree[2*i + 2];
        }

        // 각 층별로 출력
        int i = 0;
        int level = 1;
        // int cnt = 0; // 비트 연산자 사용 시 필요
        while (i<totalNodes) {
            // int level = 1 << cnt; // 비트 연산자, 2의 제곱씩 증가
            for (int j=0; j<level; j++) {
                System.out.print(tree[i] + " ");
                i++;
            }
            System.out.println();
            level *= 2;
            // cnt++; // 비트 연산자 사용 시 필요
        }
    }
}

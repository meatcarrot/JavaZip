import java.util.Scanner;

public class CDM_기둥세우기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] palace = new int[n][m];

        int row = 0, col = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                palace[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            boolean need = false;
            for (int j = 0; j < m; j++) {
                if(palace[i][j] == 0) {
                    need = true;
                    break;
                }
            }
            if (!need) {
                row += 1;
            }
        }

        for (int j = 0; j < m; j++) {
            boolean need = false;
            for (int i = 0; i < n; i++) {
                if(palace[i][j] == 0) {
                    need = true;
                    break;
                }
            }
            if (!need) {
                col += 1;
            }
        }

        System.out.println(Math.max(row, col));
    }
}

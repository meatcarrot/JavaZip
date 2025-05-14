class Solution {
    public int[][] solution(int[][] arr) {
        int rowCount = arr.length;
        int colCount = arr[0].length;
        int size = Math.max(rowCount, colCount);  
    
        int[][] result = new int[size][size];

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                result[i][j] = arr[i][j];
            }
        }

        return result;
    }
}

class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] rowsZero = new int[m];
        int[] rowsOne = new int[m];
        int[] colsZero = new int[n];
        int[] colsOne = new int[n];
        int[][] diff = new int[m][n];
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                if (grid[i][j]==0){
                    rowsZero[i]++;
                    colsZero[j]++;
                } else {
                    rowsOne[i]++;
                    colsOne[j]++;
                }
            }
        }
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                diff[i][j] = rowsOne[i]+colsOne[j]-rowsZero[i]-colsZero[j];
            }
        }
        return diff;
    }
}
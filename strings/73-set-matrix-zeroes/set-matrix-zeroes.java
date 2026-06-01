class Solution {
    public void setZeroes(int[][] mat) {

        int rows = mat.length;
        int cols = mat[0].length;

        int[] row = new int[rows];
        int[] col = new int[cols];

        // Mark rows and columns
        for(int i = 0; i < rows; i++) {

            for(int j = 0; j < cols; j++) {

                if(mat[i][j] == 0) {

                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        // Set cells to zero
        for(int i = 0; i < rows; i++) {

            for(int j = 0; j < cols; j++) {

                if(row[i] == 1 || col[j] == 1) {
                    mat[i][j] = 0;
                }
            }
        }
    }
}
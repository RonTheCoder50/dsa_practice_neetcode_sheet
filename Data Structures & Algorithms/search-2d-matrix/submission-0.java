class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //we can binary search on each row -> log n time so with n rows,
        // it will become O(n log n)

        for(int row=0; row < matrix.length; row++) {
            int lp = 0, rp = matrix[0].length-1;
            
            while(lp <= rp) {
                int mid = lp + (rp - lp) / 2;
                if(matrix[row][mid] == target) {
                    return true;
                } else if(matrix[row][mid] < target) {
                    lp = mid+1;
                } else {
                    rp = mid-1;
                }
            }
        }

        return false;
    }
}

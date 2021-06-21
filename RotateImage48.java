public class RotateImage48 {
	public void rotate(int[][] matrix) {
		// 先水平翻转，再对角线翻转
		// 时间击败100.00%，内存击败79.12%
		int n = matrix.length;
		for (int i=0; i<n/2; i++) {
			for (int j=0; j<n; j++) {
				int tmp = matrix[i][j];
				matrix[i][j] = matrix[n-i-1][j];
				matrix[n-i-1][j] = tmp;
			}
		}
		for (int i=0; i<n; i++) {
			for (int j=0; j<i; j++) {
				int tmp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = tmp;
			}
		}
	}
	public void rotate1(int[][] matrix) {
		// 找规律，直接翻转
		// 时间击败100.00%，内存击败54.12%
		int n = matrix.length;
		for (int i=0; i<n/2; i++) {
			for (int j=0; j<(n+1)/2; j++) {
				int tmp = matrix[i][j];
				matrix[i][j] = matrix[n-j-1][i];
				matrix[n-j-1][i] = matrix[n-i-1][n-j-1];
				matrix[n-i-1][n-j-1] = matrix[j][n-i-1];
				matrix[j][n-i-1] = tmp;
			}
		}
	}
}

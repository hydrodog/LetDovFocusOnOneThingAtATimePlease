public class MultiDim {
	public static void main(String[]args) {
		double[][] a = new double[3][3];
		a[1] = new double[4];
		for (int i = 0; i < a.length; ++i) {
			for (int j = 0; j < a[i].length; ++j)
				System.out.print(a[i][j] + " ");
			System.out.println();
		}
	}
}

package src.main.java;

public class Question2_2 {

	public static void main(String[] args) {
		// ソート対象となる配列です。
		int[] arr = {5, 4, 2, 3, 8, 7, 1, 0, 6, 9};
		
		// ソート前の値をコンソールに出力します。
		System.out.print("ソート前：");
		arrayPrintln(arr);
		
		// ソートを実行します。
		quickSort(arr,0, arr.length-1);
		
		// ソート後の値をコンソールに出力します。
		System.out.print("ソート後：");
		arrayPrintln(arr);
	}
	/**
	 * クイックソートを行うメソッドです。
	 * ここに実装してください。
	 */
	public static void quickSort(int[] ans,int left,int right) {
		if (left>=right) {
            return;
        }
        int p = ans[(left+right)/2];
        int l = left, r = right, tmp;
        while(l<=r) {
            while(ans[l] < p) { l++; }
            while(ans[r] > p) { r--; }
            if (l<=r) {
                tmp = ans[l]; ans[l] = ans[r]; ans[r] = tmp;
                l++; r--;
            }
        }
        quickSort(ans, left, r); 
        quickSort(ans, l, right);
	}
	
	/**
	 * 配列の値を順に出力するメソッドです。
	 * 
	 * @param arr 出力対象の配列。
	 * @return 計算結果を配列で返します。
	 */
	public static void arrayPrintln(int[] arr) {
		
		// 配列の値を順に取り出し、コンソールに出力します。
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println("");
	}
}

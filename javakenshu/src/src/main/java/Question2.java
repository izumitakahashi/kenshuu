package src.main.java;

import java.util.Arrays;

public class Question2 {

	public static void main(String[] args) {
		// ソート対象となる配列です。
		int[] arr = {5, 4, 2, 3, 8, 7, 1, 0, 6, 9};
		
		// ソート前の値をコンソールに出力します。
		System.out.print("ソート前：");
		arrayPrintln(arr);
		
		// ソートを実行します。
		quickSort(arr);
		
		// ソート後の値をコンソールに出力します。
		System.out.print("ソート後：");
		arrayPrintln(arr);
	}
	
	/**
	 * クイックソートを行うメソッドです。
	 * ここに実装してください。
	 */
	public static void quickSort(int[] ans) {
		int left=0,right=0,i,j,h,point=0;
		int mark[]=new int[ans.length];
		Arrays.fill(mark, 0);
		label_a:{
			while(true){
				for(h=0;h<ans.length;h++){
					if(mark[h]==0){
						point=ans[h];
						break;
					}else if(h==ans.length-1){
						break label_a;
					}
				}
				for(i=0;i<ans.length;i++){
					if(ans[i]>=point){
						left=ans[i];
						break;
					}
				}
				for(j=ans.length-1;j>=0;j--){
					if(ans[j]<point){
						right=ans[j];
						break;
					}
				}
				if(i<j){
					ans[i]=right;
					ans[j]=left;
				}else{
					mark[i]=1;
				}
			}
		}
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
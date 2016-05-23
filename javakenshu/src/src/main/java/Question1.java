package src.main.java;
import java.util.Arrays;

public class Question1 {

	public static void main(String[] args) {
		String[] ans = new String[9];
		Question1 question1 = new Question1();
		for(int j=1;j<=9;j++){
			ans= question1.multiplication(j);
			System.out.println(Arrays.toString(ans));
		}
	}
	
	/**
	 * 掛け算を実行するメソッドです。
	 * 
	 * @param num1 掛ける値1。
	 * @param num2 掛ける値2。
	 * @return 計算結果を返します。
	 */
	public int multiply(int num1, int num2) {
		int r = 0;
		r=num1*num2;
		return r;
	}
	
	
	/**
	 * 引数に与えられた値の九九の段を計算するメソッドです。
	 * 
	 * @param timesNum 掛ける段の値。
	 * @return 計算結果を配列で返します。
	 */
	public String[] multiplication(int timesNum) {
		String[] calcString = new String[9];	
		int q=0;
		for(int i=1;i<=9;i++){
			q=multiply(timesNum,i);
			if(q<10){
				calcString[i-1]=timesNum+"×"+i+"="+q+" ";
			}
			else
				calcString[i-1]=timesNum+"×"+i+"="+q;
		}
		return calcString;
	}
	
}
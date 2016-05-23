package src.main.java;


public class Flowchar1 {

//	public static void main(String[] args) {
//		String arr[]=new String[100];
//		judge(arr);
//		arrayPrintln(arr);
//	}
	
//	public static void judge(String[] num) {
//		for(int i=1;i<=100;i++){
//			if(i%3==0&&i%5==0){
//				num[i-1]="Fizzbass";
//			}else if(i%3==0){
//				num[i-1]="Fizz";
//			}else if(i%5==0){
//				num[i-1]="bass";
//			}else{
//				num[i-1]=String.valueOf(i);
//			}
//		}
//	}
//	public static void arrayPrintln(int[] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i] + " ");
//		}
//		System.out.println("");
//	}
	public static void main(String[] args) {
		for(int i=1;i<=100;i++){
			if(i%3==0&&i%5==0){
				System.out.println("Fizzbass");
			}else if(i%3==0){
				System.out.println("Fizz");
			}else if(i%5==0){
				System.out.println("bass");
			}else{
				System.out.println(i);
			}
		}
	}
}

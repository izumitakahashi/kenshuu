package src.main.java;

class User{
	String name;
	String email;

	//コンストラクタ（初期化処理）
	User(String name){
		this.name=name;
	}

	void sayHi(){
		System.out.println("Hi I am"+this.name);
	}
}

class SuperUser extends User{
	SuperUser(String name){
		super(name);
	}
	//メソッドのオーバーライド
	void sayHi(){
		System.out.println("Hiiiiiiiiiiiii I am"+this.name);
	}
}	

public class hello{
	public static void main(String[] args){
		User tom=new User("tom");
		SuperUser bob=new SuperUser("bob");
		tom.sayHi();
		bob.sayHi();
	}
}
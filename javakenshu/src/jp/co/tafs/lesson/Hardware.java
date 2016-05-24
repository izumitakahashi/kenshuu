package jp.co.tafs.lesson;
import java.util.*;

public class Hardware {

	private String hardwareName="PlayStation4";
	private String hardwareMaker="ソニー";
	private String hardwareNetwork="有り";
	private String hardwareRelease="2014/2/22";
	private int hardwarePrice=39800;
	private boolean hardwarePower=false;
	private static String hardwareSoft;
	
	static List<String> SoftwareList = Arrays.asList(null,null,null,null,null);
	
	public void gamePlay() {
		if(hardwareSoft==null){
			System.out.println(hardwareName+"にゲームが入ってない");
			System.out.println("ゲームできねえ");//hardwareSoftがnullのとき
		}else{
			System.out.println(hardwareName+"で"+hardwareSoft+"をプレイ中");
			System.out.println("めっさ楽しい");//感想

		}
	}
	
	public void hardwarePowerOn(){
		if(hardwarePower==false){
			hardwarePower=true;
		}
	}
	
	public void hardwarePowerOff(){
		if(hardwarePower==true){
			hardwarePower=false;
		}
	}
	
	public void gameSoftIn(String gameSoft){
		if(hardwareSoft=="nothing"){
			hardwareSoft=gameSoft;
		}
	}
	
	public void gameSoftOut(){
		if(hardwareSoft!="nothing"){
			hardwareSoft="nothing";
		}
	}
	
	public boolean checkhardwarePower(){
		return hardwarePower;
	}
	
	public String checkhardwareSoft(){
		if(hardwareSoft=="nothing")
			return null;
		else
			return hardwareSoft;
	}

//この辺更新
	public static List<String> getSoftList() {
		return SoftwareList;
	}

	public void selectSoft(String softName){
		for(int i=0;i<5;i++){
			if(SoftwareList.get(i)==softName){
				hardwareSoft=softName;
				System.out.println(softName+"に切り替えました\n");
				break;
			}else if(i==4){
				hardwareSoft=null;//HDD内にないソフトに切り替えるとnullを入れる
				System.out.println("そのソフトはHDD内にありません\n");
			}
		}
	}
	
	public void activeSoft(){
		System.out.println("アクティブなソフト："+hardwareSoft);
	}
	
	public String getHardwareName() {
		return hardwareName;
	}
	
	public void setHardwareName(String hardwareName) {
		this.hardwareName = hardwareName;
	}

	public String getHardwareMaker() {
		return hardwareMaker;
	}

	public void setHardwareMaker(String hardwareMaker) {
		this.hardwareMaker = hardwareMaker;
	}

	public String getHardwareNetwork() {
		return hardwareNetwork;
	}

	public void setHardwareNetwork(String hardwareNetwork) {
		this.hardwareNetwork = hardwareNetwork;
	}

	public String getHardwareRelease() {
		return hardwareRelease;
	}

	public void setHardwareRelease(String hardwareRelease) {
		this.hardwareRelease = hardwareRelease;
	}

	public int getHardwarePrice() {
		return hardwarePrice;
	}

	public void setHardwarePrice(int hardwarePrice) {
		this.hardwarePrice = hardwarePrice;
	}

	public boolean isHardwarePower() {
		return hardwarePower;
	}

	public void setHardwarePower(boolean hardwarePower) {
		this.hardwarePower = hardwarePower;
	}

	public String getHardwareSoft() {
		return hardwareSoft;
	}

	public static void setHardwareSoft(String soft) {
		hardwareSoft = soft;
	}
}

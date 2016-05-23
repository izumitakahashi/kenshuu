package jp.co.tafs.lesson;

public class Hardware {

	private String hardwareName="PlayStation4";
	private String hardwareMaker="ソニー";
	private String hardwareNetwork="有り";
	private String hardwareRelease="2014/2/22";
	private int hardwarePrice=39800;
	private boolean hardwarePower=false;
	private String hardwareSoft="nothing";
	
	public void gamePlay() {
		System.out.println(hardwareName+"で"+hardwareSoft+"をプレイ中");
		System.out.println("めっさ楽しい");//感想
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

	public void setHardwareSoft(String hardwareSoft) {
		this.hardwareSoft = hardwareSoft;
	}
}

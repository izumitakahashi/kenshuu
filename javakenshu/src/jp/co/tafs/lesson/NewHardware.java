package jp.co.tafs.lesson;

public class NewHardware extends Hardware {
	
	String SoftwareList[] = new String[5];
	private String hardwareSoft="nothing";
	
	public void gameSoftIn(String gameSoft){
		for(int i=0;i<5;i++){
			
			if(SoftwareList[i]==gameSoft){
				hardwareSoft=gameSoft;
				break;
			}else if(SoftwareList[i]==null){
				SoftwareList[i]=gameSoft;
				hardwareSoft=gameSoft;
				break;
			}
		}
	}
	
	public void gameSoftOut(){
		for(int i=0;i<5;i++){
			if(SoftwareList[i]!=null){
				SoftwareList[i]=null;
				break;
			}
		}
		
	}

	public void gameSoftOut(String gameSoft){
		for(int i=0;i<5;i++){
			if(SoftwareList[i]==gameSoft){
				SoftwareList[i]=null;
				break;
			}
		}
	}

}

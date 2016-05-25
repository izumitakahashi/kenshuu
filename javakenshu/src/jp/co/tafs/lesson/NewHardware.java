package jp.co.tafs.lesson;
import java.util.*;


public class NewHardware extends Hardware {
	
	public void gameSoftIn(String gameSoft){
		for(int i=0;i<5;i++){
			if(Objects.equals(SoftwareList.get(i),gameSoft)){
				setHardwareSoft(gameSoft);
				break;
			}else if(Objects.equals(SoftwareList.get(i),null)){
				SoftwareList.set(i,gameSoft);
				setHardwareSoft(gameSoft);
				break;
			}else if(i==4){
				System.out.println("5本以上インストールするこどはできません");
			}
		}
	}
	
	public void gameSoftOut(){
		for(int i=0;i<5;i++){
			if(!(Objects.equals(SoftwareList.get(i),null))){
				SoftwareList.set(i,null);
				break;
			}
		}
		
	}

	public void gameSoftOut(String gameSoft){
		for(int i=0;i<5;i++){
			if(Objects.equals(SoftwareList.get(i),gameSoft)){
				SoftwareList.set(i,null);
				break;
			}
		}
	}

}

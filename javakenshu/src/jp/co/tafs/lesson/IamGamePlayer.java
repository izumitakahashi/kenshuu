package jp.co.tafs.lesson;

import jp.co.tafs.lesson.Hardware;

public class IamGamePlayer {

	public static void main(String[] arg){
		Hardware hd=new Hardware();//インスタンス化
		NewHardware nhd=new NewHardware();
		
		System.out.println("ハード名："+hd.getHardwareName());
		System.out.println("ハードウェアメーカー："+hd.getHardwareMaker());
		System.out.println("ネットワーク："+hd.getHardwareNetwork());
		System.out.println("発売日："+hd.getHardwareRelease());
		System.out.println("価格："+hd.getHardwarePrice()+"\n");
		
		if(hd.checkhardwarePower()==false){ //電源チェック
			System.out.println("電源が入ってないのでONにします\n");
			hd.hardwarePowerOn();
		}else{
			System.out.println("電源は入っています\n");
		}
		
//		if(hd.checkhardwarePower()==false){ //電源チェック
//			throw new IllegalArgumentException ("電源を入れてください");
//		}else{
//			System.out.println("電源が入ってないのでONにします");
//		}
		
//		if(hd.checkhardwareSoft() == null){ //ソフトが入ってるかチェック
//			String gameSoft="ダクソ3";//ゲームソフト名を入力
//			System.out.println("ソフトが入ってないので"+gameSoft+"を入れます");
//			hd.gameSoftIn(gameSoft);
//		}else{
//			System.out.println("ソフトは"+hd.checkhardwareSoft()+"が入ってます");
//		}
		String gameSoft="パワプロ2016";//ソフト１
		nhd.gameSoftIn(gameSoft);
		gameSoft="ダクソ3";//ソフト２
		nhd.gameSoftIn(gameSoft);
		gameSoft="龍が如く極";//ソフト３
		nhd.gameSoftIn(gameSoft);
		gameSoft="ディスガイア5";//ソフト４
		nhd.gameSoftIn(gameSoft);
		gameSoft="スト5";//ソフト５
		nhd.gameSoftIn(gameSoft);
		System.out.println("HDD内のソフト");
		System.out.println(Hardware.getSoftList()+"\n");//一覧表示
		
		String select="ダクソ3";//ゲームタイトルでアクティブなソフトを指定
		
		hd.selectSoft(select);
		
		hd.gamePlay();//あそぶ
		
		System.out.println("\n\nこのレッスンは難しかったですが楽しかったです。");
	}
}

package Dinosaours;

import java.util.Scanner;

public class Tavuk extends Dinosaour {

	public String GetName() {
		final String  newName="Cabbar";
		System.out.println("TAVUGUNUZUN İSMİ"+newName);
		return newName;
		
	}

	@Override
	public void Speak() {
		
		System.out.println(gıdaklama());
		
	}

	private String gıdaklama() {
		return "GID GID GIDAK";
		
	}

	@Override
	public void Eat() {
		System.out.println("Tavuk Her Şeyi Yer TAVUK BİLE");
		
	}

	@Override
	public void Run() {
		System.out.println("Tavuk Koşuyor");
		
	}
	public void Fly() {
		Scanner s= new Scanner(System.in);
		System.out.println("Tavugun başı belada mı ");
		boolean El=s.hasNextBoolean();
		if(El == true) {
			System.err.println("TAVUK UÇUYOR ULAN");
		}else if(El == false) {
			System.err.println("Tavuklar sadece beladan uçarak kaçar");
		}
	}

}

package Dinosaours;

import java.util.Scanner;

public class Raptor extends Dinosaour {


	public String GetName() {
		final String  newName="Ökkeş";
		System.out.println("RAPTORUN İSMİ :"+newName);
		return newName;
		
	}

	@Override
	public void Speak() {
		System.out.println("Raptorlar Konuşamaz ufak şekilde kükrer");
		
	}

	@Override
	public void Eat() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Yemek Olarak ET Mi yiyor??");
		boolean vegetable= sc.hasNextBoolean();
		if(vegetable == true) {
			System.out.println("Raptor ET YİYOR");
		}else if(vegetable == false) {
			System.out.println("Raptorlar SEBZE SEVMEZ");
		}
		
	}

	@Override
	public void Run() {
		
		Scanner s= new Scanner(System.in);
		System.out.println("RAPTORUN KOŞU HIZINI GİRİNİZ");
		int Speed= s.nextInt();
		
		System.out.println("RAPTORLAR ÇOK HIZLI KOŞAR: HIZINIZ "+Speed);
		
		
	}

}

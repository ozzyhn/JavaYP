package Dinosaours;

import java.util.Scanner;

public class Trex extends Dinosaour {
	
	
	public String GetName() {
		Scanner scaner = new Scanner(System.in);
		System.out.println("Trexinizin ismini giriniz");
		String  newName=scaner.nextLine();
		System.out.println("TREXİNİZ İSMİ"+newName);
		return newName;
		
	}
	

	@Override
	public void Speak() {
		System.out.println("TREX KÜKRER ONLAR KONUŞMAZ");
		
	}

	@Override
	public void Eat() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Yemek Olarak ET Mi yiyor??");
		boolean vegetable= sc.nextBoolean();
		if(vegetable == true) {
			System.out.println("Trex ET YİYOR");
		}else if(vegetable== false) {
			System.out.println("TREX SEBZE SEVMEZ");
		}
		
	}

	@Override
	public void Run() {
		System.out.println("TREX Koşuyor Bence Kaç");
		
	}
	public void sırtınıKaşı() {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Trexin Elleri kısa mı? ");
		boolean El=s.hasNextBoolean();
		if(El == true) {
			System.err.println("TREXİN ELLERİ ÇOK KISA SIRTINA YETİŞMİYOR");
		}else if(El == false) {
			System.err.println("Bunun Trex Olduğuna emin misin?");
		}
	}


}

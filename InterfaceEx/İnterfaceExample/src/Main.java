import Interface.Futbolcu;
import Interface.GencYetenek;
import Interface.TeknikAdam;



public class Main {
	public static void main(String []args) {
		
	 //NormalTopçu();
	 //YetenekliTopçu();
	 Yönet();
	 
	}
	private static void Yönet() {
		TeknikAdam teknik= new TeknikAdam();
		Futbolcu Futbol = new Futbolcu();
		teknik.TakımıYönet();
		
		System.out.println("Yıldız Oyuncu Bunları yapabilir -----------------------------");
		teknik.TakımaOyuncuAl(new GencYetenek());
		
		System.out.println("NORMAL OYUNCU BUNLARI YAPABİLİR-----------------------------------");
		teknik.NormalOyuncuAl(new Futbolcu());
		
	}
	private static void YetenekliTopçu() {

		GencYetenek genç= new GencYetenek();
		genç.calımAt();
		genç.güzelGiyin();
		
	}
	private static void NormalTopçu() {
		Futbolcu fut= new Futbolcu();
		fut.formagiy();
		fut.kramponbağla();
		fut.pasAt();
		fut.şutAt();
		
	}



	

}

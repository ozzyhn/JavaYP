import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass
{
	public static void main(String[] args)
	{
		// castOrnek2();
		castOrnek3();
	}

	private static Kart getCard(int i)
	{
		// çok kötü örnek
		if (i == 1)
		{
			return new Kart();
		}
		if (i == 2)
		{
			return new BankaKarti();
		}
		if (i == 3)
		{
			return new KrediKarti();
		}
		if (i == 4)
		{
			return new PlatinKart();
		}
		return null;
	}

	private static void castOrnek3()
	{
		Kart anakart = new Kart();
		BankaKarti bankaKarti = new BankaKarti();
		KrediKarti krediKarti = new KrediKarti();
		PlatinKart platinKart = new PlatinKart();
		doStuff(anakart);
		doStuff(bankaKarti);
		doStuff(krediKarti);
		doStuff(platinKart);
		Kart yeniKart = new KrediKarti();
		doStuff(yeniKart);
	}

	private static void doStuff(Kart kart)
	{
		// instaceof yerine getclass ile kontrol etmek mantıklıdır
		if (kart instanceof PlatinKart)
		{
			PlatinKart platinKart = (PlatinKart) kart;
			platinKart.platinKartiOzelMetod();
		}
		else if (kart instanceof KrediKarti)
		{
			KrediKarti krediKarti = (KrediKarti) kart;
			krediKarti.krediKartiOzelMetod();
		}
		else if (kart instanceof BankaKarti)
		{
			BankaKarti bankaKarti = (BankaKarti) kart;
			bankaKarti.bankaKartiOzelMetod();
		}
		else
		{
			kart.anaKartOzelMetod();
		}
	}

	private static void castOrnek2()
	{
		// kardeş sınıflar birbirlerin yerine geçemez
		// mantiksiz ornekler
		Kart anakart = new Kart();
		BankaKarti bankaKarti = new BankaKarti();
		KrediKarti krediKarti = new KrediKarti();
		PlatinKart platinKart = new PlatinKart();
		// Cannot cast from KrediKarti to BankaKarti
		// bankaKarti = (BankaKarti) krediKarti;
		// java.lang.ClassCastException, runtime anında
		// bankaKarti = (BankaKarti) anakart;
		// bu ikisinde sıkıntı yok
		// anakart = platinKart;
		// krediKarti = platinKart;
		// ((PlatinKart) krediKarti).platinKartiOzelMetod();
		// ((KrediKarti) platinKart).krediKartiOzelMetod();
		// sağ taraf sol tarafın kendisi veya aşağısı olmalı aşağıdaki iki örnek
		// BankaKarti bKart = new Kart();
		// Kart krt = bankaKarti;
	}

	private static void castOrnek1()
	{
		List<String> liste = new ArrayList<>();
		ArrayList<String> liste2 = (ArrayList<String>) liste;
		// ---------------- //
		AbstractList<String> liste3 = new ArrayList<>();
		ArrayList<String> liste4 = (ArrayList<String>) liste3;
		// ---------------- //
		ArrayList<String> liste5 = new ArrayList<>();
		// cast 'e ihtiyaç yok ama saçma
		List<String> liste6 = liste5;
		// ---------------- //
		Cloneable clnbl = new ArrayList<String>();
		ArrayList<String> liste7 = (ArrayList<String>) clnbl;
		// ---------------- //
		Object o = new Scanner(System.in);
		if (o.getClass() == Scanner.class)
		{
			Scanner scn = (Scanner) o;
		}
	}
}

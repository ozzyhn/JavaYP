import javax.swing.JTextField;

import human.Erkek;
import human.Human;
import human.Kadin;
import kart.BankaKarti;
import kart.Kart;
import kart.KrediKarti;
import kart.PlatinKart;

public class Mainclass
{
	public static void main(String[] args)
	{
		// ornek1();
		// ornek2();
		ornek3();
	}

	private static void ornek3()
	{
		new Erkek().getIsim();
	}

	private static void ornek2()
	{
		// abstract sınıflar new yapılamazlar !!!
		// anonymous class
//		Human h = new Human()
//		{
//			@Override
//			public void konus()
//			{
//			}
//		};
		Human h = new Kadin();
		h.konus();
	}

	class H extends Human
	{
		@Override
		public void konus()
		{
		}
	}

	class Abuziddin extends H
	{
		@Override
		public void konus()
		{
		}
	}

	class Okkes extends Abuziddin
	{
		@Override
		public void konus()
		{
		}
	}

	private static void ornek1()
	{
//		Kart kart = new Kart(1234);
//		BankaKarti bKart = new BankaKarti(1234);
//		bKart.getBakiye();
//		KrediKarti kKart = new KrediKarti(1234);
//		PlatinKart pKart = new PlatinKart(1234);
//		pKart.info();
		// ----------
		// kendisi ve aşağısı kuralı
//		Kart k = new Kart(1234);
//		k = new BankaKarti(1234);
//		k = new KrediKarti(1234);
//		k = new PlatinKart(1234);
//		KrediKarti kKart = new PlatinKart(1234);
		doStuff(new PlatinKart(1234));
		// subclass >= superclass
	}

	private static void doStuff(Kart k)
	{
		if (k.getClass() == PlatinKart.class)
		{
			System.err.println("Kart is a platin kart");
		}
		if (k.getClass() == BankaKarti.class)
		{
		}
		if (k.getClass() == KrediKarti.class)
		{
			System.err.println("Kart is a kredi kart");
		}
		else
		{
		}
		// instanceof maliyetlidir
//		if (k instanceof PlatinKart)
//		{
//			System.err.println("Kart is a platin kart");
//			PlatinKart pKart = (PlatinKart) k;
//			pKart.info();
//		}
//		else if (k instanceof KrediKarti)
//		{
//			System.err.println("Kart is a kredi kart");
//		}
//		else if (k instanceof BankaKarti)
//		{
//		}
	}
}

class MyField extends JTextField
{
	private String isim;
}
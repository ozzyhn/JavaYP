
public class MainClass
{
	public static void main(String[] args)
	{
		// stringislemi();
		// immutabilityExample();
		// varyasyonlar();
		varyasyonlar2();
	}

	private static void varyasyonlar2()
	{
		// string metodları her seferinde yeni referanslara gider
		String lol = "lol";
		System.err.println(lol.toUpperCase() == lol);
		System.err.println(lol.toUpperCase() == lol.toUpperCase());
		System.err.println(lol.toUpperCase().equals(lol));
		System.err.println(lol.toUpperCase().equals(lol.toUpperCase()));
		System.err.println(lol.toUpperCase().equalsIgnoreCase(lol));
		System.err.println(lol.toUpperCase().equalsIgnoreCase(lol.toLowerCase()));
	}

	private static void varyasyonlar()
	{
		String a = "asd";
		String b = new String(a);
		String c = new String("asd");
		String d = a.substring(0);
		String e = "a" + "s" + "d";
		// == ile referansları kıyaslanır, equals ile değerleri
//		System.out.println("a == e -> " + (a == e));
//		System.out.println("a == b -> " + (a == b));
//		System.out.println("b == c -> " + (b == c));
//		System.out.println("a == c -> " + (a == c));
//		System.out.println("a == d -> " + (a == d));
//		System.out.println("c == e -> " + (c == e));
//		System.out.println("d == e -> " + (d == e));
//		System.out.println("a == \"asd\" -> " + (a == "asd"));
//		System.out.println("b == \"asd\" -> " + (b == "asd"));
//		System.out.println("c == \"asd\" -> " + (c == "asd"));
//		System.out.println("d == \"asd\" -> " + (d == "asd"));
//		System.out.println("e == \"asd\" -> " + (e == "asd"));
//		System.out.println("a.equals(\"asd\") -> " + a.equals("asd"));
//		System.out.println("b.equals(\"asd\") -> " + b.equals("asd"));
//		System.out.println("c.equals(\"asd\") -> " + c.equals("asd"));
//		System.out.println("d.equals(\"asd\") -> " + d.equals("asd"));
//		System.out.println("d.equals(\"asd\") -> " + e.equals("asd"));
		// string içerisinde equals ezilmiş ve karakter karakter karşılaştırma yapıyor
		// string 'ler immutable 'dır ve her seferinde yeni string nesnesi üretir
//		System.out.println("a.equals(b) -> " + a.equals(b));
//		System.out.println("a.equals(c) -> " + a.equals(c));
//		System.out.println("a.equals(d) -> " + a.equals(d));
//		System.out.println("a.equals(e) -> " + a.equals(e));
//		System.out.println("b.equals(c) -> " + b.equals(c));
//		System.out.println("b.equals(d) -> " + b.equals(d));
//		System.out.println("b.equals(e) -> " + b.equals(e));
//		System.out.println("c.equals(d) -> " + c.equals(d));
//		System.out.println("c.equals(e) -> " + c.equals(e));
//		System.out.println("d.equals(e) -> " + d.equals(e));
//		String isim = "deniz";
//		String isim2 = "şeniz";
//		isim2 = isim2.replace("ş", "d");
//		System.err.println(isim2);
//		System.err.println(isim == isim2);
//		System.err.println(isim.equals(isim2));
	}

	private static void immutabilityExample()
	{
		String temp = "seda";
		String temp2 = "seda";
		System.err.println(temp == temp2);
		temp += "t";
		temp2 += "t";
//		temp = "sedat";
//		temp2 = "sedat";
		System.err.println(temp);
		System.err.println(temp2);
		System.err.println(temp == temp2);
		System.err.println(temp.equals(temp2));
	}

	private static void stringislemi()
	{
		String sonuc = "";
		StringBuilder builder = new StringBuilder();
		long milis = System.currentTimeMillis();
//		for (int i = 0; i < 300000; i++)
//		{
//			sonuc += "a";
//		}
		long milis2 = System.currentTimeMillis();
		System.err.println("işlem bitti => " + (milis2 - milis) + " - " + sonuc.length());
		sonuc = "";
		// -----------------
		milis = System.currentTimeMillis();
		for (int i = 0; i < 300000000L; i++)
		{
			builder.append("a");
		}
		sonuc = builder.toString();
		milis2 = System.currentTimeMillis();
		System.err.println("işlem bitti => " + (milis2 - milis) + " - " + sonuc.length());
	}
}

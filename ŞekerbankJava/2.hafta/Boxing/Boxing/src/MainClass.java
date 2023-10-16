
public class MainClass
{
	public static void main(String[] args)
	{
		// Integer sayi = null;
//		int primitivesayi = Integer.valueOf(null);
//		ornek4(primitivesayi);
		ornek5();
	}

	private static void ornek5()
	{
		Integer a = 127;
		Integer b = 127;
		Integer c = new Person(129).getSayi();
		Integer d = new Person(129).getSayi();
		System.out.println(a == b); // true
		System.out.println(c <= d); // true
		System.out.println(c >= d); // true
		System.out.println(c == d); // false
	}

	private static void ornek4(int sayi)
	{
		// hiçbir şekilde null gelemiyor zaten
		if (sayi > 5)
		{
		}
	}

	private static void ornek3(Integer sayi)
	{
		if (sayi > 5)
		{
		}
	}

	private static void ornek2()
	{
		// unnecessary boxing
		Integer sayi = Integer.valueOf(3);
		int sayi2 = Integer.valueOf(4);
		int sayi3 = new Integer(21312312);
	}

	private static void ornek1()
	{
		int primitiveSayi = 4;
		Integer sayi = primitiveSayi;
		primitiveSayi = sayi;
		// sayi.intValue()
		sayi = 6;
	}
}

class Person
{
	private Integer sayi;

	public Person(Integer sayi)
	{
		this.sayi = sayi;
	}

	public Integer getSayi()
	{
		return sayi;
	}
}

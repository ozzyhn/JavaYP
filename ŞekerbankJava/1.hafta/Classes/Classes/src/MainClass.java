
public class MainClass
{
	public static void main(String[] args)
	{
		// Person p = new Person(12, "Faruk");
		Person p = new Person();
		System.err.println(p.yas);
		System.err.println(p.isim);
		p.isim = "numan";
		p.konus();
		p.konus("mesaj");
	}
}
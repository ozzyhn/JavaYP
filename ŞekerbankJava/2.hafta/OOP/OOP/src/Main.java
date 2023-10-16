import Abstraction.Vehicle;
import Encapsulation.Person;

public class Main
{
	public static void main(String[] args)
	{
		// ornek1();
		// ornek2();
		ornek3();
	}

	private static void ornek3()
	{
		Immutability.Vehicle v = new Immutability.Vehicle("audi");
		Immutability.Person p = new Immutability.Person("123", v);
		System.err.println(p.getVehicle().getModel());
		System.err.println(v);
		p.getVehicle().setModel("mercedes");
		System.err.println(p.getVehicle().getModel());
		System.err.println(v);
	}

	private static void ornek2()
	{
		Vehicle v = new Vehicle();
		v.lastikSayisi = 4;
		v.lastikHavasi = true;
		v.setBenzin(10);
		v.git();
	}

	private static void ornek1()
	{
		Person p = new Person();
		p.setTC("12321321");
		System.err.println(p.getTC());
	}
}
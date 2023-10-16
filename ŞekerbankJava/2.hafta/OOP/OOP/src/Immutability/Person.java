package Immutability;

public class Person
{
	// 1. değişken private olacak
	// 2. setter metod yazılmayacak
	// 3. değişken final olacak
	// 4. class final olabilir

	private String isim;
	private final String TCKimlik;
	private final Vehicle vehicle;

	public Person(String tcKimlik, Vehicle vehicle)
	{
		this.TCKimlik = tcKimlik;
		this.vehicle = vehicle;
	}

	public Vehicle getVehicle()
	{
		return vehicle;
	}

	public String getTCKimlik()
	{
		return TCKimlik;
	}

	public String getIsim()
	{
		return isim;
	}
}
package Abstraction;

public class Vehicle
{
	public int lastikSayisi;
	public boolean lastikHavasi;
	private double benzinMiktari;

	public void setBenzin(double miktar)
	{
		this.benzinMiktari += miktar;
	}

	public double getBenzinMiktari()
	{
		return benzinMiktari;
	}

	/**
	 * Lastik sayisi 4 olacak havası true olacak benzin 0 dan büyük olacak
	 */
	public void git()
	{
		if (lastikSayisi != 4)
		{
			System.err.println("4 adet lastik gerekmektedir.");
		}
		else if (!lastikHavasi)
		{
			System.err.println("Lastiklerin havası yok");
		}
		else if (benzinMiktari == 0.0)
		{
			System.err.println("Benzin yok");
		}
		else
		{
			System.err.println("Araba gidiyor");
		}
	}
}
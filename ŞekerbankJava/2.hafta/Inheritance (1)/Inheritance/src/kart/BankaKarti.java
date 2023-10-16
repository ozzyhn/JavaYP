package kart;

public class BankaKarti extends Kart
{
	public BankaKarti(Integer kartNo)
	{
		super(kartNo);
	}

	private int bakiye;

	public void setKartSahibi(String kartSahibi)
	{
		this.kartSahibi = kartSahibi;
	}

	@Override
	public void alisveris(int miktar)
	{
		if (bakiye > miktar)
		{
			bakiye -= miktar;
			System.err.println("Banka karti alışveriş");
		}
	}

	public int getBakiye()
	{
		return bakiye;
	}

	public void setBakiye(int bakiye)
	{
		this.bakiye = bakiye;
	}

}
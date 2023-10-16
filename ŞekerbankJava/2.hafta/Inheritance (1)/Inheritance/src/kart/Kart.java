package kart;

public class Kart
{
	private String sifre;
	protected String kartSahibi;
	private final Integer kartNo;

	public Kart(Integer kartNo)
	{
		this.kartNo = kartNo;
	}

	public Kart(String sifre, String kartSahibi, Integer kartNo)
	{
		this.sifre = sifre;
		this.kartSahibi = kartSahibi;
		this.kartNo = kartNo;
	}

	protected void alisveris(int miktar)
	{
		System.err.println("Kart sınıfından alışveriş yapılamaz, lütfen extend ederek kullanınız");
	}

	public Integer getKartNo()
	{
		return kartNo;
	}

	public void setSifre(String sifre)
	{
		this.sifre = sifre;
	}

	public String getSifre()
	{
		System.err.println("get şifre yapılıyor");
		return sifre;
	}
}
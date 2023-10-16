package human;

public abstract class Human
{
	private String isim;

	public Human()
	{
		System.err.println("Human new yapılıyor");
	}

	// abstract metod sadece abstract sınıfta bulunabilir
	// abstract metod mutlaka subclass ta override edilmek zorundadır
	public abstract void konus();

	// abstract sınıfta abstract olmayan metod bulunabilir
	public String getIsim()
	{
		// nasıl olsa override edilecek olduğu için abstract metod çağırılabiliyor
		// konus();
		return isim;
	}

	public void setIsim(String isim)
	{
		this.isim = isim;
	}
}
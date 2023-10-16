package Aile;

public class Cocuk implements Anne, Baba, FircaAtabilir
{
	private String isim;

	public void setIsim(String isim)
	{
		this.isim = isim;
	}

	@Override
	public String toString()
	{
		return isim;
	}

	@Override
	public void ozleme()
	{
		System.err.println("hem annemi hem babamı özledim");
	}

	@Override
	public void YKromozom()
	{
	}

	@Override
	public void XKromozom()
	{
	}

	@Override
	public void nefesAlma()
	{
	}

	@Override
	public void fircaAt()
	{
	}
}
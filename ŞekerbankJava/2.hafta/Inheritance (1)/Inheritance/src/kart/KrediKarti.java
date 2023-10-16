package kart;

import java.util.ArrayList;

public class KrediKarti extends Kart
{
	private int limit = 50000;
	private ArrayList<Integer> ekstre = new ArrayList<>();

	public KrediKarti(Integer kartNo)
	{
		// subclass 'lar super classların constructor larına saygı duymak zorunda
		super(kartNo);
		// super mutlaka ilk satırda
		System.err.println("Kredi kartı new yapılıyor");
	}

	@Override
	public void alisveris(int miktar)
	{
		if (limit - miktar > 0)
		{
			ekstre.add(miktar);
			limit -= miktar;
			System.err.println("kredi kartından alışveriş yapılıyor");
		}
	}

	@Override
	public void setSifre(String sifre)
	{
		System.err.println("kredi kartının şifresi set edilemez");
	}

	public void setLimit(int limit)
	{
		this.limit = limit;
	}

	public int getLimit()
	{
		return limit;
	}
}
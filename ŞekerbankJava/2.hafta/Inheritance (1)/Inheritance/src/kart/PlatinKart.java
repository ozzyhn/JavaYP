package kart;

public class PlatinKart extends KrediKarti
{
	// bir class sadece 1 class ı extend eder
	public PlatinKart(Integer kartNo)
	{
		super(kartNo);
		setLimit(100000000);
	}

	public String info()
	{
		// yukarıya doğru gidip ilk bulduğu override ı çalıştıroyr
		return super.getSifre();
	}
}

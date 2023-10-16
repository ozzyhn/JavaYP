package Encapsulation;

public class Person
{
	// model, entity, POJO, class
	private String isim;
	private Integer yas;
	private Boolean cinsiyet;
	private String TC;

	public void setTC(String tC)
	{
		TC = tC;
	}

	public String getTC()
	{
		return "xxxx";
	}

	public Integer getYas()
	{
		if (cinsiyet)
		{
			return yas;
		}
		else
		{
			return null;
		}
	}

	public void setYas(Integer yas)
	{
		this.yas = yas;
	}

	public Boolean getCinsiyet()
	{
		return cinsiyet;
	}

	public void setCinsiyet(Boolean cinsiyet)
	{
		this.cinsiyet = cinsiyet;
	}

	public String getIsim()
	{
		return isim;
	}

	public void setIsim(String isim)
	{
		this.isim = isim;
	}

}
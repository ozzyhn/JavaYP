import Actor.Actor;
import Actor.Comedy;
import Actor.Korku;
import Actor.Scenario;
import Aile.Anne;
import Aile.Baba;
import Aile.Canli;
import Aile.Cocuk;

public class MainClass
{
	public static void main(String[] args)
	{
		// ornek1();
		// ornek2();
		ornek3();
	}

	private static void ornek3()
	{
		Actor act = new Actor();
		act.Act(new Scenario()
		{
			@Override
			public void oyna()
			{
				System.err.println("Yeni senaryo");
			}
		});
		act.Act(new Korku());
		act.Act(new Comedy());
//		act.Act(1);
//		act.Act(2);
//		act.Act(3);
	}

	private static void ornek2()
	{
		Cocuk c = new Cocuk();
		c.setIsim("awdasd");
		System.err.println(c);
	}

	private static void ornek1()
	{
		Cocuk c = new Cocuk();
		c.ozleme();
		System.err.println(c instanceof Anne);
		System.err.println(c instanceof Baba);
		System.err.println(c instanceof Canli);
	}
}

//abstract class deneme implements Anne
//{
//}
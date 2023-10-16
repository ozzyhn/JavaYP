import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class MainClass
{
	public static void main(String[] args)
	{
		// ornek1(6, 3);
		// bolmeIslemi(7, 0);
		try
		{
			ornek10();
		}
		catch (MyCheckedException e)
		{
			e.printStackTrace();
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
//		catch (EOFException e) // fırlatılmayan checked exception yakalanamaz
//		{
//			e.printStackTrace();
//		}
		try
		{
			ornek11();
		}
		catch (ArithmeticException e)
		{
		}
	}

	private static void ornek11() throws MyUnCheckedException
	{
		throw new MyUnCheckedException("Hata oluştu");
	}

	private static void ornek10() throws FileNotFoundException, MyCheckedException
	{
		Person p = new Person();
		p.yas = 110;
		if (p.yas > 100)
		{
			throw new MyCheckedException("Yaş 100 'den fazla olamaz");
		}
		FileReader reader = new FileReader("C://text.txt");
	}

	private static void ornek9()
	{
		try
		{
			recursive();
		}
		catch (Error e)
		{
			System.err.println(e.getClass());
		}
	}

	private static void recursive()
	{
		recursive();
	}

	private static void ornek8()
	{
		try
		{
			// birden fazla catch multicatch ile yazilabilir
			if (new Random().nextBoolean())
			{
				if (new Random().nextBoolean())
				{
					int sayi = 7 / 0;
				}
				else
				{
					List<String> liste = new ArrayList<>();
					LinkedList<String> liste2 = (LinkedList<String>) liste;
				}
			}
			else
			{
				ArrayList<String> liste = null;
				liste.add("hamit");
			}
		}
		catch (NullPointerException | ArithmeticException e)
		{
			// NullPointerException veya ArithmeticException
			System.err.println(e.getLocalizedMessage());
			e.printStackTrace();
		}
		/*
		 * catch (ClassCastException e) { System.err.println(e.getMessage()); }
		 */
		catch (Exception e)
		{
			System.err.println("Tepeden exception yakaladim");
		}
	}

	private static void ornek7()
	{
		// sıralama önemli, bu multicatch değil
		try
		{
			// asagidan yukari birden fazla catch blogu yazilabilir
			if (new Random().nextBoolean())
			{
				if (new Random().nextBoolean())
				{
					int sayi = 7 / 0;
				}
				else
				{
					List<String> liste = new ArrayList<>();
					LinkedList<String> liste2 = (LinkedList<String>) liste;
				}
			}
			else
			{
				ArrayList<String> liste = null;
				liste.add("deniz");
			}
		}
		catch (NullPointerException e)
		{
			System.err.println(e.getLocalizedMessage());
		}
		catch (ArithmeticException e)
		{
			System.err.println("Sayı 0 'a bolunmez");
		}
		catch (Exception e)
		{
			System.err.println("Tepeden exception yakaladim");
		}
//		catch (Error e)
//		{
//		}
	}

	private static void ornek6()
	{
		try
		{
			if (new Random().nextBoolean())
			{
				int sayi = 7 / 0;
			}
			else
			{
				ArrayList<String> liste = null;
				liste.add("erdi");
			}
		}
		catch (Exception e)
		{
			// bu hoş değil
			if (e instanceof NullPointerException)
			{
				System.err.println(e.getLocalizedMessage());
			}
			else if (e instanceof ArithmeticException)
			{
				System.err.println("Sayı 0 'a bolunmez");
			}
			else
			{
				System.err.println("Bir hata oldu ama allah bilir ne oldu");
			}
		}
	}

	private static void ornek5()
	{
		// ic ice try catch
		try
		{
			try
			{
				try
				{
				}
				catch (Exception e)
				{
				}
				finally
				{
				}
			}
			catch (Exception e)
			{
				try
				{
				}
				catch (Exception ex)
				{
				}
				finally
				{
				}
			}
			finally
			{
			}
		}
		catch (Exception e)
		{
			try
			{
			}
			catch (Exception ex)
			{
			}
			finally
			{
			}
		}
		finally
		{
			try
			{
			}
			catch (Exception e)
			{
				try
				{
				}
				catch (Exception ex)
				{
				}
				finally
				{
				}
			}
			finally
			{
			}
		}
	}

	private static double bolmeIslemi(int i, int j)
	{
		Integer temp = 1000;
		String isim = "Derya";
		double sonuc;
		try
		{
			temp = 5000;
			isim = "Tuba";
			sonuc = i / j;
			System.err.println("Catch 'e dusmedik");
		}
		catch (Exception e)
		{
			// temp tekrar 1000 'e atanmaz, bizim atamamiz gerekir
			// bir anlamda rollback
			temp = 1000;
			isim = "Derya";
			sonuc = 0;
			System.err.println("Catch 'e dustuk");
			// hata alsam da finally 'ye düşerim
			// sonuc = i / j;
		}
		finally
		{
			// try 'da olsa catch de olsa calisacak
			// nereden geldiğini bilimyorum
			System.err.println("Islem tamamlandi");
			// sonuc = i / j;
		}
		System.err.println(isim);
		System.err.println(temp);
		return sonuc;
	}

	private static void ornek1(int sayi1, int sayi2)
	{
		ornek2(sayi1, sayi2);
	}

	private static void ornek2(int sayi1, int sayi2)
	{
		ornek3(sayi1, sayi2);
	}

	private static void ornek3(int sayi1, int sayi2)
	{
		/*
		 * StackTraceElement[] stck = Thread.getAllStackTraces().get(Thread.currentThread()); for (StackTraceElement stackTraceElement : stck) { System.err.println(stackTraceElement); }
		 */
		// bu da olabilir
		// new Exception("sdfsdsdf").printStackTrace();
		int k = sayi1 / sayi2;
		System.err.println(k);
	}
}

class Person
{
	public int yas;
}
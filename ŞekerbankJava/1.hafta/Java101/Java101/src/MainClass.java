public class MainClass
{
	public static void main(String[] args)
	{
		// ornek1();
		// ornek2();
		// ornek3();
		// ornek4();
		// ornek5();
		// ornek6();
		// ornek7();
		ornek8();
	}

	private static void ornek8()
	{
		int sayi = 12;
		do
		{
			sayi++;
			// en az 1 kere mutlaka çalışır
		}
		while (sayi > 5);
	}

//	enum LEVEL
//	{
//		HIGH, MEDIUM, LOW
//	}

	enum LEVEL
	{
		HIGH(1), MEDIUM(2), LOW(3);

		private int deger;

		public int getDeger()
		{
			return deger;
		}

		LEVEL(int deger)
		{
			this.deger = deger;
		}
	}

	private static void ornek7()
	{
		LEVEL myLevel = LEVEL.MEDIUM;
		Integer sayi = myLevel.getDeger();
		if (myLevel == LEVEL.HIGH)
		{
			System.err.println("HIGH level");
		}
		if (myLevel == LEVEL.MEDIUM)
		{
			System.err.println("MEDIUM level");
		}
		if (myLevel == LEVEL.LOW)
		{
			System.err.println("LOW level");
		}
	}

	private static void ornek6()
	{
		int yas = 23;
		// System.err.println(yas > 60 ? "yaşlı" : yas < 18 ? "ergen" : "orta yaşlı");
//		if (yas < 60 && yas > 18)
//		{
//			System.err.println("orta yas");
//		}
//		else
//		{
//			if (yas < 18)
//			{
//				System.err.println("ergen");
//			}
//			else if (yas > 60)
//			{
//				System.err.println("yaşlı");
//			}
//		}
		// ------------------
		if (yas > 60)
		{
			System.err.println("yaşlı");
		}
		else if (yas < 18)
		{
			System.err.println("ergen");
		}
		else
		{
			System.err.println("orta yas");
		}
		// ------------------
//		if (yas < 18)
//		{
//			System.err.println("ergen");
//		}
//		else
//		{
//			if (yas > 60)
//			{
//				System.err.println("yaşlı");
//			}
//			else
//			{
//				System.err.println("orta yas");
//			}
//		}
	}

	private static void ornek5()
	{
		Integer[] sayilar =
		{ 1, 2, 3 };
//		for (int i = 0; i < sayilar.length; i++)
//		{
//			Integer sayi = sayilar[i];
//		}
		for (Integer sayi : sayilar)
		{
			System.err.println(sayi);
		}
	}

	private static void ornek4()
	{
//		for (int i = 0, j = 0; i < 10; i++, j++)
//		{
//		}
//		for (int i = 0; i < 10; i++)
//		{
//			if (i == 5)
//			{
//				break;
////				continue;
//			}
//			System.err.println(i);
//		}
		int i = 0;
		while (i < 10)
		{
			if (i == 5 || i == 8)
			{
				i++;
				continue;
			}
			System.err.println(i);
			i++;
		}
	}

	private static void ornek3()
	{
		Integer sayilar[][][] = new Integer[3][3][3];
		sayilar[0] = new Integer[][]
		{
				{ 1, 2, 3 },
				{ 4, 5, 6 },
				{ 7, 8, 9 } };
		sayilar[1] = new Integer[][]
		{
				{ 10, 20, 30 },
				{ 40, 50, 60 },
				{ 70, 80, 90 } };
		sayilar[2] = new Integer[][]
		{
				{ 100, 200, 300 },
				{ 400, 500, 600 },
				{ 700, 800, 900 } };
		// -------------
		// System.err.println(sayilar[2][2][0]);
		// -------------
		for (int i = 0; i < sayilar.length; i++)
		{
			for (int j = 0; j < sayilar[i].length; j++)
			{
				for (int k = 0; k < sayilar[i][j].length; k++)
				{
					System.err.print(sayilar[i][j][k] + " ");
				}
				System.err.println();
			}
			System.err.println();
		}
	}

	private static void ornek2()
	{
		// 3 e 4 lük dizi [3][4]
		// 1, 2, 3, 4
		// 5, 6, 7, 8
		// 9, 10, 11, 12
//		Integer[][] sayilar = new Integer[][]
//		{ new Integer[]
//				{ 1, 2, 3 }, new Integer[]
//				{ 1, 2, 3, 4 } };
		// ----------------
		Integer[][] sayilar = new Integer[3][3];
		sayilar[0] = new Integer[]
		{ 12, 23, 34, 45 };
		sayilar[1] = new Integer[]
		{ 6, 7, 8 };
		// ----------------
//		int[][] sayilar =
//		{
//				{ 1, 3, 5, 7 },
//				{ 9, 11, 13 } };
		for (int i = 0; i < sayilar.length; i++)
		{
			for (int j = 0; j < sayilar[i].length; j++)
			{
				System.err.print(sayilar[i][j] + " ");
			}
			System.err.println();
		}
	}

	private static void ornek1()
	{
		/*
		 * String[] isim = { "numan", "berke", "batuhan" };
		 */
		Integer[] sayilar =
		{ 1, 2, 3, 4 };
		Integer[] sayilar2 = new Integer[6];
		sayilar2[0] = 3;
		sayilar2[1] = 4;
		for (int i = 0; i < sayilar2.length; i++)
		{
			System.err.println(sayilar2[i]);
		}
	}
}
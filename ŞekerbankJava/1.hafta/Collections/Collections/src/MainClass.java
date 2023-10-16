import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

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
		// ornek9();
		// ornek10();
		// ornek11();
		// ornek12();
		ornek15();
	}

	private static void ornek15()
	{
		HashMap<Person, Vehicle> kisiler = new HashMap<>();
		Person p = new Person(12, "asd");
		kisiler.put(p, new Vehicle("audi"));
		System.err.println(kisiler.get(p).model);
		kisiler.put(p, new Vehicle("mercedes"));
		System.err.println(kisiler.get(p).model);
		// ---------------
//		HashMap<Vehicle, Person> araclar = new HashMap<>();
//		Vehicle v = new Vehicle("audi");
//		araclar.put(v, new Person(12, "zxcv"));
//		System.err.println(araclar.get(v).isim);
//		araclar.put(v, new Person(45, "fbvbn"));
//		System.err.println(araclar.get(v).isim);
	}

	private static void ornek14()
	{
		HashMap<Integer, HashMap<String, Object>> kisiler = new HashMap<>();
		HashMap<String, Object> person = new HashMap<>();
		person.put("id", 1);
		person.put("isim", "Sedanur");
		person.put("yas", 23);
		person.put("TC", "12312312321");
		kisiler.put(1, person);
		HashMap<String, Object> person2 = new HashMap<>();
		person2.put("id", 2);
		person2.put("isim", "Erdi");
		person2.put("yas", 25);
		kisiler.put(2, person);
	}

	private static void ornek13()
	{
		HashMap<Integer, Person> kisiler = new HashMap<>();
		kisiler.put(1, new Person(23, "Sedanur"));
		kisiler.put(2, new Person(25, "Erdi"));
		kisiler.put(3, new Person(34, "Hüseyin"));
	}

	private static void ornek12()
	{
		// map listesi = database
		HashMap<String, Object> person = new HashMap<>();
		person.put("id", 1);
		person.put("isim", "Sedanur");
		person.put("yas", 23);
		person.put("TC", "12312312321");
		HashMap<String, Object> person2 = new HashMap<>();
		person2.put("id", 2);
		person2.put("isim", "Erdi");
		person2.put("yas", 25);
		ArrayList<HashMap<String, Object>> liste = new ArrayList<>();
		liste.add(person);
		liste.add(person2);
		System.err.println(liste);
	}

//	class Tuple
//	{
//		public Object element1;
//		public Object element2;
//	}

	private static void ornek11()
	{
		HashMap<Integer, String> kisiler = new HashMap<>();
		kisiler.put(1, "Erdi");
		kisiler.put(2, "Süleyman");
		kisiler.put(3, "Emre");
//		System.err.println(kisiler);
		kisiler.put(2, "Furkan");
//		System.err.println(kisiler);
//		for (Entry<Integer, String> cift : kisiler.entrySet())
//		{
//			System.err.println(cift.getKey() + " - " + cift.getValue());
//		}
//		for (Integer key : kisiler.keySet())
//		{
//			System.err.println("key: " + key + " value: " + kisiler.get(key));
//		}
//		for (String val : kisiler.values())
//		{
//			System.err.println("value: " + val);
//		}
	}

	private static void ornek10()
	{
		// aman dikkat
		Set<Person> kisiler = new HashSet<>();
		kisiler.add(new Person(12, "asd"));
		kisiler.add(new Person(12, "asd"));
		kisiler.add(new Person(12, "asd"));
		System.err.println(kisiler);
	}

	private static void ornek9()
	{
		HashSet<String> kisiler = new HashSet<>();
		kisiler.add("numan");
		kisiler.add("numan");
		kisiler.add("hamit");
		kisiler.add("numan");
		kisiler.add("numan");
		kisiler.add("numan");
		kisiler.add("hamit");
		kisiler.add("hamit");
		kisiler.add("numan");
		for (String string : kisiler)
		{

		}
		System.err.println(kisiler);
	}

	private static void ornek8()
	{
		Queue<String> kuyruk = new ArrayDeque<>();
		kuyruk.add("a1");
		kuyruk.add("a2");
		kuyruk.add("a3");
		System.err.println(kuyruk.poll());
		System.err.println(kuyruk.poll());
		System.err.println(kuyruk.poll());
	}

	private static void ornek7()
	{
		Stack<String> kisiler = new Stack<>();
		kisiler.push("a1");
		kisiler.push("a2");
		kisiler.push("a3");
		kisiler.push("a4");
		System.err.println(kisiler.pop());
		System.err.println(kisiler.pop());
		System.err.println(kisiler.peek());
		System.err.println(kisiler.peek());
		System.err.println(kisiler.peek());
		System.err.println(kisiler.peek());
		System.err.println(kisiler.pop());
		System.err.println(kisiler.pop());
	}

	private static void ornek6()
	{
		// burada bir eksik var
		ArrayList<Person> liste = new ArrayList<>();
		liste.add(new Person(23, "asd"));
		// liste.remove(new Person(23, "asd"));
		System.err.println(liste.contains(new Person(23, "asd")));
		// System.err.println(liste);
//		for (Person person : liste)
//		{
//			System.err.println(person.isim);
//		}
	}

	private static void ornek5()
	{
		// LinkedList sıra garantisi verir
		// LinkedList<String> kisiler = new LinkedList<>();
		LinkedList<Integer> sayilar = new LinkedList<>();
		sayilar.add(3);
		sayilar.add(6);
		sayilar.add(9);
		sayilar.addFirst(12);
		// sayilar.poll();
		// sayilar.pop();
//		 System.err.println(sayilar.getLast());
		System.err.println(sayilar);
		/*
		 * for (Integer integer : sayilar) {
		 * 
		 * }
		 */
		// sayilar.get(23);
	}

	private static void ornek4()
	{
		ArrayList<Integer> sayilar = new ArrayList<>();
		sayilar.add(3);
		sayilar.add(6);
		sayilar.add(9);
		// index olarak silmeye çalışmasın diye
		sayilar.remove((Integer) 6);
		// sayilar.remove(6);
		System.err.println(sayilar);
	}

	private static void ornek3()
	{
		ArrayList<String> isimler = new ArrayList<>();
		isimler.add("Deniz");
		isimler.add("Ahmet");
		isimler.add("Numan");
		isimler.add("Zehra");
		isimler.add("Buğra");
		// arrays ve collections sınıfları
		Collections.sort(isimler);
		System.err.println(isimler);
	}

	private static void ornek2()
	{
		// String[] isimler = new String[12];
		ArrayList<String> isimler = new ArrayList<>();
		isimler.add("Deniz");
		isimler.add("23");
		String isim = isimler.get(1);
		System.err.println(isim);
		System.err.println(isimler.contains("Deniz"));
	}

	private static void ornek1()
	{
		// String[] isimDizi = new String[] { "asd", "asd" };
		// System.err.println(isimDizi);
		ArrayList<String> isimler = new ArrayList<String>();
		isimler.add("Ahmet");
		isimler.add("Sedanur");
		isimler.add("Furkan");
		// isimler.add(3);
		// isimler.add(true);
		// isimler.add(new Scanner(System.in));
		// isimler.remove("Ahmet");
		// isimler.remove(0);
		System.err.println(isimler);
		System.err.println(isimler.size());
//		for (String isim : isimler)
//		{
//			System.err.println(isim);
//		}
	}
}

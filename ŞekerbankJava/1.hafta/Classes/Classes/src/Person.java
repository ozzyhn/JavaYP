
public class Person
{
	// bir class 'ın kişiliği ve karakteri olur
	// class nedir ne yapar sorularının cevabı olmalı
	int yas;
	String isim;

//	public Person()
//	{
//	}
//
//	public Person(int yas, String isim)
//	{
//		this.yas = yas;
//		this.isim = isim;
//		System.err.println("Person New yapılıyor");
//	}

	public void konus()
	{
		System.err.println(isim + " konuşuyor");
	}

	// <access modifier> (static final ..vs) <return type> <method name> <parameters>
	public void konus(String mesaj)
	{
		// overload (aynı metod imzası ile farklı parametre alamaktır)
		System.err.println(isim + " konuşuyor " + mesaj);
	}
}
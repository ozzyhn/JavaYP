import Dinosaours.Raptor;
import Dinosaours.Tavuk;
import Dinosaours.Trex;

public class Main {
	
	
	public static void main (String[]args) {
		
		//ornek1();
		ornek2();
		//ornek3();
	}

	private static void ornek3() {
		new Tavuk().GetName();
		new Tavuk().Eat();
		new Tavuk().Speak();
		new Tavuk().Run();
		new Tavuk().Fly();
		
	}

	private static void ornek2() {
		
		new Trex().Eat();
		new Trex().Speak();
		new Trex().Run();
		new Trex().sırtınıKaşı();
		new Trex().GetName();
		
	}

	private static void ornek1() {
		// new Raptor().GetName();
		//new Raptor().Eat();
		//new Raptor().Speak();
		//new Raptor().Run();
		
	}

}

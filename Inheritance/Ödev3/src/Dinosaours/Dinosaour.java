package Dinosaours;

abstract public class Dinosaour {
	
	public abstract  void Speak();
	public abstract  void Eat();
	public abstract  void Run();
	
	public String DinoName;
	
	public Dinosaour() {
		
	}

	public Dinosaour(String DinoName) {
		this.DinoName=DinoName;
	}
	
	public String getDinoName() {
		return DinoName;
	}
	public void SetDinoName(String DinoName) {
		this.DinoName=DinoName;
	}
	

}

package Interface;

public class TeknikAdam   {
	
	Futbolcu Futbol;
	public void TakımıYönet() {
		System.out.println("Oyuncuların Kendilerini Takıma verip"
				+ " vermediklerini Kontrol et bu senin Görevin");
		
	}

	public void TakımaOyuncuAl(GencYetenek Yıldız) {
		
		Yıldız.calımAt();
		Yıldız.taraftarCostur();
		
	}
	public void NormalOyuncuAl(Futbolcu futbol ) {
		
		Futbol.formagiy();
		Futbol.pasAt();
	}



	

}


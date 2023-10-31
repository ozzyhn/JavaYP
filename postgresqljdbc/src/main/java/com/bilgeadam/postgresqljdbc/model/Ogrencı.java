package com.bilgeadam.postgresqljdbc.model;

public class Ogrencı {
	
	private long ID;
	private String NAME;
	private int OGR_NUMBER;
	private int YEAR;
	
	public Ogrencı() {
		
	}
	public Ogrencı(long iD, String nAME, int oGR_NUMBER, int yEAR) {
		super();
		ID = iD;
		NAME = nAME;
		OGR_NUMBER = oGR_NUMBER;
		YEAR = yEAR;
	}

	
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public int getOGR_NUMBER() {
		return OGR_NUMBER;
	}
	public void setOGR_NUMBER(int oGR_NUMBER) {
		OGR_NUMBER = oGR_NUMBER;
	}
	public int getYEAR() {
		return YEAR;
	}
	public void setYEAR(int yEAR) {
		YEAR = yEAR;
	}
	
	
	@Override
	public String toString() {
		return "Ogrencı [ID=" + ID + ", NAME=" + NAME + ", OGR_NUMBER=" + OGR_NUMBER + ", YEAR=" + YEAR + "]";
	}


}

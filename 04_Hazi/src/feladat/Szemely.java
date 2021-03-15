package feladat;

public class Szemely {
	private String nev;
	private int suly;
	private double magassag;

	public double setTesttomeg() {
		double tti = 0;
		tti = (double)this.suly / (this.magassag * this.magassag);
		return tti;
	}

	public String setAlkat() {
		if (setTesttomeg() < 18.5) {
			return "sovany";
		} else if (setTesttomeg() > 25) {
			return "kover";
		}

		return "normal";
	}
	
	public String getAdatok() {
		return "Nev: " + this.nev + " suly: " + this.suly + " magassag: " + this.magassag +" "+ setTesttomeg() +" "+ setAlkat();
	}

	public String getNev() {
		return nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public int getSuly() {
		return suly;
	}

	public void setSuly(int suly) {
		this.suly = suly;
	}

	public double getMagassag() {
		return magassag;
	}

	public void setMagassag(double magassag) {
		this.magassag = magassag;
	}

}

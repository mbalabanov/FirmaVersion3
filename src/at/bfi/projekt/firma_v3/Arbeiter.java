package at.bfi.projekt.firma_v3;

class Arbeiter extends Mitarbeiter {

	private double stundenlohn;
	private int anz_stunden;
	private double schicht_Zulage;
	private double ortszuschlag;

	public Arbeiter() {
	}

	/**
	 * @param id
	 */
	public Arbeiter(int id) {
		super(id);
	}

	/**
	 * @param id
	 * @param name
	 * @param stundenlohn
	 * @param anz_stunden
	 * @param schicht_Zulage
	 * @param ortszuschlag
	 */
	public Arbeiter(int id, String name, double stundenlohn, int anz_stunden, double schicht_Zulage,
			double ortszuschlag) {
		super(id, name);
		this.stundenlohn = stundenlohn;
		this.anz_stunden = anz_stunden;
		this.schicht_Zulage = schicht_Zulage;
		this.ortszuschlag = ortszuschlag;
	}

	public double berechneBrutto() {
		double brutto = (stundenlohn * anz_stunden) + schicht_Zulage + ortszuschlag;
		return brutto;
	}

	/**
	 * @return
	 */
	public double getStundenlohn() {
		return stundenlohn;
	}

	/**
	 * @param stundenlohn
	 */
	public void setStundenlohn(double stundenlohn) {
		this.stundenlohn = stundenlohn;
	}

	/**
	 * @return
	 */
	public int getOrtszuschlag() {
		return anz_stunden;
	}

	/**
	 * @param ortszuschlag
	 */
	public void setOrtszuschlag(int ortszuschlag) {
		this.ortszuschlag = ortszuschlag;
	}

	/**
	 * @return
	 */
	public int getAnz_stunden() {
		return anz_stunden;
	}

	/**
	 * @param anz_stunden
	 */
	public void setAnz_stunden(int anz_stunden) {
		this.anz_stunden = anz_stunden;
	}

	/**
	 * @return
	 */
	public double getSchicht_Zulage() {
		return schicht_Zulage;
	}

	/**
	 * @param schicht_Zulage
	 */
	public void setSchicht_Zulage(double schicht_Zulage) {
		this.schicht_Zulage = schicht_Zulage;
	}

	@Override
	public String ausgabe() {
		return "\nArbeiter\n========\nId: " + getId() + "\nName: " + getName() + "\nStundenlohn: "
				+ String.format("%.2f", stundenlohn) + "\nAnzahl der Stunden: " + anz_stunden + "\nSchichtzulage: "
				+ String.format("%.2f", ortszuschlag) + "\nSchichtzulage: " + String.format("%.2f", schicht_Zulage)
				+ "\nBrutto: " + berechneBrutto();
	}

}

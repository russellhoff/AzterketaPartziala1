package program.partziala1;

public class Ordua {

	private int ordua;
	private int minutua;
	
	public Ordua(int pOrdua, int pMinutua){
		this.ordua = pOrdua;
		this.minutua = pMinutua;
	}

	public int getOrdua() {
		return ordua;
	}

	public void setOrdua(int ordua) {
		this.ordua = ordua;
	}

	public int getMinutua() {
		return minutua;
	}

	public void setMinutua(int minutua) {
		this.minutua = minutua;
	}

	@Override
	public String toString() {
		return "Ordua [ordua=" + ordua + ", minutua=" + minutua + "]";
	}

	/**
	 * 
	 * Ordu hau beste ordua baino geroago baldin bada esaten du.
	 * 
	 * @param sarrera
	 * @return
	 */
	public boolean geroagoDa(Ordua pBesteOrdua) {
		/*
		 	Zer egin behar dugu? Bi orduan minutuetara pasatu eta esan geroago bada ala ez.
		 	Ordu bat handiagoa da beste bat baino, baldin eta bere ordu guztia minututan handiagoa baldin bada.
		 */
		return this.minutuetara() > pBesteOrdua.minutuetara();
	}

	/**
	 * Ordu guztia minutuetara pasatzen du.
	 * @return Ordua minututan
	 */
	public int minutuetara() {
		return (ordua*60)+minutua;
	}
	
}

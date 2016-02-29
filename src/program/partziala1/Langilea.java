package program.partziala1;

public class Langilea {
	
	/**
	 * Langilearen NAN zenbakia (letrarik gabe, integer bada gero)
	 */
	private int nan;
	private SarreraIrteeraZerrenda zerrenda;
	
	/**
	 	Aldagai honetan gordeko dugu langilearen sartutako denborarik handiena, data zehatz batean. 
	 	Hasieran eta denbora hori kalkulatu gabe dagoenean, balioa -1 izango da. Behin kalkulatuta, 
	 	suposatzen da gutxienez minutu bakar bat eman dituela (seguru aski 1 baino handiagoa izango da balio hori).
	 */
	private int egunGuztietanSarreraIrteeretanSartutakoDenborarikHandiena = -1;
	
	public Langilea(int pNan){
		this.nan = pNan;
		this.zerrenda = new SarreraIrteeraZerrenda();
	}

	public int getNan() {
		return nan;
	}

	public void setNan(int nan) {
		this.nan = nan;
	}

	public SarreraIrteeraZerrenda getZerrenda() {
		return zerrenda;
	}

	public void setZerrenda(SarreraIrteeraZerrenda zerrenda) {
		this.zerrenda = zerrenda;
	}

	@Override
	public String toString() {
		return "Langilea [nan=" + nan + ", zerrenda=" + zerrenda + "]";
	}

	public boolean besteLangileBainoOrduGehiagoSartuAlDitu(int pUrtea, int pHilabetea, int pEguna, Langilea pBesteLangilea) {

		int nireDenboraHandiena = this.kalkulatuDenborarikHandiena(pUrtea, pHilabetea, pEguna);
		int bestearenDenborarikHandiena = pBesteLangilea.kalkulatuDenborarikHandiena(pUrtea, pHilabetea, pEguna);
		
		if(nireDenboraHandiena >= bestearenDenborarikHandiena){
			// Nire denbora bestearena baino handiagoa edo berdina baldin bada, true bueltatuko dugu...
			return true;
		}else{
			// ...bestela, false (besteak eman duen debora handiagoa da, ez berdina ezta txikiagoa)
			return false;
		}
	}

	private int kalkulatuDenborarikHandiena(int pUrtea, int pHilabetea, int pEguna) {
		if(this.egunGuztietanSarreraIrteeretanSartutakoDenborarikHandiena == -1){
			this.egunGuztietanSarreraIrteeretanSartutakoDenborarikHandiena = kalkulatuDeborarikHandienaEgunean(pUrtea, pHilabetea, pEguna);
		}
		
		return this.egunGuztietanSarreraIrteeretanSartutakoDenborarikHandiena;
		
	}

	private int kalkulatuDeborarikHandienaEgunean(int pUrtea, int pHilabetea, int pEguna) {
		return zerrenda.kalkulatuDeborarikHandienaEgunean(pUrtea, pHilabetea, pEguna);
	}
	
}

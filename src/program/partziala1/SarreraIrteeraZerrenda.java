package program.partziala1;

import java.util.ArrayList;
import java.util.Iterator;

public class SarreraIrteeraZerrenda {
	
	private ArrayList<SarreraIrteera> zerrenda;
	
	public SarreraIrteeraZerrenda(){
		this.zerrenda = new ArrayList<SarreraIrteera>();
	}

	public ArrayList<SarreraIrteera> getZerrenda() {
		return zerrenda;
	}

	public void setZerrenda(ArrayList<SarreraIrteera> zerrenda) {
		this.zerrenda = zerrenda;
	}
	
	private Iterator<SarreraIrteera> getIteradorea(){
		return this.zerrenda.iterator();
	}

	public int kalkulatuDeborarikHandienaEgunean(int pUrtea, int pHilabetea, int pEguna) {

		Iterator<SarreraIrteera> itr = getIteradorea();
		SarreraIrteera luzeena = null, egungoSarreraIrteera = null;
		
		boolean dataHandiagoaDa = false;
		
		while(itr.hasNext() && !dataHandiagoaDa){
			egungoSarreraIrteera = itr.next();
			
			if(egungoSarreraIrteera.dataHandiagoDa(pUrtea, pHilabetea, pEguna)){
				dataHandiagoaDa = true;
			}else{
				if(egungoSarreraIrteera.dataBerbera(pUrtea, pHilabetea, pEguna)){
					if(luzeena == null || egungoSarreraIrteera.denboraGehiagoSartuDu(luzeena)){
						luzeena = egungoSarreraIrteera;
					}
				}
			}
		}
		
		return luzeena.zenbatMinutuSartuDitut();
	}

	public void addSarreraIrteera(SarreraIrteera pSarreraIrteera) {
		this.zerrenda.add(pSarreraIrteera);
	}
	
}

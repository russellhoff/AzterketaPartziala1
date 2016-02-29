package program.partziala1;

public class SarreraIrteera {

	private Data data;
	private Ordua sarrera;
	private Ordua irteera;
	
	public SarreraIrteera(Data pData, Ordua pSarrera, Ordua pIrteera){
		this.data = pData;
		this.sarrera = pSarrera;
		this.irteera = pIrteera;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public Ordua getSarrera() {
		return sarrera;
	}

	public void setSarrera(Ordua sarrera) {
		this.sarrera = sarrera;
	}

	public Ordua getIrteera() {
		return irteera;
	}

	public void setIrteera(Ordua irteera) {
		this.irteera = irteera;
	}

	@Override
	public String toString() {
		return "SarreraIrteera [data=" + data + ", sarrera=" + sarrera + ", irteera=" + irteera + "]";
	}

	public boolean dataBerbera(int pUrtea, int pHilabetea, int pEguna) {
		return data.dataBerbera(pUrtea, pHilabetea, pEguna);
	}
	
	public boolean dataHandiagoDa(int pUrtea, int pHilabetea, int pEguna){
		return data.dataHandiagoDa(pUrtea, pHilabetea, pEguna);
	}

	public boolean denboraGehiagoSartuDu(SarreraIrteera luzeena) {
		if(this.zenbatMinutuSartuDitut() >= luzeena.zenbatMinutuSartuDitut()){
			return true;
		}else{
			return false;
		}
	}

	public int zenbatMinutuSartuDitut() {

		/*
		 	Kontuan izan behar dugu ondorengo kasua:
		 	
		 	Sartzeko ordua ateratzeko ordua baino handiagoa baldin bada, ezin dezakegu kenketa edo gehiketa sinple bat egin.
		 	
		 	Adibidez:
		 	
		 		- [Kasu 1] sarrera 14:00 <-> irteera 22:00
		 			Kasu honeta irteera sarrera baino handiagoa da eta EZ DA EGUN BAT PASATU. Beraz, gehiketa sinplea egin dezakegu:
		 				irteera.minutuetara()=1320 - sarrera.minutuetara()=840 ==> 480 minutu
		 		- [Kasu 2] sarrera 22:00 <-> irteera 6:00
		 			Kasu honeta sarrera irteera baino handiagoa da, ezin dezakegu beste kasuarena egin. Honetan, bi kenketa eta gehiketa bat egin beharko dugu:
		 				(gauekoHamabiak.minutuetara()=1440 - sarrera.minutuetara()=1320)==>120 + irteera.minutuetara()=360 ==> 480 minutu
		 	
		 */
		
		if(irteera.geroagoDa(sarrera)){
			return irteera.minutuetara() + sarrera.minutuetara();
		}else{
			return (new Ordua(24, 0).minutuetara() - sarrera.minutuetara()) + irteera.minutuetara();
		}
		
	}
	
}

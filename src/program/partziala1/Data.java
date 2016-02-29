package program.partziala1;

public class Data {

	private int urtea;
	private int hilabetea;
	private int eguna;
	
	public Data(int pUrte, int pHilabetea, int pEguna){
		this.urtea = pUrte;
		this.hilabetea = pHilabetea;
		this.eguna = pEguna;
	}

	public int getUrtea() {
		return urtea;
	}

	public void setUrtea(int urtea) {
		this.urtea = urtea;
	}

	public int getHilabetea() {
		return hilabetea;
	}

	public void setHilabetea(int hilabetea) {
		this.hilabetea = hilabetea;
	}

	public int getEguna() {
		return eguna;
	}

	public void setEguna(int eguna) {
		this.eguna = eguna;
	}

	@Override
	public String toString() {
		return "Data [urtea=" + urtea + ", hilabetea=" + hilabetea + ", eguna=" + eguna + "]";
	}

	/**
	 * 
	 * Data berbera duen ala ez esaten du. Sartutako data 3 parametro gisa sartuko dira.
	 * 
	 * @param pUrtea Konparatzeko urtea.
	 * @param pHilabetea Konparatzeko hilabetea.
	 * @param pEguna Konparatzeko eguna
	 * @return True data berbera baldin bada, false ezberdina izanez gero.
	 */
	public boolean dataBerbera(int pUrtea, int pHilabetea, int pEguna) {
		return this.urtea==pUrtea && this.hilabetea==pHilabetea && this.eguna==pEguna;
	}

	public boolean dataHandiagoDa(int pUrtea, int pHilabetea, int pEguna) {
		if(this.urtea > pUrtea){
			return true;
		}else if(this.urtea < pUrtea){	
			return false;
		}else{
			if(this.hilabetea > pHilabetea){
				return true;
			}else if(this.hilabetea < pHilabetea){
				return false;
			}else{
				if(this.eguna > pEguna){
					return true;
				}else if(this.eguna < pEguna){
					return false;
				}else{
					return false;
				}
			}
		}
	}

}

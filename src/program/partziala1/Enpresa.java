package program.partziala1;

/**
 * 
 * Singleton patroia jarraitzen duen klasea, Enpresa bat errepresentatzen du, alegia.
 * 
 * @author Jon Inazio
 *
 */
public class Enpresa {

	private static Enpresa nireEnpresa = null;
	private LangileZerrenda langileak;
	
	private Enpresa(){
		this.setLangileak(new LangileZerrenda());
	}
	
	public static Enpresa getNireEnpresa(){
		if(nireEnpresa == null){
			nireEnpresa = new Enpresa();
		}
		
		return nireEnpresa;
	}

	public LangileZerrenda getLangileak() {
		return langileak;
	}

	public void setLangileak(LangileZerrenda langileak) {
		this.langileak = langileak;
	}

	/**
	 * Pantailan inprimatuko ditu langile guztiak.
	 */
	@Override
	public String toString() {
		return "Enpresa [langileak=" + langileak + "]";
	}
	
	public Langilea dataXOrduGehienSartuDituenLang(int pUrtea, int pHilabetea, int pEguna){
		return langileak.dataXOrduGehienSartuDituenLang(pUrtea, pHilabetea, pEguna);
	}
	
}

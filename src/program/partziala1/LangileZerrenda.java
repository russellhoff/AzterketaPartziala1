package program.partziala1;

import java.util.ArrayList;
import java.util.Iterator;

public class LangileZerrenda {

	private ArrayList<Langilea> langileak;
	
	public LangileZerrenda(){
		this.setLangileak(new ArrayList<Langilea>());	
	}

	public ArrayList<Langilea> getLangileak() {
		return langileak;
	}

	public void setLangileak(ArrayList<Langilea> langileak) {
		this.langileak = langileak;
	}

	@Override
	public String toString() {
		return "LangileZerrenda [langileak=" + langileak + "]";
	}

	public Langilea dataXOrduGehienSartuDituenLang(int pUrtea, int pHilabetea, int pEguna) {

		// Aldagai honetan, ordu gehien sartu dituen langilea gordeko eta bueltatuko dugu
		Langilea orduGehienSartuDituenLangilea = null;
		
		// Lehenik iteradorea lortuko dugu
		Iterator<Langilea> itr = getIteradorea();
		
		// Langile guztiak aztertzeko aldagaia
		Langilea egungoLangilea = null;
		
		/*
		   Orain, langile guztiak aztertuko ditugu, GUZTI GUZTIAK
		 */
		while(itr.hasNext()){
			
			egungoLangilea = itr.next();
			
			if(orduGehienSartuDituenLangilea == null){
			
				/*
				  	orduGehienSartuDituenLangilea null bada, hasieran gaude. Beraz, egungoLangilea
				  	izango da (orain arte) ordu gehien sartu dituen langile bakarra.
				 */
				orduGehienSartuDituenLangilea = egungoLangilea;
				
			}else{
				
				/*
				 	orduGehienSartuDituenLangilea ez bada null, langile zehatz bat izango da. Beraz, 
				 	konparaketa egin beharko dugu hori eta egungoLangilea-rekin batera, ea zeinek sartu dituen
				 	ordu gehien
				 */
				
				if(egungoLangilea.besteLangileBainoOrduGehiagoSartuAlDitu(pUrtea, pHilabetea, pEguna, orduGehienSartuDituenLangilea)){
					
					/*
					 	egungoLangilea-k orduGehienSartuDituenLangilea baino ordu gehiago sartu baldin baditu, 
					 	orduGehienSartuDituenLangilea berria izango da
					 */
					orduGehienSartuDituenLangilea = egungoLangilea;
					
				}
				
			}
			
		}
		
		// Bueltatuko dugu orduGehienSartuDituenLangilea alegia
		return orduGehienSartuDituenLangilea;
	}

	private Iterator<Langilea> getIteradorea() {
		return langileak.iterator();
	}

	public void addLangilea(Langilea pLangilea) {
		this.langileak.add(pLangilea);
	}
	
}

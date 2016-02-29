package program.partziala1.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import program.partziala1.Data;
import program.partziala1.Enpresa;
import program.partziala1.LangileZerrenda;
import program.partziala1.Langilea;
import program.partziala1.Ordua;
import program.partziala1.SarreraIrteera;
import program.partziala1.SarreraIrteeraZerrenda;

public class EnpresaTest {

	Enpresa enpresa = null;
	
	@Before
	public void setUp() throws Exception {
		enpresa = Enpresa.getNireEnpresa();
		LangileZerrenda langileZerrenda = new LangileZerrenda();
		
		Langilea lang1 = new Langilea(1);
		SarreraIrteeraZerrenda sarIrtZer1 = new SarreraIrteeraZerrenda();
		lang1.setZerrenda(sarIrtZer1);
		SarreraIrteera lang1Si1 = new SarreraIrteera(new Data(2016, 2, 3), new Ordua(8, 0), new Ordua(9, 2)); 		// 62 minutu
		SarreraIrteera lang1Si2 = new SarreraIrteera(new Data(2016, 2, 3), new Ordua(10, 1), new Ordua(13, 30));	// 209 minutu
		SarreraIrteera lang1Si3 = new SarreraIrteera(new Data(2016, 2, 3), new Ordua(15, 0), new Ordua(20, 0));		// **300 minutu
		
		SarreraIrteera lang1Si4 = new SarreraIrteera(new Data(2016, 2, 2), new Ordua(8, 0), new Ordua(15, 0));		// **420 minutu
		SarreraIrteera lang1Si5 = new SarreraIrteera(new Data(2016, 2, 2), new Ordua(8, 5), new Ordua(12, 2));		// 237 minutu
		SarreraIrteera lang1Si6 = new SarreraIrteera(new Data(2016, 2, 2), new Ordua(17, 27), new Ordua(23, 45));	// 378 minutu
		sarIrtZer1.addSarreraIrteera(lang1Si1);
		sarIrtZer1.addSarreraIrteera(lang1Si2);
		sarIrtZer1.addSarreraIrteera(lang1Si3);
		sarIrtZer1.addSarreraIrteera(lang1Si4);
		sarIrtZer1.addSarreraIrteera(lang1Si5);
		sarIrtZer1.addSarreraIrteera(lang1Si6);
		
		Langilea lang2 = new Langilea(2);
		SarreraIrteeraZerrenda sarIrtZer2 = new SarreraIrteeraZerrenda();
		lang2.setZerrenda(sarIrtZer2);
		SarreraIrteera lang2Si1 = new SarreraIrteera(new Data(2016, 2, 3), new Ordua(1, 0), new Ordua(4, 0));		// 180 minutu
		SarreraIrteera lang2Si2 = new SarreraIrteera(new Data(2016, 2, 3), new Ordua(2, 0), new Ordua(6, 0));		// **240 minutu
		SarreraIrteera lang2Si3 = new SarreraIrteera(new Data(2016, 2, 3), new Ordua(3, 0), new Ordua(5, 0));		// 120 minutu
		
		SarreraIrteera lang2Si4 = new SarreraIrteera(new Data(2016, 2, 2), new Ordua(4, 5), new Ordua(6, 0));		// 115 minutu
		SarreraIrteera lang2Si5 = new SarreraIrteera(new Data(2016, 2, 2), new Ordua(6, 6), new Ordua(11, 0));		// 294 minutu
		SarreraIrteera lang2Si6 = new SarreraIrteera(new Data(2016, 2, 2), new Ordua(5, 2), new Ordua(10, 0));		// **298 minutu
		sarIrtZer2.addSarreraIrteera(lang2Si1);
		sarIrtZer2.addSarreraIrteera(lang2Si2);
		sarIrtZer2.addSarreraIrteera(lang2Si3);
		sarIrtZer2.addSarreraIrteera(lang2Si4);
		sarIrtZer2.addSarreraIrteera(lang2Si5);
		sarIrtZer2.addSarreraIrteera(lang2Si6);
		
		Langilea lang3 = new Langilea(3);
		SarreraIrteeraZerrenda sarIrtZer3 = new SarreraIrteeraZerrenda();
		lang3.setZerrenda(sarIrtZer3);
		SarreraIrteera lang3Si1 = new SarreraIrteera(new Data(2016, 2, 3), new Ordua(11, 0), new Ordua(13, 0));		// 120 minutu
		SarreraIrteera lang3Si2 = new SarreraIrteera(new Data(2016, 2, 3), new Ordua(12, 0), new Ordua(12, 58));	// 58 minutu
		SarreraIrteera lang3Si3 = new SarreraIrteera(new Data(2016, 2, 3), new Ordua(13, 0), new Ordua(17, 20));	// **260 minutu
		
		SarreraIrteera lang3Si4 = new SarreraIrteera(new Data(2016, 2, 2), new Ordua(14, 0), new Ordua(19, 0));		// **300 minutu
		SarreraIrteera lang3Si5 = new SarreraIrteera(new Data(2016, 2, 2), new Ordua(15, 0), new Ordua(16, 2));		// 62 minutu
		SarreraIrteera lang3Si6 = new SarreraIrteera(new Data(2016, 2, 2), new Ordua(16, 0), new Ordua(18, 2));		// 122 minutu 
		sarIrtZer3.addSarreraIrteera(lang3Si1);
		sarIrtZer3.addSarreraIrteera(lang3Si2);
		sarIrtZer3.addSarreraIrteera(lang3Si3);
		sarIrtZer3.addSarreraIrteera(lang3Si4);
		sarIrtZer3.addSarreraIrteera(lang3Si5);
		sarIrtZer3.addSarreraIrteera(lang3Si6);
				
		Langilea lang4 = new Langilea(4);
		SarreraIrteeraZerrenda sarIrtZer4 = new SarreraIrteeraZerrenda();
		lang4.setZerrenda(sarIrtZer4);
		SarreraIrteera lang4Si1 = new SarreraIrteera(new Data(2016, 2, 3), new Ordua(14, 0), new Ordua(19, 41));	// 341 minutu
		SarreraIrteera lang4Si2 = new SarreraIrteera(new Data(2016, 2, 3), new Ordua(1, 0), new Ordua(9, 0));		// **480 minutu
		SarreraIrteera lang4Si3 = new SarreraIrteera(new Data(2016, 2, 3), new Ordua(5, 0), new Ordua(7, 30));		// 150 minutu
		
		SarreraIrteera lang4Si4 = new SarreraIrteera(new Data(2016, 2, 2), new Ordua(19, 0), new Ordua(19, 20));	// 20 minutu
		SarreraIrteera lang4Si5 = new SarreraIrteera(new Data(2016, 2, 2), new Ordua(20, 0), new Ordua(23, 50));	// **230 minutu
		sarIrtZer4.addSarreraIrteera(lang4Si1);
		sarIrtZer4.addSarreraIrteera(lang4Si2);
		sarIrtZer4.addSarreraIrteera(lang4Si3);
		sarIrtZer4.addSarreraIrteera(lang4Si4);
		sarIrtZer4.addSarreraIrteera(lang4Si5);
		
		langileZerrenda.addLangilea(lang1);
		langileZerrenda.addLangilea(lang2);
		langileZerrenda.addLangilea(lang3);
		langileZerrenda.addLangilea(lang4);
		
		enpresa.setLangileak(langileZerrenda);
		
	}

	@After
	public void tearDown() throws Exception {
		enpresa = null;
	}

	@Test
	public void testDataXOrduGehienSartuDituenLang() {
		Langilea lang = enpresa.dataXOrduGehienSartuDituenLang(2016, 2, 3);
		assertEquals(lang.getNan(), 4);
	}

}

package at.bfi.projekt.firma_v3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class VerwaltungTest {

	@Test
	void testBerechneNettoArbeiter() {

		double TAX_ARB = 0.15;

		Arbeiter arbeiter_0 = new Arbeiter(1, "Klemens", 10, 10, 10, 10);
		Arbeiter arbeiter_1 = new Arbeiter(2, "Karoline", 20, 20, 20, 20);

		double nettoArbeiter_0 = Verwaltung.berechneNettoGehalt(arbeiter_0);
		double nettoArbeiter_1 = Verwaltung.berechneNettoGehalt(arbeiter_1);

		double bruttoTemp = arbeiter_0.berechneBrutto() + arbeiter_1.berechneBrutto();
		double expectedNetto = bruttoTemp - (bruttoTemp * TAX_ARB);

		assertEquals(expectedNetto, (nettoArbeiter_0 + nettoArbeiter_1));

	}

	@Test
	void testBerechneNettoAngestellter() {

		double TAX_ANG = 0.20;

		Angestellter angestellter_1 = new Angestellter(1, "Warinot", 100.0, 10.00, 1.0);

		double actualNetto = Verwaltung.berechneNettoGehalt(angestellter_1);
		double expectedNetto = angestellter_1.berechneBrutto() - (angestellter_1.berechneBrutto() * TAX_ANG);

		assertEquals(expectedNetto, actualNetto);

	}

}

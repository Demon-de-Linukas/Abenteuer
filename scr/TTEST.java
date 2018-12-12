public class TTEST {
	int num; // Eine ganze Zahl stellen.
	String entsss; //Eine Zeichnenkette stellen.
	Scan HHH = new Scan();

	public String Choice() {
		while (true) {
			System.out.println("Bitte dein Entscheidung geben!");
			System.out.println("   ");
			HHH.wahl(); //Methode in Objekt "Scan" benutzen

			if ("A".equals(HHH.auf) || "B".equals(HHH.auf) ||
				"a".equals(HHH.auf) || "b".equals(HHH.auf)) {
				entsss = (num + HHH.auf); //Variabel in Objekt "Scan" ulteilen

				break;
			} else {
				System.out.println("Bitte nur 'A' oder 'B' geben!");
			}
		}

		return entsss; //Return. Mit das kann die Ergebnis in andere Objekt benutzt werden.
	}

}

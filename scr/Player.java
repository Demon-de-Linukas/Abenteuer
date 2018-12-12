import java.util.*;


public class Player {
	int gesm; //Eine ganze Zahl stellen.

	public int ICH() {
		int ge = 0;
		int m = (int) ((Math.random() * 10) + 1); //Ein ganzen Zufallszahl von 1 bis 10 nehmen.
		Scanner Key = new Scanner(System.in); //Methode "Scanner" benutzten
		System.out.println("Nehmen Sie bitte ein Karte!");
		int k1 = (int) ((Math.random() * 10) + 1); //Ein ganzen Zufallszahl von 1 bis 10 nehmen.
		System.out.println("Sie haben ein karte " + k1 + " !");
		int ges = ge + k1; //Addieren.

		gesm = ges + m;

		while (true) {
			System.out.println("Möchten sie noch ein mal nehmen?");
			System.out.println("Y/N");
			String ant1 = Key.next(); //Methode "Scanner" benutzten
			if ("Y".equals(ant1) || "y".equals(ant1)) { //Ulteilen
				System.out.println("As you wish!");
				ge = ges;
				k1 = (int) ((Math.random() * 10) + 1);
				ges = ge + k1;
				gesm = ges + m;
				System.out.println("Sie haben ein karte " + k1 + " !");
			} else if ("N".equals(ant1) || "n".equals(ant1)) { //Ulteilen
				System.out.println("Alles klar!");
				System.out.println("Ihre innen Karte ist " + m);
				System.out.println("Sie haben " + gesm);
				System.out.println(" ");

				break;
			} else {
				System.out.println("Bitte nur 'Y' oder 'N' geben!!");
			}
		}

		return gesm; //Return. Mit das kann die Ergebnis in andere Objekt benutzt werden.
	}
}

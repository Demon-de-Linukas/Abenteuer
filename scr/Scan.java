import java.util.*;//Methoe einf�gen
public class Scan{
	String auf;
	public String wahl(){
		Scanner ANT = new Scanner(System.in);
		String AA = ANT.next();//Methode "Scanner" benutzten
		auf = AA;
		return auf;//Return. Mit das kann die Ergebnis in andere Objekt benutzt werden.
	}
}

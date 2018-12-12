import java.util.*;
public class Computer{
		int lsg; //Ein Integel stellen.
	public int CP(){
		int x = (int)(Math.random() * 10 + 1); //Ein ganzen Zufallszahl von 1 bis 10 nehmen.
		int y = (int)(Math.random() * 10 + 1); //Ein ganzen Zufallszahl von 1 bis 10 nehmen.
		while (true){
			int z = (int)(Math.random() * 10 + 1); //Ein ganzen Zufallszahl von 1 bis 10 nehmen.
			int g = y + z;  // Addieren ohne die Zahl, die am Anfang genommen wird., wie mensch berechnen, wie viel Karte er hat
			lsg = x+y;     //Summe ohne die Zahl, die letzt mal genommen, aber mit die Zahl, die am Anfang genommen wird.
			if (g < 18){
				y = g;		//Wenn die addierte Ergebnis kleine als 18, dann noch ein Karte nehmen. Ich stelle hier die Zahl nicht 21 sondern 16, um eine bessere Ergebnis zu bekommen. Das macht Computer mehr wie ein Mensch.		
				}
			else{				
				System.out.println("Computer hat " + lsg);  //Wenn die Zahl zu grosß ist, dann geben die Computer Ergebnis lsg.
				break;
				}
				
	}
	return lsg; //Return. Mit das kann die Ergebnis in andere Objekt benutzt werden.
	}
}


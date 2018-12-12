public class GAME {
	int ia;
	public int BlackJake(){
		Player let = new Player();// Objekt "Player" benutzen
		Computer com = new Computer();// Objekt "Computer" benutzen
		System.out.println(" #####################################################      ");
		System.out.println("  ");
		System.out.println("     Black Jack Black Jack Black Jack  Black Jack    ");
		System.out.println("     Black Jack Black Jack Black Jack  Black Jack   ");
		System.out.println("  ");
		System.out.println(" #####################################################       ");  //Das ist nur ein Überschrift (*^_^*)
		ia = 5;
		for (int times = 1; times <= 5; times++){// Diese Program wird nur 5 mal laufen.
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("  ");
			System.out.println("+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*");
			System.out.println("Round " + times);
			System.out.println("+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*");
			System.out.println("  ");
			System.out.println("  ");
			let.ICH();//Methode benutzen
			com.CP();//Methode benutzen
			String Rst;
			if (let.gesm > 21){
				Rst = ("Lost");
				System.out.println("You lose!");
				ia = ia - 1 ;
			}
			else if(let.gesm >= com.lsg){
				Rst = ("Win");	
				System.out.println("You win!");
			}
			else if(com.lsg > 21){
				Rst = ("Win");	
				System.out.println("You win!");
			}
			else{
				Rst = ("Lost");
				System.out.println("You lose!");               //Ulteilen
				ia = ia - 1 ;
			}
		}
		System.out.println(" ");
		System.out.println("+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*");
		System.out.println("Sie haben " + ia + " mal gewonnen!");//Ergebnis
		System.out.println("+*+*+*+*+*+*+*+*+*+*+*+*+*+*+*");
		System.out.println("  ");
		System.out.println("  ");
		System.out.println("  ");	
		System.out.println(" #####################################################      ");
		System.out.println("  ");
		System.out.println("   Black Jack Black Jack Black Jack  Black Jack    ");
		System.out.println("   Black Jack Black Jack Black Jack  Black Jack   ");
		System.out.println("  ");
		System.out.println(" #####################################################       ");
		System.out.println("  ");
		System.out.println("  ");
		System.out.println("  ");
		return ia;//Return. Mit das kann die Ergebnis in andere Objekt benutzt werden.
	}
}

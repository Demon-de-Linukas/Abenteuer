public class Abenteuer {
	public static void main(String[] args) {
		Scan GG = new Scan(); // Objekt "Scan" benutzen
		GAME bj = new GAME(); // Objekt "GAME" benutzen
		TTEST TT = new TTEST(); // Objekt "TTEST" benutzen
		Picture PP = new Picture(); // Objekt "Picture" benutzen

Hauptspiel:  // Name von dieser Schleife
		while (true) {
			String ents = TT.entsss; //Vatiabel in Objekt "TTEST" benutzen
			System.out.println("   ");
			System.out.println("   ");
			System.out.println("   ");
			PP.Title();
			System.out.println("   ");
			System.out.println("   ");
			System.out.println("   ");
			System.out.println("Enter any key to continue!");
			GG.wahl();
			System.out.println("   ");
			System.out.println("   ");
			System.out.println("Hallo! Mein Freud!");
			System.out.println(" ");
			System.out.println("Sie sehen gl�cklich aus!");
			System.out.println(" ");
			System.out.println("M�chten Sie ein lustigen Spiel spielen?(Ja/Nein)");
			System.out.println(" ");
			System.out.println(" ");

			while (true) { //Um Eingabe von spieler zu testen
				GG.wahl(); // Methode benutzen

				if ("Ja".equals(GG.auf) || "ja".equals(GG.auf) ||
					"JA".equals(GG.auf)) {
					System.out.println("Gut! Dann fangen wir an!");
					System.out.println(" ");
					System.out.println(" ");

					break; //Nur die Schleife ausschalten
				} else if ("Nein".equals(GG.auf) || "NEIN".equals(GG.auf) ||
						   "nein".equals(GG.auf)) {
					System.out.println("Naja, auf wiedersehen!");

					break Hauptspiel; // Das ganze Spiel ausschalten 
				} else {
					System.out.println("Bitte nur 'Ja' oder 'Nein' geben!");
					System.out.println("    ");
					System.out.println("M�chten Sie ein lustigen Spiel spielen?(Ja/Nein)");
					System.out.println("    ");
				}
			}

			System.out.println(" ");
			System.out.println("M�chten Sie zuerst die Regeln wissen?(Ja/Nein)");
			System.out.println("  ");
Regeln: 
			while (true) {
				GG.wahl();

				if ("Ja".equals(GG.auf) || "ja".equals(GG.auf) ||
					"JA".equals(GG.auf)) {
					System.out.println("Okay");
					System.out.println("  ");
					System.out.println("Das ist ein Text spiel �ber einem Abenteuer, wo Sie sich entspannen k�nnen (WAHRSCHENLICH)!");
					System.out.println("Hier brauchen Sie f�r jeder Frage eine L�sung in 'A', 'B' oder 'C' w�hlen!");
					System.out.println("Manchmal werden Sie Problem in dem Abenteuer treffen.");
					System.out.println("Dann brauchen Sie ein kleines Kartespiel--'Black Jack' 5 mal zu spielen, um das Problem zu beheben!");
					System.out.println("Wenn Sie mehr als 2 mal gewonnen haben, k�nnen Sie dann weiter spielen~");
					System.out.println("  ");
					System.out.println("  ");
					System.out.println("  ");
					System.out.println("Wissen Sie die Regeln von Black Jack?(Ja/Nein)");
					GG.wahl();

					if ("Ja".equals(GG.auf) || "ja".equals(GG.auf) ||
						"JA".equals(GG.auf)) {
						System.out.println("    ");
						System.out.println("Sehr gut!");

						break Regeln; //Schleife "Regeln" ausschalten
					} else if ("Nein".equals(GG.auf) || "NEIN".equals(GG.auf) ||
							   "nein".equals(GG.auf)) {
						System.out.println("    ");
						System.out.println("Okay!");
						System.out.println("  ");
						System.out.println("Black Jack wird an einem ann�hernd halbkreisf�rmigen Tisch gespielt. An der geraden Seite des Tisches sitzt der Croupier (Dealer, Bankhalter, Kartengeber). ");
						System.out.println("Ihm gegen�ber befinden sich die Pl�tze f�r bis zu sieben Spieler (Pointeure).");
						System.out.println("Es wird mit sechs Paketen franz�sischer Spielkarten zu 52 Blatt,");
						System.out.println(" also 312 Karten gespielt � die Black-Jack-Karte hat Bridge-Format und tr�gt extra gro�e Indexzeichen (large index) mit den englischen Bezeichnungen K, Q und J f�r die Bilder.");
						System.out.println("Ziel des Spiels ist es, mit zwei oder mehr Karten n�her an 21 Punkte heranzukommen als der Croupier, ohne dabei den Wert von 21 Punkten zu �berschreiten.");
						System.out.println("Die Werte der einzelnen Karten");
						System.out.println("Asse z�hlen nach Belieben ein oder elf Punkte. ");
						System.out.println("(Der Wert des Asses wird erst dann festgelegt, wenn der Spieler keine weitere Karte mehr kauft � dann z�hlt der Croupier das Ass so, wie es f�r den Spieler am g�nstigsten ist.)");
						System.out.println("Zweier bis Zehner z�hlen entsprechend ihren Augen.");
						System.out.println("Bildkarten (Buben, Damen, K�nige) z�hlen zehn Punkte.");
						System.out.println("  ");
						System.out.println("Jetzt wissen Sie die Regeln schon!");
						System.out.println("Enter any key to continue!");
						GG.wahl();

						break Regeln; //Schleife "Regeln" ausschalten
					} else {
						System.out.println("Bitte nur 'Ja' oder 'Nein' geben!");
						System.out.println("Wissen Sie die Regeln von Black Jack?");
					}
				} else if ("Nein".equals(GG.auf) || "NEIN".equals(GG.auf) ||
						   "nein".equals(GG.auf)) {
					System.out.println("Okay");

					break Regeln; //Schleife "Regeln" ausschalten
				} else {
					System.out.println("Bitte nur 'Ja' oder 'Nein' geben!");
					System.out.println("    ");
					System.out.println("M�chten Sie zuerst die Regeln wissen?");
					System.out.println("    ");
				}
			}

			System.out.println("    ");
			System.out.println("    ");
			System.out.println("Let's play~ YOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO~~~~~~~~~~~~~~~");
			System.out.println("Enter any key to continue!");
			GG.wahl();
			System.out.println("   ");
			System.out.println("   ");
			System.out.println("   ");
			System.out.println("   ");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			PP.Title();
			System.out.println("   ");
			System.out.println("   ");
			System.out.println("   ");
			System.out.println("Enter any key to continue!");
			GG.wahl();
			System.out.println("   ");
			System.out.println("   ");
			System.out.println("   ");
			System.out.println("   ");
			System.out.println("Zombie Welt");
			System.out.println("Wie viel Wahlscheilichkeit haben Sie, wenn Sie in einem Zombie-Welt �berlegen? ");
			System.out.println("   ");
			System.out.println("   ");
			System.out.println("   ");
			System.out.println("==================================================================================================================================================");
			System.out.println("==================================================================================================================================================");
			System.out.println("Also, du bist ein normale Studenten lebt in einem kleinen Stadt KaLu-Stadt.");
			System.out.println("Einmal nachdem Vorlesung laufst du nach dein liebe Haus~~");
			System.out.println("Pl�tzlich f�llt ein M�dchen auf dem Bodenen! Mitmensch sind �berrascht!! ");
			System.out.println("Die anderen Leute versuchen zu helfen. Du hast gesehen aber leider musstt du nach Hause gehen.");
			System.out.println("'Aaaaaaaa! Helfen!!!' Jemand schreit. Das M�dchen steht auf und hat ein Man gebi�en. Und einige Leute spucken viel Blut.");
			System.out.println("Das Wort'Zombie' erscheint in deinen Kopf. Du weisst schon was es passiert. ");
			System.out.println("Jetzt hast du zwei Entscheidungen.");
			System.out.println("   ");
			System.out.println("A. Sowie so musst du zuerst nach Haus gehen!");
			System.out.println("B. Uni ist n�h, gehst du zu erst zur Uni.");
			System.out.println("=============================================================");

Aufgabe1: 
			while (true) {
				TT.num = 1;
				TT.Choice(); //Methode benutzen
				ents = TT.entsss; // Variabel stellen
				System.out.println("   ");
				System.out.println("   ");
				System.out.println("   ");

				if ("1A".equals(ents) || "1a".equals(ents)) { //Testen: F�r Aufgaben 1, wenn "A" gew�hlt wird, macht das.
					System.out.println("=============================================================");
					System.out.println("Du w�hlst nach Hause gehen.");
					System.out.println("  ");
					System.out.println("  ");

					System.out.println("Wegen des Angst vor dem Unbekannt, entscheidest du zuerst nach Hause gehen.");
					System.out.println("Auch musst du dein Familien sch�tzen.");
					System.out.println("Du laufst, laufst.");
					System.out.println("Suddenly! Ein h�ssliche Zombie erscheint sich auf dem Stra�e! Was willst du tunen?");
					System.out.println("  ");
					System.out.println("A. Ein andere kleinen Weg zu nehmen, um dieser Zombie zu abwenden.");
					System.out.println("B. Hast du doch keine Zeit! Gerade es t�ten!!");
					System.out.println("=============================================================");
					System.out.println("   ");
					System.out.println("   ");
Test1: 
					TT.num = 2;
					TT.Choice(); //Methode benutzen
					ents = TT.entsss; // Variabel stellen

					break Aufgabe1;
				} else if ("1B".equals(ents) || "1b".equals(ents)) { //Testen: F�r Aufgaben 1, wenn "B" gew�hlt wird, macht das.
					System.out.println("=============================================================");
					System.out.println("Du w�hlst zur Uni gehen.");
					System.out.println("   ");
					System.out.println("   ");

					System.out.println("Du wilsst zuerst zur Uni gehen, wo es deinen Freunden, deinen Lehren, deinen Traum-M�dchen gibt.");
					System.out.println("Du laufst so schnell und hast du gefunden, dass es noch keinen Zombie in deiner Uni gibt.");
					System.out.println("Behutsam gehst du zur Bibliothek. Aber hast du pl�ztlich erinnert, dass du der Tor der Unis nicht geschlossen hast.");
					System.out.println("Was willst du machen?");
					System.out.println("  ");

					System.out.println("A. Keine angst, das ist nicht wichtig!");
					System.out.println("B. Nein, die T�r muss geschlossen werden!");
					System.out.println("=============================================================");
					System.out.println("   ");
					System.out.println("   ");
Test2: 
					TT.num = 3;
					TT.Choice(); //Methode benutzen
					ents = TT.entsss;

					break Aufgabe1;
				} else { //Testen: Nur "A","B" gew�hlt wird.
					System.out.println("Bitte nur 'A' oder 'B' geben!");
					System.out.println("   ");
				}
			}

TWO: 
			while (true) { //Neue Schleife, f�r folgenden Entscheindungen.
Aufgabe2: 
				while (true) {
					if ("2A".equals(ents) || "2a".equals(ents)) { //Urteilen
						System.out.println("=============================================================");
						System.out.println("Du w�hlst ein andere kleinen Weg zu nehmen.");
						System.out.println("   ");
						System.out.println("   ");
						System.out.println("Dein Idee ist sehr gut!");
						System.out.println("Es gibt immer so viele Leute auf der Stra�e, was bedeutet, dass es auch vielen Get�mmeln gibt.");
						System.out.println("Du laufst in der kleinen Weg. Und gl�cklich hast du nicht von einem Zombie gefunden wurden.");
						System.out.println("Das kleine Weg ist so eng und es gibt so viele M�lls hier, was in dem Weg �berrall �berh�uft werden.");
						System.out.println("Jetzt findest etwas in dem Ecke--ein st�ck Betonstahl.");
						System.out.println("Willst du es mitnehmen?");
						System.out.println("  ");
						System.out.println("A. Ja, nimmst du ein nur f�r Sicherheit.");
						System.out.println("B. Nein, es sieht schwer aus, macht dir langsam.");
						System.out.println("   ");
						System.out.println("=============================================================");
						System.out.println("   ");
Test3: 
						TT.num = 4;
						TT.Choice();
						ents = TT.entsss;

						break Aufgabe2;
					} else if ("2B".equals(ents) || "2b".equals(ents)) { //Urteilen
						System.out.println("=============================================================");
						System.out.println("Du w�hlst den Zombie zu t�ten.");
						System.out.println("   ");
						System.out.println("   ");
						System.out.println("Es gibt doch keine Zeit, und der Zombie hat sichtlich dir gesehen!");
						System.out.println("Jetzt findest du ein Bauklotz neben dir. Was willst du machen?");
						System.out.println("   ");
						System.out.println("A. Keine Zeit f�r dem Nehmen des Bauklozt!! Du willst freih�ndig den Zombie t�ten!!!");
						System.out.println("B. Du wirdst als schnell als du kannst um den Bauklozt zu nehmen!!");
						System.out.println("   ");
						System.out.println("=============================================================");
						System.out.println("   ");
Test4: 
						TT.num = 5;
						TT.Choice();
						ents = TT.entsss;

						break Aufgabe2;
					} else {
						break Aufgabe2;
					}
				}

Aufgabe3: 
				while (true) {
					if ("3A".equals(ents) || "3a".equals(ents)) {
						//Urteilen
						System.out.println("=============================================================");
						System.out.println("Du w�hlst, dass die T�r nicht schlie�en!");
						System.out.println("   ");
						System.out.println("   ");
						System.out.println("Glaubst du, dass es nicht wichtig ist, ob die T�r geschlossen ist.");
						System.out.println("Sowieso hast du deinen Freunden gefunden und m�chten ein weitere Plane machen.");
						System.out.println("Aber Zombie geben euch doch keinen Chance zu �berlegen.");
						System.out.println("Alle Zombie, die auf dem Stra�e sind, str�men in deiner Uni ein.");
						System.out.println("Sowieso kannst du in solche Situation �berleben, aber alle deinen Freunden sind tot.");
						System.out.println("Erinnen Sie immer sorgf�ltig zu sein!");
						System.out.println("=============================================================");
						System.out.println("   ");
						System.out.println("   ");
						System.out.println("Enter any key to continue!");
						GG.wahl();

						PP.FAIL();
						System.out.println("Enter any key to continue!");
						GG.wahl();

Ask1: 
						while (true) {
							System.out.println("M�chten Sie noch mal spielen?(Ja/Nein)");
							GG.wahl();

							if ("Ja".equals(GG.auf) || "ja".equals(GG.auf) ||
								"JA".equals(GG.auf)) {
								System.out.println("Sehr gut!!");
								GG.auf = ("11111");

								break TWO; //Schalten die Schleife "TWO" aus, dann wird Programm am Anfang laufen
							} else if ("Nein".equals(GG.auf) ||
									   "NEIN".equals(GG.auf) ||
									   "nein".equals(GG.auf)) {
								System.out.println("Naja, auf wiedersehen!");

								break Hauptspiel; //Das ganze Spiel ausschalten
							} else {
								System.out.println("Bitte nur 'Ja' oder 'Nein' geben!");
							}
						}
					} else if ("3B".equals(ents) || "3b".equals(ents)) {
						//Urteilen
						System.out.println("=============================================================");
						System.out.println("Du w�hlst die T�r zu schlie�en!");
						System.out.println("   ");
						System.out.println("   ");
						System.out.println("Du glaubst es nicht gut, dass die T�r �ffnet lassen. Deshalb gehst du zur�ck zu der T�r zu schlie�en.");
						System.out.println("Wenn du in der N�he der T�rs bist, hat ein M�dchen, wer greifen bei den Zombies wird, dir gesehen. ");
						System.out.println("'Helfen! Mir ist nicht gebissen!!' Sie ruft und befreit sich von dem Zwang der Zombies.");
						System.out.println("Hast schon das Wunde gesehen, bleibst du stumm und �berlegen.");
						System.out.println("Was sollse du machen dann?");
						System.out.println("   ");
						System.out.println("A. Helfen das M�dchen die Zombies t�ten und erlauben sie hin kommen.");
						System.out.println("B. Ignorieren das M�dchen. Sie ist schon gebi�en!!");
						System.out.println("   ");
						System.out.println("=============================================================");
						System.out.println("   ");
Test5: 
						TT.num = 6;
						TT.Choice();
						ents = TT.entsss;

						break Aufgabe3;
					} else {
						break Aufgabe3;
					}
				}

Aufgabe4: 
				while (true) {
					if ("4A".equals(ents) || "4a".equals(ents)) {
						//Urteilen
						System.out.println("=============================================================");
						System.out.println("Du w�hlst das Betonstahl zu nehmen!");
						System.out.println("   ");
						System.out.println("   ");
						System.out.println("Du nimmst das Betonstahl, aber es gibt wirklich zu viele M�lls.");
						System.out.println("Zuf�llig hast du ein paar Weinfl�chen umst�rzt, klingen so laut und ein Zombie hat dir bemerket!");
						System.out.println("Jetzt musst du k�mpfen!");
						System.out.println("Naja, mit Black Jack  (= _ = !)");
						System.out.println("=============================================================");

						System.out.println("Enter any key to continue!");
						GG.wahl();

						bj.BlackJake();

						if (bj.ia >= 2) {
							System.out.println("   ");
							System.out.println("Enter any key to continue!");
							GG.wahl();
							System.out.println("   ");
							System.out.println("   ");
							System.out.println("   ");
							PP.WIN();
							System.out.println("   ");
							System.out.println("Congratulation!!!  Du hast den Zombie get�tet!!");
							System.out.println("Du bekommst 213 EXP, was macht gar keine Sinn hier!");
							System.out.println("Gehst du weiter!");
							System.out.println("   ");
							System.out.println("=============================================================");
							System.out.println("Enter any key to continue!");
							GG.wahl();
							System.out.println("   ");
							System.out.println("   ");
							System.out.println("=============================================================");

							System.out.println("Du hat der Zombie get�tet und laufst du weiter.");
							System.out.println("Jetzt ist es so chaotisch! Pl�tzlich h�rest du jemand dir anruft!");
							System.out.println("Das sind deine Familian! ");
							System.out.println("Dein Vater sagt, dass es ein Haus in Au�enbezirke gibt, wo sicher ist. ");
							System.out.println("Aber glaubt deine Mutter, dass wir in den Stadt bleiben und auf dem Hilfeleistung warten sollen!");
							System.out.println("Jetzt brauchst du entscheiden, wo zu gehen?");
							System.out.println("   ");
							System.out.println("A. Au�erzirke");
							System.out.println("B. In den Stadt warten.");
							System.out.println("   ");
							System.out.println("=============================================================");

Test6: 
							TT.num = 7;
							TT.Choice();
							ents = TT.entsss;

							break Aufgabe4;
						} else {
							System.out.println("   ");
							System.out.println("   ");
							System.out.println("=============================================================");
							System.out.println("Du hast verloren......");
							System.out.println("Naja, Zombie ist so gef�hrlich, wahlscheilich brauchst du mehr �ben~~~~");
							System.out.println("   ");
							System.out.println("   ");
							System.out.println("Enter any key to continue!");
							GG.wahl();
							PP.FAIL();
							System.out.println("Enter any key to continue!");
							GG.wahl();

Ask2: 
							while (true) {
								System.out.println("M�chten Sie noch mal spielen?");
								GG.wahl();

								if ("Ja".equals(GG.auf) || "ja".equals(GG.auf) ||
									"JA".equals(GG.auf)) {
									System.out.println("Sehr gut!!");
									GG.auf = ("11111");

									break TWO;
								} else if ("Nein".equals(GG.auf) ||
										   "NEIN".equals(GG.auf) ||
										   "nein".equals(GG.auf)) {
									System.out.println("Naja, auf wiedersehen!");

									break Hauptspiel;
								} else {
									System.out.println("Bitte nur 'Ja' oder 'Nein' geben!");
								}
							}
						}
					} else if ("4B".equals(ents) || "4b".equals(ents)) {
						//Urteilen
						System.out.println("=============================================================");
						System.out.println("Du w�hlst das Betonstahl nicht zu nehmen! ");
						System.out.println("  ");
						System.out.println("  ");
						System.out.println("Du findest, dass das Betonstahl zu schwerig zu nehmen ist. Deshalb entscheidst du sowieso freih�ndig weiter gehen.");
						System.out.println("Die Stra�e war sehr lebhaft, aber jetzt ist es so so ruhig. Das macht dir ein bisschen traurig......");
						System.out.println("Pl�tzlich hast du Schussknall geh�rt!");
						System.out.println("Du gehst zu sehen.");
						System.out.println("Bevor ein Supermarkt gibt es ein Panzer und einige Soldaten.");
						System.out.println("'Wahrscheinlich kommen sie die Volkers zu helfen. Aber sie sehen so schreklich aus....' Du denkst.");
						System.out.println("Jtzt, was willst du machen?");
						System.out.println("   ");
						System.out.println("A. Gerade gehen um Helfen zu finden.");
						System.out.println("B. Nein, du verl�sst ihr nicht, du willst los gehen.");
						System.out.println("=============================================================");
Test7: 
						TT.num = 8;
						TT.Choice();
						ents = TT.entsss;

						break Aufgabe4;
					} else {
						break Aufgabe4;
					}
				}

Aufgabe5: 
				while (true) {
					if ("5A".equals(ents) || "5a".equals(ents)) {
						System.out.println("=============================================================");
						System.out.println("Du w�hlst freih�ndig den Zombie zu t�ten");
						System.out.println("   ");
						System.out.println("   ");
						System.out.println("Nein, du hast keine Zeit etwas zu nehmen!!!");
						System.out.println("Der Zombie kommt!!!");
						System.out.println("Ohne Waffe ist es so schwer ein Zombie zu t�ten. Und anderen Zombies haben dir gefunden!!!");
						System.out.println("Schlie�lich bist du tot, und verwandlet als ein Mitglied in Zombie......");
						System.out.println("    ");
						System.out.println("Erinnnen Sie, nicht greih�ndig k�mpfen mit einem Zombie!!");
						System.out.println("   ");
						System.out.println("=============================================================");
						System.out.println("   ");
						System.out.println("Enter any key to continue!");
						GG.wahl();
						PP.FAIL();
						System.out.println("Enter any key to continue!");
						GG.wahl();

Ask: 
						while (true) {
							System.out.println("M�chten Sie noch mal spielen?");
							GG.wahl();

							if ("Ja".equals(GG.auf) || "ja".equals(GG.auf) ||
								"JA".equals(GG.auf)) {
								System.out.println("Sehr gut!!");
								GG.auf = ("11111");

								break TWO;
							} else if ("Nein".equals(GG.auf) ||
									   "NEIN".equals(GG.auf) ||
									   "nein".equals(GG.auf)) {
								System.out.println("Naja, auf wiedersehen!");

								break Hauptspiel;
							} else {
								System.out.println("Bitte nur 'Ja' oder 'Nein' geben!");
							}
						}
					} else if ("5B".equals(ents) || "5b".equals(ents)) {
						System.out.println("=============================================================");
						System.out.println("Du w�hlst den Bauklozt zu nehmen!!");
						System.out.println("   ");
						System.out.println("   ");
						System.out.println("Du nehmst den Bauklotz!!");
						System.out.println("Jetzt musst du k�mpfen!");
						System.out.println("Naja, mit Black Jack  (= _ = !)");
						System.out.println("=============================================================");
						System.out.println("Enter any key to continue!");
						GG.wahl();
						bj.BlackJake();

						if (bj.ia >= 2) {
							System.out.println("   ");
							System.out.println("Enter any key to continue!");
							GG.wahl();
							System.out.println("   ");
							System.out.println("   ");
							PP.WIN();
							System.out.println("   ");
							System.out.println("   ");
							System.out.println("Congratulation!!!  Du hast den Zombie get�tet!!");
							System.out.println("Du bekommst 213 EXP, was macht gar keine Sinn hier!");
							System.out.println("Gehst du weiter!");
							System.out.println("   ");
							System.out.println("=============================================================");
							System.out.println("Enter any key to continue!");
							GG.wahl();
							System.out.println("   ");
							System.out.println("   ");
							System.out.println("Du hast den Zombie get�tet!!!!!");
							System.out.println("Aber haben die anderen Zombie auch dir bemerkt!!!");
							System.out.println("Jetzt musst du los laufen!");
							System.out.println("Du willst....");
							System.out.println(" ");
							System.out.println("A. Laufen mit deiner Waffe-- Bauklotz.");
							System.out.println("B. Laufen ohne Bauklotz.");
							System.out.println("=============================================================");
Test8: 
							TT.num = 9;
							TT.Choice();
							ents = TT.entsss;

							break Aufgabe5;
						} else {
							System.out.println("   ");
							System.out.println("   ");
							System.out.println("=============================================================");
							System.out.println("Du hast verloren......");
							System.out.println("Naja, Zombie ist so gef�hrlich, wahlscheilich brauchst du mehr �ben~~~~");
							System.out.println("   ");
							System.out.println("   ");

							System.out.println("=============================================================");
							System.out.println("Enter any key to continue!");
							GG.wahl();
							System.out.println("   ");
							PP.FAIL();
							System.out.println("   ");
							System.out.println("Enter any key to continue!");
							GG.wahl();

Ask3: 
							while (true) {
								System.out.println("M�chten Sie noch mal spielen?");
								GG.wahl();

								if ("Ja".equals(GG.auf) || "ja".equals(GG.auf) ||
									"JA".equals(GG.auf)) {
									System.out.println("Sehr gut!!");
									GG.auf = ("11111");

									break TWO;
								} else if ("Nein".equals(GG.auf) ||
										   "NEIN".equals(GG.auf) ||
										   "nein".equals(GG.auf)) {
									System.out.println("Naja, auf wiedersehen!");

									break Hauptspiel;
								} else {
									System.out.println("Bitte nur 'Ja' oder 'Nein' geben!");
								}
							}
						}
					} else {
						break Aufgabe5;
					}
				}

Aufgabe6: 
				while (true) {
					if ("6A".equals(ents) || "6a".equals(ents)) {
						System.out.println("=============================================================");
						System.out.println("Du w�hlst f�r das M�dchen die Zombies t�ten und erlauben sie hin kommen.");
						System.out.println("   ");
						System.out.println("   ");
						System.out.println("Ein M�dchen, wer fast gleiche Lebensalte wie dir ist, hat so gro�e Problem getroffen. Du glaust, dass du ihr helfen sollst. ");
						System.out.println("Du gehst und m�chtest Zombie t�ten!!!");
						System.out.println("Jetzt musst du k�mpfen!");
						System.out.println("Naja, mit Black Jack  (= _ = !)");
						System.out.println("=============================================================");
						System.out.println("Enter any key to continue!");
						GG.wahl();
						bj.BlackJake();

						if (bj.ia >= 2) {
							System.out.println("   ");
							System.out.println("Enter any key to continue!");
							GG.wahl();
							System.out.println("=============================================================");
							System.out.println("   ");
							System.out.println("Congratulation!!!  Du hast den Zombie get�tet!!");
							System.out.println("Du bekommst 9999999999999999999999999999 EXP, was macht gar keine Sinn hier!");
							System.out.println("Gehst du weiter!");
							System.out.println("   ");
							System.out.println("=============================================================");
							System.out.println("Enter any key to continue!");
							GG.wahl();
							System.out.println("Du siehst den andern Zombies, plannen alle die Zombies zu t�ten. Aber pl�tzlichhhhhhhhh!!!!");
							System.out.println("Das M�dchen lauft in der Uni und hat die T�r geschlossen!");
							System.out.println("'Entschuldigung, Bl�dman! Habe ich keine andere Entscheidung.....' Sie lacht und geht los....");
							System.out.println("Du bist verraten!!!");
							System.out.println("So viele Zombies stehet vor dir. Du hast keinen Entscheidung aber nur dein selbst t�ten.....");
							System.out.println("   ");
							System.out.println("Erinnen Sie, nicht 100% ein fremde Leute glauben, besonders in einer Welt, wo es �berrall Zombie gibt!!");
							System.out.println("   ");
							System.out.println("   ");
							System.out.println("=============================================================");
							System.out.println("Enter any key to continue!");
							GG.wahl();
							System.out.println("   ");
							PP.FAIL();
							System.out.println("   ");
							System.out.println("Enter any key to continue!");
							GG.wahl();

Ask4: 
							while (true) {
								System.out.println("M�chten Sie noch mal spielen?");
								GG.wahl();

								if ("Ja".equals(GG.auf) || "ja".equals(GG.auf) ||
									"JA".equals(GG.auf)) {
									System.out.println("Sehr gut!!");
									GG.auf = ("11111");

									break TWO;
								} else if ("Nein".equals(GG.auf) ||
										   "NEIN".equals(GG.auf) ||
										   "nein".equals(GG.auf)) {
									System.out.println("Naja, auf wiedersehen!");

									break Hauptspiel;
								} else {
									System.out.println("Bitte nur 'Ja' oder 'Nein' geben!");
								}
							}
						} else {
							System.out.println("   ");
							System.out.println("   ");
							System.out.println("=============================================================");
							System.out.println("Du hast verloren......");
							System.out.println("Naja, Zombie ist so gef�hrlich, wahlscheilich brauchst du mehr �ben~~~~");
							System.out.println("   ");
							System.out.println("   ");
							System.out.println("Enter any key to continue!");
							GG.wahl();
							PP.FAIL();
							System.out.println("   ");
							System.out.println("Enter any key to continue!");
							GG.wahl();
Ask4: 
							while (true) {
								System.out.println("M�chten Sie noch mal spielen?");
								GG.wahl();

								if ("Ja".equals(GG.auf) || "ja".equals(GG.auf) ||
									"JA".equals(GG.auf)) {
									System.out.println("Sehr gut!!");
									GG.auf = ("11111");

									break TWO;
								} else if ("Nein".equals(GG.auf) ||
										   "NEIN".equals(GG.auf) ||
										   "nein".equals(GG.auf)) {
									System.out.println("Naja, auf wiedersehen!");

									break Hauptspiel;
								} else {
									System.out.println("Bitte nur 'Ja' oder 'Nein' geben!");
								}
							}
						}
					} else if ("6B".equals(ents) || "6b".equals(ents)) {
						System.out.println("=============================================================");
						System.out.println("Du w�hlst das M�dchen ignorieren.");
						System.out.println("   ");
						System.out.println("   ");
						System.out.println("Das M�dchen ist schon gebie�en, es ist zu gef�hrlich mit ihr bleiben....");
						System.out.println("H�rst das Anflehen des M�dchens, Du laufst gerade zur Bibliothek, wo alle deinen Freunden sind.");
						System.out.println("Pl�tzlich hast du ein Zombie getroffen!!!");
						System.out.println("Jetzt musst du k�mpfen!");
						System.out.println("Naja, mit Black Jack  (= _ = !)");
						System.out.println("=============================================================");
						System.out.println("Enter any key to continue!");
						GG.wahl();
						bj.BlackJake();

						if (bj.ia >= 2) {
							System.out.println("   ");
							System.out.println("Enter any key to continue!");
							GG.wahl();
							System.out.println("   ");
							System.out.println("   ");
							PP.WIN();
							System.out.println("   ");
							System.out.println("   ");
							System.out.println("Congratulation!!!  Du hast den Zombie get�tet!!");
							System.out.println("Du bekommst 213 EXP, was macht gar keine Sinn hier!");
							System.out.println("Gehst du weiter!");
							System.out.println("   ");
							System.out.println("=============================================================");
							System.out.println("Enter any key to continue!");
							GG.wahl();
							System.out.println("   ");
							System.out.println("   ");
							System.out.println("Du bist endlich in Bib angekommen!!");
							System.out.println("Jetzt haben deinen Freunden gar keinen Anung, was es passiert. Was willst du machen?");
							System.out.println("  ");
							System.out.println("A. Nur mit deiner besten Freunden erz�hlen und jegendwo zu gehen.");
							System.out.println("B. Mit allen Studenten in Bibliothek erz�hlen, was drau�en passiert.");
							System.out.println("=============================================================");
Test9: 
							TT.num = 10;
							TT.Choice();
							ents = TT.entsss;

							break Aufgabe6;
						} else {
							System.out.println("   ");
							System.out.println("   ");
							System.out.println("=============================================================");
							System.out.println("Du hast verloren......");
							System.out.println("Naja, Zombie ist so gef�hrlich, wahlscheilich brauchst du mehr �ben~~~~");
							System.out.println("   ");
							System.out.println("   ");
							System.out.println("Enter any key to continue!");
							GG.wahl();
							PP.FAIL();
							System.out.println("   ");
							System.out.println("Enter any key to continue!");
							GG.wahl();
Ask4: 
							while (true) {
								System.out.println("M�chten Sie noch mal spielen?");
								GG.wahl();

								if ("Ja".equals(GG.auf) || "ja".equals(GG.auf) ||
									"JA".equals(GG.auf)) {
									System.out.println("Sehr gut!!");
									GG.auf = ("11111");

									break TWO;
								} else if ("Nein".equals(GG.auf) ||
										   "NEIN".equals(GG.auf) ||
										   "nein".equals(GG.auf)) {
									System.out.println("Naja, auf wiedersehen!");

									break Hauptspiel;
								} else {
									System.out.println("Bitte nur 'Ja' oder 'Nein' geben!");
								}
							}
						}
					} else {
						break Aufgabe6;
					}
				}

Aufgabe7: 
				while (true) {
					if ("7A".equals(ents) || "7a".equals(ents)) {
						System.out.println("=============================================================");
						System.out.println("Du w�hlst nach Au�erzirke gehen.");
						System.out.println("   ");
						System.out.println("   ");
						System.out.println("Du glaubst es wird besser sein, ein Ort wo wenige Leute gibt.");
						System.out.println("Sonst ist es ein bisschen weit Weg.");
						System.out.println("Um schneller dort zu gehen, welche Fahrzeug wirdst du w�hlen?");
						System.out.println("   ");
						System.out.println("A. Personenkraftwagen, was sehr schnell laufen kann.");
						System.out.println("B. Minibus, was viele Ressourcen tragen kann.");

						System.out.println("=============================================================");
Test10: 
						TT.num = 11;
						TT.Choice();
						ents = TT.entsss;

						break Aufgabe7;
					} else if ("7B".equals(ents) || "7b".equals(ents)) {
						System.out.println("=============================================================");
						System.out.println("Du w�hlst in den Stadt warten.");
						System.out.println("   ");
						System.out.println("   ");
						System.out.println("Du glaubst es wird besser sein, in den Stadt bleiben.");
						System.out.println("Ihre Haus ist nicht stark genug, m�chtest du es ab�ndern.");
						System.out.println("Jetzt hast du zwei Plannen, welche m�chtest du entscheiden?");
						System.out.println("   ");
						System.out.println("A. Dein Haus absperren, nur mit Keller zu drau�en.");
						System.out.println("B. Im Umfeld deines Haus viele Fallstrick stellen. ");
						System.out.println("=============================================================");
Test11: 
						TT.num = 12;
						TT.Choice();
						ents = TT.entsss;

						break Aufgabe7;
					} else {
						break Aufgabe7;
					}
				}

Aufgabe8: 
				while (true) {
					if ("8A".equals(ents) || "8a".equals(ents)) {
						System.out.println("=============================================================");
						System.out.println("Du gerade gehen um Helfen zu finden.");
						System.out.println("   ");
						System.out.println("   ");
						System.out.println("Du laufst so schneel, mit Hofnung und Gl�cklichkeit.");
						System.out.println("Aber bekommst du nicht 'Welcomm', sondern ein Geschoss....");
						System.out.println("Dein Lebenskraft geht los.... Du hast etwas verschleiern geh�rt:");
						System.out.println("'Schei�.... Das war ein Kind.... Ich dachte er war Zombie....'");
						System.out.println("'Egal, unsere Aufgaben ist: Alle bewegene kreatur zu t�ten, ob es ein Zombie ist.");
						System.out.println("   ");
						System.out.println("Erinnen Sie, nicht 100% ein fremde Leute glauben, besonders in einer Welt, wo es �berrall Zombie gibt!! ");
						System.out.println("   ");

						System.out.println("=============================================================");
						System.out.println("   ");
						System.out.println("Enter any key to continue!");
						GG.wahl();
						System.out.println("   ");
						PP.FAIL();
						System.out.println("   ");
						System.out.println("Enter any key to continue!");
						GG.wahl();

Ask5: 
						while (true) {
							System.out.println("M�chten Sie noch mal spielen?");
							GG.wahl();

							if ("Ja".equals(GG.auf) || "ja".equals(GG.auf) ||
								"JA".equals(GG.auf)) {
								System.out.println("Sehr gut!!");
								GG.auf = ("11111");

								break TWO;
							} else if ("Nein".equals(GG.auf) ||
									   "NEIN".equals(GG.auf) ||
									   "nein".equals(GG.auf)) {
								System.out.println("Naja, auf wiedersehen!");

								break Hauptspiel;
							} else {
								System.out.println("Bitte nur 'Ja' oder 'Nein' geben!");
							}
						}
					} else if ("8B".equals(ents) || "8b".equals(ents)) {
						System.out.println("=============================================================");
						System.out.println("Du w�hlst los gehen.");
						System.out.println("   ");
						System.out.println("   ");
						System.out.println("Du verl�sst ihr nicht, deshalb gehst du gerade los.");
						System.out.println("Pl�tzlich hast du ein Zombie getroffen!!");
						System.out.println("Jetzt musst du k�mpfen!");
						System.out.println("Naja, mit Black Jack  (= _ = !)");
						System.out.println("=============================================================");
						System.out.println("Enter any key to continue!");
						GG.wahl();
						bj.BlackJake();

						if (bj.ia >= 2) {
							System.out.println("   ");
							System.out.println("Enter any key to continue!");
							GG.wahl();
							System.out.println("   ");
							System.out.println("   ");
							PP.WIN();
							System.out.println("   ");
							System.out.println("   ");
							System.out.println("   ");
							System.out.println("Congratulation!!!  Du hast den Zombie get�tet!!");
							System.out.println("Du bekommst 9999999999999999999999999999 EXP, was macht gar keine Sinn hier!");
							System.out.println("Gehst du weiter!");
							System.out.println("   ");
							System.out.println("=============================================================");
							System.out.println("Enter any key to continue!");
							GG.wahl();
							System.out.println("   ");
							System.out.println("   ");
							System.out.println("Du gehst auf dem Stra�e......");
							System.out.println("Jetzt ist es so chaotisch! Pl�tzlich h�rest du jemand dir anruft!");
							System.out.println("Das sind deine Familian! ");
							System.out.println("Dein Vater sagt, dass es ein Haus in Au�enbezirke gibt, wo sicher ist. ");
							System.out.println("Aber glaubt deine Mutter, dass wir in den Stadt bleiben und auf dem Hilfeleistung warten sollen!");
							System.out.println("Jetzt brauchst du entscheiden, wo zu gehen?");
							System.out.println("   ");
							System.out.println("   ");
							System.out.println("A. Au�erzirke");
							System.out.println("B. In den Stadt warten.");
							System.out.println("=============================================================");

Test12: 
							TT.num = 7;
							TT.Choice();
							ents = TT.entsss;

							break Aufgabe8;
						} else {
							System.out.println("   ");
							System.out.println("   ");
							System.out.println("=============================================================");
							System.out.println("Du hast verloren......");
							System.out.println("Naja, Zombie ist so gef�hrlich, wahlscheilich brauchst du mehr �ben~~~~");
							System.out.println("   ");
							System.out.println("   ");
							System.out.println("Enter any key to continue!");
							GG.wahl();
							PP.FAIL();
							System.out.println("   ");
							System.out.println("Enter any key to continue!");
							GG.wahl();

Ask3: 
							while (true) {
								System.out.println("M�chten Sie noch mal spielen?");
								GG.wahl();

								if ("Ja".equals(GG.auf) || "ja".equals(GG.auf) ||
									"JA".equals(GG.auf)) {
									System.out.println("Sehr gut!!");
									GG.auf = ("11111");

									break TWO;
								} else if ("Nein".equals(GG.auf) ||
										   "NEIN".equals(GG.auf) ||
										   "nein".equals(GG.auf)) {
									System.out.println("Naja, auf wiedersehen!");

									break Hauptspiel;
								} else {
									System.out.println("Bitte nur 'Ja' oder 'Nein' geben!");
								}
							}
						}
					} else {
						break Aufgabe8;
					}
				}

Aufgabe9: 
				while (true) {
					if ("9B".equals(ents) || "9b".equals(ents)) {
						System.out.println("=============================================================");
						System.out.println("Du w�hlst das Bauklotz zu verzichten!");
						System.out.println("   ");
						System.out.println("   ");
						System.out.println("Du hast das Bauklotz versichtet.");
						System.out.println("Du gehst auf dem Stra�e......");
						System.out.println("Jetzt ist es so chaotisch! Pl�tzlich h�rest du jemand dir anruft!");
						System.out.println("Das sind deine Familian! ");
						System.out.println("Dein Vater sagt, dass es ein Haus in Au�enbezirke gibt, wo sicher ist. ");
						System.out.println("Aber glaubt deine Mutter, dass wir in den Stadt bleiben und auf dem Hilfeleistung warten sollen!");
						System.out.println("Jetzt brauchst du entscheiden, wo zu gehen?");
						System.out.println("A. Au�erzirke");
						System.out.println("B. In den Stadt warten.");

						System.out.println("=============================================================");
						System.out.println("   ");
						System.out.println("   ");
Test13: 
						TT.num = 7;
						TT.Choice();
						ents = TT.entsss;

						break Aufgabe9;
					} else if ("9A".equals(ents) || "9a".equals(ents)) {
						System.out.println("=============================================================");
						System.out.println("Du w�hlst das Bauklotz zu nehmen!");
						System.out.println("   ");
						System.out.println("   ");
						System.out.println("=============================================================");
						System.out.println("Du glaubst, dass ohne dem Bauklotz geht es nicht. Du brauchst Waffe!");
						System.out.println("Wegen des schwerigen Bauklotz kannst du nicht so schnell laufen.");
						System.out.println("Ein Zombie hat dir greift!!!!");
						System.out.println("Jetzt musst du nochmal k�mpfen!!!");
						System.out.println("Naja, auch mit Black Jack  (= _ = !)");
						System.out.println("=============================================================");
						System.out.println("Enter any key to continue!");
						GG.wahl();
						bj.BlackJake();

						if (bj.ia >= 2) {
							System.out.println("   ");
							System.out.println("Enter any key to continue!");
							GG.wahl();
							System.out.println("   ");
							System.out.println("   ");
							PP.WIN();
							System.out.println("   ");
							System.out.println("   ");
							System.out.println("   ");
							System.out.println("Congratulation!!!  Du hast den Zombie get�tet!!");
							System.out.println("Du bekommst 49999999999999 EXP, was macht gar keine Sinn hier!");
							System.out.println("Gehst du weiter!");
							System.out.println("   ");
							System.out.println("Enter any key to continue!");
							GG.wahl();
							System.out.println("   ");
							System.out.println("=============================================================");
							System.out.println("   ");
							System.out.println("Du hast den Zombie get�tet!!!!!");
							System.out.println("Du gehst weiter auf dem Stra�e......");
							System.out.println("Jetzt ist es so chaotisch! Pl�tzlich h�rest du jemand dir anruft!");
							System.out.println("Das sind deine Familian! ");
							System.out.println("Dein Vater sagt, dass es ein Haus in Au�enbezirke gibt, wo sicher ist. ");
							System.out.println("Aber glaubt deine Mutter, dass wir in den Stadt bleiben und auf dem Hilfeleistung warten sollen!");
							System.out.println("Jetzt brauchst du entscheiden, wo zu gehen?");
							System.out.println("A. Au�erzirke");
							System.out.println("B. In den Stadt warten.");
							System.out.println("   ");
							System.out.println("=============================================================");
							System.out.println("   ");
Test14: 
							TT.num = 7;
							TT.Choice();
							ents = TT.entsss;

							break Aufgabe9;
						} else {
							System.out.println("   ");
							System.out.println("   ");
							System.out.println("=============================================================");
							System.out.println("Du hast verloren......");
							System.out.println("Naja, Zombie ist so gef�hrlich, wahlscheilich brauchst du mehr �ben~~~~");
							System.out.println("   ");
							System.out.println("   ");
							System.out.println("Enter any key to continue!");
							GG.wahl();
							System.out.println("   ");
							PP.FAIL();
							System.out.println("   ");
							System.out.println("Enter any key to continue!");
							GG.wahl();
Ask6: 
							while (true) {
								System.out.println("M�chten Sie noch mal spielen?");
								GG.wahl();

								if ("Ja".equals(GG.auf) || "ja".equals(GG.auf) ||
									"JA".equals(GG.auf)) {
									System.out.println("Sehr gut!!");
									GG.auf = ("11111");

									break TWO;
								} else if ("Nein".equals(GG.auf) ||
										   "NEIN".equals(GG.auf) ||
										   "nein".equals(GG.auf)) {
									System.out.println("Naja, auf wiedersehen!");

									break Hauptspiel;
								} else {
									System.out.println("Bitte nur 'Ja' oder 'Nein' geben!");
								}
							}
						}
					} else {
						break Aufgabe9;
					}
				}

Aufgabe10: 
				while (true) {
					if ("10A".equals(ents) || "10a".equals(ents)) {
						System.out.println("=============================================================");
						System.out.println("Du w�hlst nur mit deiner besten Freunden zu erz�hlen und jegendwo zu gehen.");
						System.out.println("   ");
						System.out.println("   ");
						System.out.println("Du hast mit deinen Freunden diskutiert und entscheiden ihr nach andere Stadt gehen.");
						System.out.println("Jetzt habt ihr zwei Entscheidungen.");
						System.out.println("   ");
						System.out.println("A. Personenkraftwagen, was sehr schnell laufen kann.");
						System.out.println("B. Minibus, was viele Ressourcen tragen kann.");
						System.out.println("=============================================================");
Test15: 
						TT.num = 11;
						TT.Choice();
						ents = TT.entsss;

						break Aufgabe10;
					} else if ("10B".equals(ents) || "10b".equals(ents)) {
						System.out.println("=============================================================");
						System.out.println("Du w�hlst mit allen Studenten in Bibliothek zu erz�hlen, was drau�en passiert.");
						System.out.println("   ");
						System.out.println("   ");
						System.out.println("Du hast schon ein mal alles erz�hlt, aber einigen Leute nicht glauben auf dir.");
						System.out.println("Du probierst zu erkl�ren, aber funktioniert nicht. Jetzt m�chtest du ein Gruppe stellen, um in der gef�hrliche Welt zu �berleben.");
						System.out.println("Deine Freunden nat�rlich glauben auf dir. ");
						System.out.println("Aber was �berrascht dich ist, dass dein Feind auch teilnehmen m�chte, mit wem habt ihr viel mals streitet.");
						System.out.println("Was willst du jetzt entscheiden?");
						System.out.println("A. Erlaubt. Es ist egal, ob ihr Feinden seit. Die wichtig Sachen ist �berleben.");
						System.out.println("B. Nicht erlaubt. Jetzt hast du endlich ein Chance zu r�chen.");
						System.out.println("=============================================================");
Test16: 
						TT.num = 13;
						TT.Choice();
						ents = TT.entsss;

						break Aufgabe10;
					} else {
						break Aufgabe10;
					}
				}

Aufgabe11: 
				while (true) {
					if ("11A".equals(ents) || "11a".equals(ents)) {
						System.out.println("=============================================================");
						System.out.println("Du w�hlst Personenkraftwagen!");
						System.out.println("   ");
						System.out.println("   ");
						System.out.println("Du willst schnelle Fahrzeug nehmen.");
						System.out.println("Das Personenkraftwagen f�hrt schneller als Minibus. Mit dem k�nnten ihr schneller ihre Ziel ankommen.");
						System.out.println("Aber es ist auch nicht so gut.");
						System.out.println("Das Personenkraftwagen kann ihr keinen genuge Platz bieten. Schlafen, Ressourcen zu nehmen, oderLagern ist immer so schwer.");
						ents = ("RSLC");
						System.out.println("==================================================================================================================================================");
						System.out.println("==================================================================================================================================================");

						break Aufgabe11;
					} else if ("11B".equals(ents) || "11b".equals(ents)) {
						System.out.println("=============================================================");
						System.out.println("Du w�hlst Minibus!");
						System.out.println("   ");
						System.out.println("   ");
						System.out.println("Du willst mehr Sachen nehmen. Weil du weisst, dass die Ressourcen die wichtigsten Sachen ist.");
						System.out.println("Wahrscheinlich ist es nicht so schnell wie Personenkraftwagen, aber mit dem Minibus habt ihr genuge Platz zu schlafen, erholen.");
						System.out.println("Auf die Dauer sehen, das ist eine gute Entscheidung.");
						ents = ("RSLA");
						System.out.println("==================================================================================================================================================");
						System.out.println("==================================================================================================================================================");

						break Aufgabe11;
					} else {
						break Aufgabe11;
					}
				}

Aufgabe12: 
				while (true) {
					if ("12A".equals(ents) || "12a".equals(ents)) {
						System.out.println("=============================================================");
						System.out.println(" Du w�hlst dein Haus  zu absperren, nur mit Keller zu drau�en.");
						System.out.println("   ");
						System.out.println("   ");
						System.out.println("Du absprrest dein Haus, l�sst nur ein Ausgang im Keller.");
						System.out.println("Also ist es sicher, aber nicht biegsam genug.");
						System.out.println("Falls Zombie das einzigr Ausgang gefunden hat, wird es sehr gef�rhlich sein!!");
						System.out.println("Sowieso, deine Entscheidung ist schon gut genug!");
						ents = ("RSLB");
						System.out.println("==================================================================================================================================================");
						System.out.println("==================================================================================================================================================");

						break Aufgabe12;
					} else if ("12B".equals(ents) || "12b".equals(ents)) {
						System.out.println("=============================================================");
						System.out.println("Du w�hlst im Umfeld deines Haus viele Fallstrick zu stellen.");
						System.out.println("   ");
						System.out.println("   ");
						System.out.println("Du hast vielen Fallstrick neben deinen Haus gestellt.");
						System.out.println("Aber weisst du, einigen Fallstrick funktionieren nicht auf dem Zombie, und einige kann man nur einmal benutzen!!");
						System.out.println("Deine Entscheidung ist okay, aber dein Haus kann nie als ein sichen Platz sein.");
						ents = ("RSLC");
						System.out.println("==================================================================================================================================================");
						System.out.println("==================================================================================================================================================");

						break Aufgabe12;
					} else {
						break Aufgabe12;
					}
				}

Aufgabe13: 
				while (true) {
					if ("13A".equals(ents) || "13a".equals(ents)) {
						System.out.println("=============================================================");
						System.out.println("Du w�hlst dein Feind teilzunehmen!!");
						System.out.println("   ");
						System.out.println("   ");
						System.out.println("Du m�chtest nur �berleben. In der neue Welt, alle Fehde sind nicht so wichtig. ");
						System.out.println("Auch eingentlich habt ihr gar keine Fehde.");
						System.out.println("'Danke!' Er sagt. Jetzt bekommst du eine neue Freunden!!");
						System.out.println("Deine Entscheidung ist sehr gut. Wahrscheilich bevor magst du ihn nicht, aber jetzt alles sind schon passiert!");
						System.out.println("Es ist immer so, ein Freunden mehr ist besser als ein Feind mehr!");
						ents = ("RSLA");
						System.out.println("==================================================================================================================================================");
						System.out.println("==================================================================================================================================================");

						break Aufgabe13;
					} else if ("13B".equals(ents) || "13b".equals(ents)) {
						System.out.println("=============================================================");
						System.out.println("Du w�hlst ihn zu rauswerfen.");
						System.out.println("   ");
						System.out.println("   ");
						System.out.println("Du findest, dass es eine fute Chance zu r�schen.");
						System.out.println("Also, ist jetzt egal, ob er dein Gruppe teilnimmt.");
						System.out.println("Aber seine Emp�rung macht dir auch sehr unbequem.");
						System.out.println("'Ist es wirklich eine gute Entscheidung?' Du fragst dein selbst, aber bekommst keine Antworte.....");
						ents = ("RSLC");
						System.out.println("==================================================================================================================================================");
						System.out.println("==================================================================================================================================================");

						break Aufgabe13;
					} else {
						break Aufgabe13;
					}
				}

Result: 
				while (true) {
					if ("RSLA".equals(ents)) {
						System.out.println("Enter any key to continue!");
						GG.wahl();
						System.out.println("******************************************************************");
						System.out.println("******************************************************************");
						System.out.println("Ergebnis:");
						System.out.println("    ");
						System.out.println("    ");
						System.out.println("    ");
						System.out.println(" ==============================================================                                                  ");
						System.out.println(" | +++++++@@+++++++++++@@@+++++++++++++@@@++++++++++++++@@++++ |                                                  ");
						System.out.println(" | +++++@@@@+++++++++@@+++@@+++++++++@@+++@@++++++@++++@@+++++ |                                                  ");
						System.out.println(" | ++++@@+@@++++++++@@+++++@@+++++++@@+++++@@++++@+@++@@++++++ |                                                  ");
						System.out.println(" | +++++++@@++++++++@@+++++@@+++++++@@+++++@@+++++@++@@+++++++ |                                                  ");
						System.out.println(" | +++++++@@++++++++@@+++++@@+++++++@@+++++@@+++++++@@++++++++ |                                                  ");
						System.out.println(" | +++++++@@+++++++++@@+++@@+++++++++@@+++@@+++++++@@+++@+++++ |                                                  ");
						System.out.println(" | ++++@@@@@@@@++++++++@@@+++++++++++++@@@++++++++@@+++@+@++++ |                                                  ");
						System.out.println(" | ++++++++++++++++++++++++++++++++++++++++++++++@@+++++@+++++ |                                                  ");
						System.out.println(" ==============================================================                                                   ");
						System.out.println("  ");
						System.out.println("100%  THE LAST SURVIVAL!!!");
						System.out.println("   ");
						System.out.println("Enter any key to continue!");
						GG.wahl();
						System.out.println("   ");
						System.out.println("   ");
						System.out.println("=============================================================");
						System.out.println("Law of Jungle.");
						System.out.println("In der gef�hrliche Welt k�nnen nur die Straker �berleben!");
						System.out.println("Deine Lebensf�higkeit ist so gut, dass du immer der letzt leute bist!!!");
						System.out.println("Congratulation! The last survival!!");
						System.out.println("=============================================================");
						System.out.println("Enter any key to continue!");
						GG.wahl();
Aska: 
						while (true) {
							System.out.println("M�chten Sie noch mal spielen?");
							GG.wahl();

							if ("Ja".equals(GG.auf) || "ja".equals(GG.auf) ||
								"JA".equals(GG.auf)) {
								System.out.println("Sehr gut!!");
								GG.auf = ("11111");

								break TWO;
							} else if ("Nein".equals(GG.auf) ||
									   "NEIN".equals(GG.auf) ||
									   "nein".equals(GG.auf)) {
								System.out.println("Naja, auf wiedersehen, the Last Survival!!");

								break Hauptspiel;
							} else {
								System.out.println("Bitte nur 'Ja' oder 'Nein' geben!");
							}
						}
					} else if ("RSLB".equals(ents)) {
						System.out.println("Enter any key to continue!");
						GG.wahl();
						System.out.println("******************************************************************");
						System.out.println("******************************************************************");
						System.out.println("Ergebnis:");
						System.out.println("    ");
						System.out.println("    ");
						System.out.println("    ");
						System.out.println(" ==============================================================                                                   ");
						System.out.println(" | +++++@@@@@@@@@+++++++@@@@@@@@@+++++++       @@              |                                                  ");
						System.out.println(" | +++++++++++@@++++++++@@+++++++++++++  @    @@               |                                                  ");
						System.out.println(" | ++++++++++@@+++++++++@@@@@@@++++++++ @ @  @@                |                                                  ");
						System.out.println(" | +++++++++@@+++++++++++++++@@@@++++++  @  @@                 |                                                  ");
						System.out.println(" | ++++++++@@++++++++++++++++++@@@++++++   @@  @               |                                                  ");
						System.out.println(" | ++++++++@@+++++++++++@@+++++@@@++++++  @@  @ @              |                                                  ");
						System.out.println(" | ++++++++@@++++++++++++@@@@@@@+++++++  @@    @               |                                                  ");
						System.out.println(" ==============================================================                                                   ");
						System.out.println("  ");
						System.out.println("75% THE STRONG SURVIVAL!!!");
						System.out.println("   ");
						System.out.println("Enter any key to continue!");
						GG.wahl();
						System.out.println("   ");
						System.out.println("   ");
						System.out.println("=============================================================");
						System.out.println("Du hast sehr gute Anpassungsf�higkeit!");
						System.out.println("Jegendwelche Probkeme kannst du sehr gute L�sung ausfinden!");
						System.out.println("Du willst sehr gute in der gef�hrliche Welt �berleben!!");
						System.out.println("Congratulaton! The strong survival!!!");
						System.out.println("=============================================================");
						System.out.println("Enter any key to continue!");
						GG.wahl();
Askb: 
						while (true) {
							System.out.println("M�chten Sie noch mal spielen?");
							GG.wahl();

							if ("Ja".equals(GG.auf) || "ja".equals(GG.auf) ||
								"JA".equals(GG.auf)) {
								System.out.println("Sehr gut!!");
								GG.auf = ("11111");

								break TWO;
							} else if ("Nein".equals(GG.auf) ||
									   "NEIN".equals(GG.auf) ||
									   "nein".equals(GG.auf)) {
								System.out.println("Naja, auf wiedersehen, the Strong Survival!!");

								break Hauptspiel;
							} else {
								System.out.println("Bitte nur 'Ja' oder 'Nein' geben!");
							}
						}
					} else if ("RSLC".equals(ents)) {
						System.out.println("Enter any key to continue!");
						GG.wahl();
						System.out.println("******************************************************************");
						System.out.println("******************************************************************");
						System.out.println("Ergebnis:");
						System.out.println("    ");
						System.out.println("    ");
						System.out.println("    ");
						System.out.println(" ==============================================================                                                   ");
						System.out.println(" | +++++++++@@+++++++  @@@@@@@@@@           @@                |                                                  ");
						System.out.println(" | ++++++++@@++++++++  @@            @     @@                 |                                                  ");
						System.out.println(" | +++++++@@++@@+++++  @@           @ @   @@                  |                                                  ");
						System.out.println(" | ++++++@@+++@@+++++  @@@@@@@@      @   @@                   |                                                  ");
						System.out.println(" | +++++@@@@@@@@@@+++        @@@        @@  @                 |                                                  ");
						System.out.println(" | +++++++++++@@+++++  @@     @@@      @@  @ @                |                                                  ");
						System.out.println(" | +++++++++++@@+++++   @@@@@@@@      @@    @                 |                                                  ");
						System.out.println(" ==============================================================                                                   ");
						System.out.println("45% THE NORMAL SURVIVAL!!!");
						System.out.println("   ");
						System.out.println("Enter any key to continue!");
						GG.wahl();
						System.out.println("   ");
						System.out.println("   ");
						System.out.println("=============================================================");
						System.out.println("Zurerst muss ich dir gratulieren, dass du hier angekommt hast.");
						System.out.println("Hast du alle Aufgaben gel�sst bedeutet, dass du schon besser als 80% Leute!");
						System.out.println("Aber das ist nicht so genug.");
						System.out.println("Wahrscheinlich willst du �berleben, aber musst du immer erinnen, dass es die Gef�rhlichkeit �berall gibt!");
						System.out.println("Fleissig und sorgf�lltig sein, willst du immer besser!!!");
						System.out.println("Congratulation! The normal survival!");
						System.out.println("=============================================================");
						System.out.println("Enter any key to continue!");
						GG.wahl();
Askc: 
						while (true) {
							System.out.println("M�chten Sie noch mal spielen?");
							GG.wahl();

							if ("Ja".equals(GG.auf) || "ja".equals(GG.auf) ||
								"JA".equals(GG.auf)) {
								System.out.println("Sehr gut!!");
								GG.auf = ("11111");

								break TWO;
							} else if ("Nein".equals(GG.auf) ||
									   "NEIN".equals(GG.auf) ||
									   "nein".equals(GG.auf)) {
								System.out.println("Naja, auf wiedersehen, the Normal Survival!!");

								break Hauptspiel;
							} else {
								System.out.println("Bitte nur 'Ja' oder 'Nein' geben!");
							}
						}
					} else {
						break Result;
					}
				}
			}
		}

		PP.Title();
	}
}

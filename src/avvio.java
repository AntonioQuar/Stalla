import java.util.Scanner;
public class Avvio {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		gestoreStalla metodi = new gestoreStalla();
		int scelta;
		do {
			metodi.menu();
			System.out.println("");
			System.out.println("Seleziona un metodo: ");
			scelta = Integer.parseInt(input.nextLine());
			switch (scelta) {
			case 1:
				metodi.aggiungiAnimale();
				System.out.println("Premi un tasto per continuare");
				input.nextLine();
				break;
			case 2:
				metodi.leggiAnimale();
				System.out.println("Premi un tasto per continuare");
				input.nextLine();
				break;
//			case 3:
//				metodi.leggiAnimali();
//				System.out.println("Premi un tasto per continuare");
//				input.nextLine();
//				break;
//			case 4:
//				metodi.rimuoviAnimali();
//				System.out.println("Premi un tasto per continuare");
//				input.nextLine();
//				break;
			}
		}
		while (scelta !=5);
		System.out.println("Statt buon.");
	}	
}

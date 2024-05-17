public class avvio {

	public static void main(String[] args) {
		do {
			System.out.println("");
			System.out.println("Seleziona un'operazione: ");
			scelta = Integer.parseInt(input.nextLine());
			switch (scelta) {
			case 1:
				aggiungiAnimale();
				System.out.println("Premi un tasto per continuare");
				input.nextLine();
				break;
			case 2:
				leggiAnimale(int id);
				System.out.println("Premi un tasto per continuare");
				input.nextLine();
				break;
				case3:
					leggiAnimali();
				System.out.println("Premi un tasto per continuare");
				input.nextLine();
				break;
			case 4:
				rimuoviAnimale (int id);
				System.out.println("Premi un tasto per continuare");
				input.nextLine();
				break;
			case 5:
				exit;
				break;
			}
			while (scelta !=5);
			System.out.println("Statt buon.");
		}

	}

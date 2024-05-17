import java.util.Scanner;
public class gestoreStalla {
	String[] stalla = new String [5]; 
	Scanner input = new Scanner(System.in);
	String campi;

	void menu() {
		System.out.println("");
		System.out.println("   ***MENU***   ");
		System.out.println("1) Aggiungi animale.");
		System.out.println("2) visualizza animale.");
		System.out.println("3) Visualizza tutti gli animali");
		System.out.println("4) Rimuovi animale");
		System.out.println("5) EXIT");
	}

	void aggiungiAnimale() {
		for(int i = 0; i<stalla.length; i++) {
			if (stalla[i] == null) {
				System.out.println("Aggiungi animale:  ");
				System.out.println("id: ");
				int id = Integer.parseInt(input.nextLine());
				System.out.println("Tipo animale: ");
				String tipoAnimale =  input.nextLine();
				System.out.println("Provenienza: ");
				String provenienza = input.nextLine();
				System.out.println("Alimentazione: ");
				String alimentazione = input.nextLine();
				System.out.println("Valore: ");
				double valore = Double.parseDouble(input.nextLine());
				String animale = id + ";" + tipoAnimale + ";" + provenienza + ";" + alimentazione + ";" + valore;
				System.out.println("Hai aggiunto: ");
				System.out.println("id: " + id);
				System.out.println("Tipo animale: " + tipoAnimale);
				System.out.println("Provenienza: " + provenienza);
				System.out.println("Alimentazione: " + alimentazione);
				System.out.println("Valore: " + valore + " $");
				stalla[i] = animale;
			}
			break;
		}
	}
	void leggiAnimale() {
		System.out.println("Inserire ID da ricercare:  ");
		int idRicerca = Integer.parseInt(input.nextLine());
		for (int i=0; i<stalla.length; i++) {
			if (idRicerca == campi[0]) {
				System.out.println();
			}

		}



	}

}

import java.util.Scanner;
public class gestoreStalla {
	String[] stalla = new String [5]; 
	Scanner input = new Scanner(System.in);

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
				System.out.println("");
				stalla[i] = animale;
				break;
			}
			else
				System.out.println("ATTENZIONE! Stalla piena");
		}

	}

	void leggiAnimale(int id) {
		String animale;
		for (int i=0; i<stalla.length; i++) {
			animale = stalla[i];
			String[] campi = animale.split(";");
			int idAnimale = Integer.parseInt(campi[0]);
			if(idAnimale == id) {
				System.out.println("   ***SCHEDA ANIMALE***   ");
				System.out.println("id: " + campi[0]);
				System.out.println("Tipo animale: " + campi[1]);
				System.out.println("Provenienza: " + campi[2]);
				System.out.println("Alimentazione: " + campi[3]);
				System.out.println("Valore: " + campi[4] + " $");
				System.out.println("");
				break;
			}
		}
	}
void leggiAnimali() {
	String animale;
	for (int i=0; i<stalla.length; i++) {
		animale = stalla[i];
		String[] campi = animale.split(";");
		 {
			System.out.println("   ***SCHEDA ANIMALE***   ");
			System.out.println("id: " + campi[0]);
			System.out.println("Tipo animale: " + campi[0]);
			System.out.println("Provenienza: " + campi[1]);
			System.out.println("Alimentazione: " + campi[2]);
			System.out.println("Valore: " + campi[3] + " $");
			System.out.println("");
			break;
		}
	}
}




}



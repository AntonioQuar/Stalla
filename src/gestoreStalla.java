import java.util.Scanner;
public class gestoreStalla {
	String[] stalla = new String [5]; 
	Scanner input = new Scanner(System.in);
	int i = 0;
	
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
		int id = Integer.parseInt(input.nextLine());
		String tipoAnimale =  input.nextLine();
		String provenienza = input.nextLine();
		String alimentazione = input.nextLine();
		double valore = Double.parseDouble(input.nextLine());
		String animale = id + ";" + tipoAnimale + ";" + provenienza + ";" + alimentazione + ";" + valore;
		String[] campi = animale.split(";");
		System.out.println("Hai aggiunto: ");
		System.out.println("id: " + id);
		System.out.println("Tipo animale: " + tipoAnimale);
		System.out.println("Provenienza: " + provenienza);
		System.out.println("Alientazione: " + alimentazione);
		System.out.println("Valore: " + valore);
		stalla[i] = animale;
		i++;
		
	}
	void leggiAnimale() {
	System.out.println("Inserire ID da ricercare:  ");
	int idRicerca = Integer.parseInt(input.nextLine());
	for (int i=0; i<stalla.length; i++) {
	if (idRicerca ==  ) 
	
	}



	}

}

import java.util.Scanner;
public class Alunno {
	Scanner sc = new Scanner(System.in);
	private double primo_esercizio;
	private double secondo_esercizio;
	private char lettera_es_1;
	private char lettera_es_2;
	private double esame_intermedio_1;
	private double esame_intermedio_2;
	private double esame_finale;
	private char lettera_esame_inter_1;
	private char lettera_esame_inter_2;
	private char lettera_esame_finale;
	private double perc_es_1;
	private double perc_es_2;
	private double perc_es_inter_1;
	private double perc_es_inter_2;
	private double perc_es_finale;
	private String nome;
	private String cognome;
	
	public void InitParametri() {
		primo_esercizio = 0;
		secondo_esercizio=0;
		lettera_es_1 = ' ';
		lettera_es_2 = ' ';
		esame_intermedio_1 = 0;
		esame_intermedio_2 = 0;
		esame_finale =0;
		lettera_esame_inter_1 = ' ';
		lettera_esame_inter_2 = ' ';
		lettera_esame_finale = ' ';
		perc_es_1 =0;
		perc_es_2=0;
		perc_es_inter_1=0;
		perc_es_inter_2=0;
		perc_es_finale = 0;
		nome = "";
		cognome = "";
	}
	public void input() {
		System.out.println("Inserisci il nome:");
		this.nome = sc.next();
		System.out.println("Inserisci il cognome:");
		this.cognome = sc.next();
		System.out.println("Inserisci il punteggio del primo esercizio:");
		this.primo_esercizio = sc.nextDouble();
		System.out.println("Inserisci il punteggio del secondo esercizio:");
		this.secondo_esercizio = sc.nextDouble();
		System.out.println("Inserisci il punteggio dell'esame intermedio 1:");
		this.esame_intermedio_1 = sc.nextDouble();
		System.out.println("Inserisci il punteggio dell'esame intermedio 2:");
		this.esame_intermedio_2 = sc.nextDouble();
		System.out.println("Inserisci il punteggio dell'esame finale:");
		this.esame_finale = sc.nextDouble();
	}
	public String get_cognome() {
		return set_cognome();	
	}
	public String set_cognome() {
		return this.cognome;
	}
	public String get_nome() {
		return set_nome();
	}
	public String set_nome() {
		return this.nome;
	}
	public double get_primo_esercizio() {
		return set_primo_esercizio();
	}
	public double set_primo_esercizio() {
		this.perc_es_1 = (this.primo_esercizio/10)*100;
		return this.perc_es_1;
	}
	public char get_lettera_es_1() {
		return set_lettera_es_1();
	}
	public char set_lettera_es_1() {
		if(this.perc_es_1>90) {
			this.lettera_es_1 = 'A';	
			return this.lettera_es_1;
		}
		else if(this.perc_es_1<= 89 && this.perc_es_1>=80) {
			this.lettera_es_1 = 'B';
			return this.lettera_es_1;
		}
		else if(this.perc_es_1<= 79 && this.perc_es_1>=70) {
			this.lettera_es_1 = 'C';
			return this.lettera_es_1;
		}
		else if(this.perc_es_1<= 69 && this.perc_es_1>=60) {
			this.lettera_es_1 = 'B';
			return this.lettera_es_1;
		}
		else if(this.perc_es_1 <60) {
			this.lettera_es_1 = 'F';
			return this.lettera_es_1;	
		}
		return lettera_es_1;
	}
	public double get_secondo_esercizio() {
		return  set_secondo_esercizio();	
	}
	public double set_secondo_esercizio() {
		this.perc_es_2 = (this.secondo_esercizio/10)*100;
		return this.perc_es_2;
	}
	public char get_lettera_es_2() {
		return set_lettera_es_2();
	}
	public char set_lettera_es_2() {
		if(this.perc_es_2>90) {
			this.lettera_es_2 = 'A';
			return this.lettera_es_2;
		}
		else if(this.perc_es_2<= 89 && this.perc_es_2>=80) {
			this.lettera_es_2= 'B';
			return this.lettera_es_2;
		}
		else if(this.perc_es_2<= 79 && this.perc_es_2>=70) {
			this.lettera_es_2 = 'C';
			return this.lettera_es_2;
		}
		else if(this.perc_es_2<= 69 && this.perc_es_2>=60) {
			this.lettera_es_2 = 'B';
			return this.lettera_es_2;
		}
		else if(this.perc_es_2<60){
			this.lettera_es_2 = 'F';
			return this.lettera_es_2;
		}
		return this.lettera_es_2;
	}
	public double get_esame_intermedio_1() {
		return set_esame_intermedio_1();
	}
	public double set_esame_intermedio_1() {
		this.perc_es_inter_1=(this.esame_intermedio_1/10)*100;
		return this.perc_es_inter_1;
	}
	public char get_lettera_esame_inter_1() {
		return set_lettera_esame_inter_1();
	}
	public char set_lettera_esame_inter_1() {
		if(this.perc_es_inter_1>90) {
			this.lettera_esame_inter_1 = 'A';	
			return this.lettera_esame_inter_1;
		}
		else if(this.perc_es_inter_1<= 89 && this.perc_es_inter_1>=80) {
			this.lettera_esame_inter_1 = 'B';
			return this.lettera_esame_inter_1;
		}
		else if(this.perc_es_inter_1<= 79 && this.perc_es_inter_1>=70) {
			this.lettera_esame_inter_1 = 'C';
			return this.lettera_esame_inter_1;
		}
		else if(this.perc_es_inter_1<= 69 && this.perc_es_inter_1>=60) {
			this.lettera_esame_inter_1 = 'B';
			return this.lettera_esame_inter_1;
		}
		else if(this.perc_es_inter_1<60) {
			this.lettera_esame_inter_1 = 'F';
			return this.lettera_esame_inter_1;	
		}
		return lettera_esame_inter_1;	
	}
	public double get_esame_intermedio_2() {
		return set_esame_intermedio_2();
	}
	public double set_esame_intermedio_2() {
		this.perc_es_inter_2=(this.esame_intermedio_2/10)*100;
		return this.perc_es_inter_2;
	}
	public char get_lettera_esame_inter_2() {
		return this.lettera_esame_inter_2 = set_lettera_esame_inter_2();
	}
	public char set_lettera_esame_inter_2() {
		if(this.perc_es_inter_2>90) {
			this.lettera_esame_inter_2 = 'A';	
			return this.lettera_esame_inter_2;
		}
		else if(this.perc_es_inter_2<= 89 && this.perc_es_inter_2>=80) {
			this.lettera_esame_inter_2 = 'B';
			return this.lettera_esame_inter_2;
		}
		else if(this.perc_es_inter_2<= 79 && this.perc_es_inter_2>=70) {
			this.lettera_esame_inter_2 = 'C';
			return this.lettera_esame_inter_2;
		}
		else if(this.perc_es_inter_2<= 69 && this.perc_es_inter_2>=60) {
			this.lettera_esame_inter_2 = 'B';
			return this.lettera_esame_inter_2;
		}
		else if(this.perc_es_inter_2<60) {
			this.lettera_esame_inter_2 = 'F';	
			return this.lettera_esame_inter_2;	
		}
		return lettera_esame_inter_2;
	}
	public double get_esame_finale() {
		return set_esame_finale();
	}
	public double set_esame_finale() {
		this.perc_es_finale=(this.esame_finale/10)*100;
		return this.perc_es_finale;
	}
	public char get_lettera_esame_finale() {
		return set_lettera_esame_finale();
	}
	public char set_lettera_esame_finale() {
		if(this.perc_es_finale>90) {
			this.lettera_esame_finale = 'A';	
			return this.lettera_esame_finale;
		}
		else if(this.perc_es_finale<= 89 && this.perc_es_finale>=80) {
			this.lettera_esame_finale = 'B';
			return this.lettera_esame_finale;
		}
		else if(this.perc_es_finale<= 79 && this.perc_es_finale>=70) {
			this.lettera_esame_finale = 'C';
			return this.lettera_esame_finale;
		}
		else if(this.perc_es_finale<= 69 && this.perc_es_finale>=60) {
			this.lettera_esame_finale = 'B';
			return this.lettera_esame_finale;
		}
		else if(this.perc_es_finale<60) {
			this.lettera_esame_finale = 'F';
			return this.lettera_esame_finale;		
		}
		return lettera_esame_finale;
	}
	public double punteggio_finale() {
		double punteggio_es_finale = ((50*this.esame_finale)/100);
		double punteggio_es_intermedi = ((12.5*(this.esame_intermedio_1+this.esame_intermedio_2)/100));
		double punteggio_esercizi = ((12.5*(this.primo_esercizio+this.secondo_esercizio)/100));
		double somma = punteggio_es_finale + punteggio_es_intermedi + punteggio_esercizi;
		return somma;	
	}	
}

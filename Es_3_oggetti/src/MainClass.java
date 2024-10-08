
public class MainClass {

	public static void main(String[] args) {
		test_esami();
	}
	public static void test_esami() {
		Alunno alu = new Alunno();	
		alu.get_nome();
		alu.get_cognome();	
		alu.get_primo_esercizio();
		System.out.println(alu.get_lettera_es_1());
		alu.get_secondo_esercizio();
		System.out.println(alu.get_lettera_es_2());
		alu.get_esame_intermedio_1();
		System.out.println(alu.get_lettera_esame_inter_1());
		alu.get_esame_intermedio_2();
		System.out.println(alu.get_lettera_esame_inter_2());
		alu.get_esame_finale();
		System.out.println(alu.get_lettera_esame_finale());
		System.out.println("Il punteggio finale è:"+alu.punteggio_finale());
	}	
	
		
}	

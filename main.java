package PacoteJava6;

public class main {
	public static void main(String args []) {
		Cachorro dog = new Cachorro();
		Cavalo valo = new Cavalo();
		Pregui�a gui�a = new Pregui�a();
		
		dog.setSom("Au Au!");
		valo.setSom("IIIRRRIRIHIRHIHR");
		gui�a.setSom("Hmmm q soninho...");
		
		System.out.println(dog.getSom());
		System.out.println(valo.getSom());
		System.out.println(gui�a.getSom());
		
	}
}

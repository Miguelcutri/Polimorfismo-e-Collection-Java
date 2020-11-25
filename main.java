package PacoteJava6;

public class main {
	public static void main(String args []) {
		Cachorro dog = new Cachorro();
		Cavalo valo = new Cavalo();
		Preguiça guiça = new Preguiça();
		
		dog.setSom("Au Au!");
		valo.setSom("IIIRRRIRIHIRHIHR");
		guiça.setSom("Hmmm q soninho...");
		
		System.out.println(dog.getSom());
		System.out.println(valo.getSom());
		System.out.println(guiça.getSom());
		
	}
}

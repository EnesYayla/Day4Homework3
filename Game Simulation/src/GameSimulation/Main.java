package GameSimulation;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hocam oturdum d���nd�m SOLID e uymak i�in bu fikri buldum, �izdi�im yoldaki");
		System.out.println("sorunlar� bildirirseniz �ok mult olurum ��nk� ilk defa sizile yaz�l�ma");
		System.out.println("ba�layan biri olarak bu �dev beni 'verilen i�i yapmak konusunda' zorlamad�,");
		System.out.println("verilen i�i do�ru yapmak k�sm�nda zorlad�, geri bildirim i�in Discord Enes_42");
		System.out.println(", iyi 'g�nler' hocam :)");
		String bosluk = "------------------------------------------";
		System.out.println(bosluk);

		
		
		
		
		BaseGamerManager baseGamerManager = new ExpertGamerManager(new GamerCheckManager());
		Gamer gamer = new Gamer("Can", "Sungur", "45634633641", "1986", "CSNABER");
		baseGamerManager.save(gamer);
		baseGamerManager.update(gamer);
		baseGamerManager.delete(gamer);
		System.out.println(bosluk);
		
		BaseGamerManager baseGamerManager2 = new RookieGamerManager(new GamerCheckManager());
		Gamer gamer2 = new Gamer("Enes", "Yayla", "32402140103", "2003", "EBURW�N");
		baseGamerManager2.save(gamer2);
		baseGamerManager2.update(gamer2);
		baseGamerManager2.delete(gamer2);
		System.out.println(bosluk);

		baseGamerManager.sellToGamer(gamer, baseGamerManager);
		System.out.println(bosluk);
		baseGamerManager.sellToGamer2(gamer, baseGamerManager);
		System.out.println(bosluk);
		baseGamerManager.sellToGamer3(gamer, baseGamerManager);
		System.out.println(bosluk);
		
		baseGamerManager2.sellToGamer(gamer2, baseGamerManager2);
		System.out.println(bosluk);
		baseGamerManager2.sellToGamer2(gamer2, baseGamerManager2);
		System.out.println(bosluk);
		baseGamerManager2.sellToGamer3(gamer2, baseGamerManager2);
		
		
		

	}

}

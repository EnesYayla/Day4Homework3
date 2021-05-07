package GameSimulation;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hocam oturdum düþündüm SOLID e uymak için bu fikri buldum, çizdiðim yoldaki");
		System.out.println("sorunlarý bildirirseniz çok mult olurum çünkü ilk defa sizile yazýlýma");
		System.out.println("baþlayan biri olarak bu ödev beni 'verilen iþi yapmak konusunda' zorlamadý,");
		System.out.println("verilen iþi doðru yapmak kýsmýnda zorladý, geri bildirim için Discord Enes_42");
		System.out.println(", iyi 'günler' hocam :)");
		String bosluk = "------------------------------------------";
		System.out.println(bosluk);

		
		
		
		
		BaseGamerManager baseGamerManager = new ExpertGamerManager(new GamerCheckManager());
		Gamer gamer = new Gamer("Can", "Sungur", "45634633641", "1986", "CSNABER");
		baseGamerManager.save(gamer);
		baseGamerManager.update(gamer);
		baseGamerManager.delete(gamer);
		System.out.println(bosluk);
		
		BaseGamerManager baseGamerManager2 = new RookieGamerManager(new GamerCheckManager());
		Gamer gamer2 = new Gamer("Enes", "Yayla", "32402140103", "2003", "EBURWÝN");
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

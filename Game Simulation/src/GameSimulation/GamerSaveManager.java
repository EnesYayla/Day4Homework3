package GameSimulation;

public class GamerSaveManager extends GamerUpdateManager implements GamerSaveService {

	@Override
	public void save(Gamer gamer) {

		System.out.println("Oyuncu Sisteme Kaydedildi : " + gamer.getAgnomen().toUpperCase());

	}

}

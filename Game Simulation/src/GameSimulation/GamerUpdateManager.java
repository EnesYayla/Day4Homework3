package GameSimulation;

public class GamerUpdateManager extends GamerDeleteManager implements GamerUpdateService {

	@Override
	public void update(Gamer gamer) {

		System.out.println("Oyuncu Bilgileri G�ncellendi : " + gamer.getAgnomen().toUpperCase());

	}

}

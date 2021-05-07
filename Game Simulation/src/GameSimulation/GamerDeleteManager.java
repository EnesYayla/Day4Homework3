package GameSimulation;

public class GamerDeleteManager implements GamerDeleteService {

	@Override
	public void delete(Gamer gamer) {

		System.out.println("Oyuncu Bilgileri Sistemden Silindi : " + gamer.getAgnomen());

	}

}

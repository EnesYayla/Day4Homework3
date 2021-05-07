package GameSimulation;

public class CompanyCampaignAddManager extends GamerSaveManager implements CompanyCampaignAddService {
	
	private int gamePrice;

	@Override
	public int campaignAdd(int into) {
		return into * 75 / 100;
	}

	public int getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(int gamePrice) {
		this.gamePrice = gamePrice;
	}

}

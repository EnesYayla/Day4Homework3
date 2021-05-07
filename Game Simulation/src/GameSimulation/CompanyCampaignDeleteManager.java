package GameSimulation;

public  class CompanyCampaignDeleteManager extends CompanyCampaignAddManager implements CompanyCampaignDeleteService {
    
	private int gamePrice;

	public int getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(int gamePrice) {
		this.gamePrice = gamePrice;
	}

	@Override
	public int campaignDelete(int into) {
		return into ;
	}


}

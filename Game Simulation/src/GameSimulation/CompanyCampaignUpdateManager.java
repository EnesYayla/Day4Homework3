package GameSimulation;

public class CompanyCampaignUpdateManager extends CompanyCampaignDeleteManager implements CompanyCampaignUpdateService {

	@Override
	public int campaignUpdate(int price) {
		return price * 50 / 100;
	}

}

package GameSimulation;

public interface CompanyGameSellService {

	void sellToGamer(Gamer gamer, CompanyCampaignAddManager companyCampaignAddManager);

	void sellToGamer2(Gamer gamer, CompanyCampaignUpdateManager campaignUpdateManager);

	void sellToGamer3(Gamer gamer, CompanyCampaignDeleteManager companyCampaignDeleteManager);

}

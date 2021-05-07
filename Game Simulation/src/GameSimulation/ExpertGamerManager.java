package GameSimulation;

public class ExpertGamerManager extends BaseGamerManager {

	GamerCheckService gamerCheckService;

	public ExpertGamerManager(GamerCheckService gamerCheckService) {

		this.gamerCheckService = gamerCheckService;
	}

	public void save(Gamer gamer) {
		System.out.println("K�demli Oyuncu Sisteme Kaydedildi : " + gamer.getAgnomen().toLowerCase());
		if (gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("E-Devlet, Kimlik Onayland� : " + gamer.getFirstName() + " " + gamer.getLastName() + " "
					+ gamer.getTcKimlikNo() + " " + gamer.getDateOfBirthYear());
		} else {
			System.out.println("E-Devlet, Kimlik Onaylanamad�");

		}

	
	}@Override
	public void sellToGamer(Gamer gamer, CompanyCampaignAddManager companyCampaignAddManager) {
		System.out.println(gamer.getAgnomen() + " " + "adl� kullan�c� bir adet 'NieR:Automata' oyununu sepete ekledi");
		companyCampaignAddManager.setGamePrice(300);
		System.out.println("Orijinal Fiyat : " + companyCampaignAddManager.getGamePrice() + " TL");
		System.out.println("Y�zde 25 �ndirim Etkisi : "
				+ companyCampaignAddManager.campaignAdd(companyCampaignAddManager.getGamePrice()) + " TL");
		System.out.println("Toplam Tutar : "
				+ companyCampaignAddManager.campaignAdd(companyCampaignAddManager.getGamePrice()) + " TL");
	}

	@Override
	public void sellToGamer3(Gamer gamer, CompanyCampaignDeleteManager aud) {
		System.out.println(gamer.getAgnomen() + " " + "adl� kullan�c� bir adet 'NieR:Automata' oyununu sepete ekledi");
		aud.setGamePrice(300);
		System.out.println("Orijinal Fiyat : " + aud.getGamePrice() + " TL");
		System.out.println("�ndirim Etkisi  : Mevcut De�il");
		System.out.println("Toplam Tutar : " + aud.getGamePrice() + " TL");
	}

	@Override
	public void sellToGamer2(Gamer gamer, CompanyCampaignUpdateManager campaignUpdateManager) {
		System.out.println(gamer.getAgnomen() + " " + "adl� kullan�c� bir adet 'NieR:Automata' oyununu sepete ekledi");
        campaignUpdateManager.setGamePrice(300);
        System.out.println("Orijinal Fiyat : " + campaignUpdateManager.getGamePrice() + " TL");
        System.out.println("Y�zde 50 K�demli Oyuncu �ndirim Etkisi : "+campaignUpdateManager.campaignUpdate(campaignUpdateManager.getGamePrice())+ " TL");
        System.out.println("Toplam Tutar : " + campaignUpdateManager.campaignUpdate(campaignUpdateManager.getGamePrice()) + " TL");
	}



}

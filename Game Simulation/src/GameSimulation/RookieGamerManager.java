package GameSimulation;

public class RookieGamerManager extends BaseGamerManager {

	GamerCheckService gamerCheckService;

	public RookieGamerManager(GamerCheckService gamerCheckService) {

		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void save(Gamer gamer) {
		System.out.println("Acemi Oyuncu Sisteme Kaydedildi : " + gamer.getAgnomen().toLowerCase());
		if (gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("E-Devlet, Kimlik Onayland� : " + gamer.getFirstName() + " " + gamer.getLastName() + " "
					+ gamer.getTcKimlikNo() + " " + gamer.getDateOfBirthYear());
		} else {
			System.out.println("E-Devlet, Kimlik Onaylanamad�");
		}

	}
	@Override
	public void sellToGamer(Gamer gamer, CompanyCampaignAddManager companyCampaignAddManager) {
		System.out.println(gamer.getAgnomen() + " " + "adl� kullan�c� bir adet 'Hollow Knight' oyununu sepete ekledi");
		companyCampaignAddManager.setGamePrice(20);
		System.out.println("Orijinal Fiyat : " + companyCampaignAddManager.getGamePrice() + " TL");
		System.out.println("Y�zde 25 Acemi Oyuncu Deste�i �ndirim Etkisi : "
				+ companyCampaignAddManager.campaignAdd(companyCampaignAddManager.getGamePrice()) + " TL");
		System.out.println("Toplam Tutar : "
				+ companyCampaignAddManager.campaignAdd(companyCampaignAddManager.getGamePrice()) + " TL");
	}
	@Override
	public void sellToGamer3(Gamer gamer, CompanyCampaignDeleteManager aud) {
		System.out.println(gamer.getAgnomen() + " " + "adl� kullan�c� bir adet 'Hollow Knight' oyununu sepete ekledi");
		aud.setGamePrice(20);
		System.out.println("Orijinal Fiyat : " + aud.getGamePrice() + " TL");
		System.out.println("�ndirim Etkisi  : Mevcut De�il");
		System.out.println("Toplam Tutar : " + aud.getGamePrice() + " TL");
	}

	@Override
	public void sellToGamer2(Gamer gamer, CompanyCampaignUpdateManager campaignUpdateManager) {
		System.out.println(gamer.getAgnomen() + " " + "adl� kullan�c� bir adet 'Hollow Knight' oyununu sepete ekledi");
        campaignUpdateManager.setGamePrice(20);
        System.out.println("Orijinal Fiyat : " + campaignUpdateManager.getGamePrice() + " TL");
        System.out.println("Y�zde 50 �ndirim Etkisi : "+campaignUpdateManager.campaignUpdate(campaignUpdateManager.getGamePrice())+ " TL");
        System.out.println("Toplam Tutar : " + campaignUpdateManager.campaignUpdate(campaignUpdateManager.getGamePrice()) + " TL");
	}

}

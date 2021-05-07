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
			System.out.println("E-Devlet, Kimlik Onaylandý : " + gamer.getFirstName() + " " + gamer.getLastName() + " "
					+ gamer.getTcKimlikNo() + " " + gamer.getDateOfBirthYear());
		} else {
			System.out.println("E-Devlet, Kimlik Onaylanamadý");
		}

	}
	@Override
	public void sellToGamer(Gamer gamer, CompanyCampaignAddManager companyCampaignAddManager) {
		System.out.println(gamer.getAgnomen() + " " + "adlý kullanýcý bir adet 'Hollow Knight' oyununu sepete ekledi");
		companyCampaignAddManager.setGamePrice(20);
		System.out.println("Orijinal Fiyat : " + companyCampaignAddManager.getGamePrice() + " TL");
		System.out.println("Yüzde 25 Acemi Oyuncu Desteði Ýndirim Etkisi : "
				+ companyCampaignAddManager.campaignAdd(companyCampaignAddManager.getGamePrice()) + " TL");
		System.out.println("Toplam Tutar : "
				+ companyCampaignAddManager.campaignAdd(companyCampaignAddManager.getGamePrice()) + " TL");
	}
	@Override
	public void sellToGamer3(Gamer gamer, CompanyCampaignDeleteManager aud) {
		System.out.println(gamer.getAgnomen() + " " + "adlý kullanýcý bir adet 'Hollow Knight' oyununu sepete ekledi");
		aud.setGamePrice(20);
		System.out.println("Orijinal Fiyat : " + aud.getGamePrice() + " TL");
		System.out.println("Ýndirim Etkisi  : Mevcut Deðil");
		System.out.println("Toplam Tutar : " + aud.getGamePrice() + " TL");
	}

	@Override
	public void sellToGamer2(Gamer gamer, CompanyCampaignUpdateManager campaignUpdateManager) {
		System.out.println(gamer.getAgnomen() + " " + "adlý kullanýcý bir adet 'Hollow Knight' oyununu sepete ekledi");
        campaignUpdateManager.setGamePrice(20);
        System.out.println("Orijinal Fiyat : " + campaignUpdateManager.getGamePrice() + " TL");
        System.out.println("Yüzde 50 Ýndirim Etkisi : "+campaignUpdateManager.campaignUpdate(campaignUpdateManager.getGamePrice())+ " TL");
        System.out.println("Toplam Tutar : " + campaignUpdateManager.campaignUpdate(campaignUpdateManager.getGamePrice()) + " TL");
	}

}

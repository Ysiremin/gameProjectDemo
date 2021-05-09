package gameProjectDemo.Managers;

import gameProjectDemo.Entities.Campaign;
import gameProjectDemo.Interfaces.CampaignService;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName() + " isimli yeni bir kampanya eklendi.");
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() + " isimli kampanya güncellendi.");
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + " isimli kampanya silindi.");
	}

}

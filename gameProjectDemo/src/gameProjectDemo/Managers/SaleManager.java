package gameProjectDemo.Managers;

import gameProjectDemo.Entities.Campaign;
import gameProjectDemo.Entities.Game;
import gameProjectDemo.Entities.Gamer;
import gameProjectDemo.Interfaces.SaleService;

public class SaleManager implements SaleService {

	@Override
	public void sell(Gamer gamer, Game game) {
		System.out.println(game.getName() + " isimli oyunun, " + gamer.getFirstName() + " isimli oyuncuya satýþý baþarý ile tamamlandý.");
	}

	@Override
	public void sell(Gamer gamer, Game game, Campaign campaign) {
		System.out.println(game.getName() + " isimli oyunun, " + gamer.getFirstName() + " isimli oyuncuya satýþý " + campaign.getName() + " ile baþarý ile tamamlandý.");
	}

}

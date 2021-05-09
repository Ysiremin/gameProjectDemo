package gameProjectDemo.Interfaces;

import gameProjectDemo.Entities.Game;
import gameProjectDemo.Entities.Gamer;
import gameProjectDemo.Entities.Campaign;

public interface SaleService {
	void sell(Gamer gamer, Game game);
	void sell(Gamer gamer, Game game, Campaign campaign);
}

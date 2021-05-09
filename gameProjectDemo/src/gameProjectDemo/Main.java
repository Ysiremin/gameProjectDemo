package gameProjectDemo;

import gameProjectDemo.Entities.Game;
import gameProjectDemo.Entities.Gamer;
import gameProjectDemo.Entities.Campaign;
import gameProjectDemo.Managers.GameManager;
import gameProjectDemo.Managers.GamerManager;
import gameProjectDemo.Managers.CampaignManager;
import gameProjectDemo.Managers.SaleManager;

public class Main {

	public static void main(String[] args) {
	
		Game game1 = new Game(1, "GTA V", 100);
		Gamer gamer1 = new Gamer(1,"Yasir Emin", "Çiftçi");
		Campaign campaign1 = new Campaign(1, "Mayýs indirimi" , 20);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		
		GamerManager gamerManager = new GamerManager();
		gamerManager.add(gamer1);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		
		SaleManager saleManager = new SaleManager();
		saleManager.sell(gamer1, game1, campaign1);
	}
}

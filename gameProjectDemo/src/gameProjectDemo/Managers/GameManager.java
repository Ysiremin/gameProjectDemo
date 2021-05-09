package gameProjectDemo.Managers;

import gameProjectDemo.Entities.Game;
import gameProjectDemo.Interfaces.GameService;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getName() + " isimli yeni bir oyuncu eklendi.");
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName() + " isimli oyuncu güncellendi.");
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName() + " isimli oyuncu silindi.");
	}

}

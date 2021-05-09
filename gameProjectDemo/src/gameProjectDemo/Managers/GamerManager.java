package gameProjectDemo.Managers;

import gameProjectDemo.Entities.Gamer;
import gameProjectDemo.Interfaces.GamerService;

public class GamerManager implements GamerService {

	@Override
	public void add(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " isimli yeni bir oyuncu eklendi.");
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " isimli oyuncu güncellendi.");
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " isimli oyuncu silindi.");
	}

}

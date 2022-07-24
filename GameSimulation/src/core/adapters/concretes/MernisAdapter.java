package core.adapters.concretes;

import core.adapters.abstracts.MernisService;
import entities.concretes.Player;

public class MernisAdapter implements MernisService {

	@Override
	public boolean checkIfPerson(Player player) {
		System.out.println(player.getFirstName() + " " + player.getLastName() + " " + player.getNationalityId() + " "
				+ player.getDateOfBirthDay() + "Mernis ile kullanici doğrulandı");
		return true;
	}

}

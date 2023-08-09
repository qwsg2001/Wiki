package gameChareaterTest;

import java.util.ArrayList;

public class GameCharaterTEst {

	public static void main(String args) {
		// TODO Auto-gene==rated method stub
		Wizard wizard = new Wizard();
		wizard.name = "간달프";
		wizard.hp = 150;
		wizard.mp = 70;
		wizard.punch();
		wizard.fireball();
	
		Knight knight = new Knight();
		knight.name = "간달프";
		knight.hp = 10;
		knight.punch();
		knight.slash();
		
		ArrayList<Novice> gamelist = new ArrayList<Novice>();
		gamelist.add(knight);
		gamelist.add(wizard);
		
		for (Novice n :gamelist ) {
			if (n instanceof Wizard) {
				((Wizard) n).fireball();
			}else if(n instanceof Knight) {
				((Knight) n).slash();
			}
		}
	}
}

class Novice {
	String name;
	int hp;

	void punch() {
		System.out.printf("%s(HP: %d)의 펀치\n", name, hp);
	}
}

class Wizard extends Novice{

	int mp;

	public void fireball() {
		System.out.printf("%s(MP: %d)의 불공격\n", name, mp);
	}
}

class Knight extends Novice{
	
	int stamina;
	public void slash() {
		System.out.printf("%s(stamina: %d)의 검공격\n", name, stamina);
	}
}

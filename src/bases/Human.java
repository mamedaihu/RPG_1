package bases;

import utils.Dice;

public abstract class Human extends Living{
	public Human(String name, String weapon) {
		super(name, weapon);
	}
	
	public void attack(Living target) {
		int num = Dice.get(1, 10);
		int damage = this.offensive * num;
		
		target.setHp(target.getHp() - damage);
		
		this.offensive--;
		
		System.out.println(" %s が %s で攻撃！%s に %d %s のダメージを与えた。しかし自分の攻撃力も1減少した。");
	}

}

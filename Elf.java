
public class Elf extends Race {
 Elf(){
	 damageModifier = 1;
	 unitMax = 10;
	 defense = 2;
	 weaponProficiencies = "Missile, Blade";
	 all = String.valueOf(damageModifier) + "\n" + String.valueOf(unitMax)+ "\n" + String.valueOf(defense) + "\n "+ weaponProficiencies;
 }	
}

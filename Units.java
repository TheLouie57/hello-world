public class Units{
public class Elf extends Race {
		 Elf(){
			 damageModifier = 1;
			 unitMax = 10;
			 defense = 2;
			 weaponProficiencies = "Missile, Blade";
			 all = String.valueOf(damageModifier) + "\n" + String.valueOf(unitMax)+ "\n" + String.valueOf(defense) + "\n "+ weaponProficiencies;
		 }	
		}
	public class Treefolk extends Race {
		Treefolk(){
			 damageModifier = 5;
			 unitMax = 2;
			 defense = 7;
			 weaponProficiencies = "Blunt";
			 all = String.valueOf(damageModifier) + "\n" + String.valueOf(unitMax)+ "\n" + String.valueOf(defense) + "\n "+ weaponProficiencies;
		}
	}
}

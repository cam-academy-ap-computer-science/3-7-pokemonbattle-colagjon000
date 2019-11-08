import java.util.*;

/* Basic Outline
 * - Battle start Method
 * 	- Scanner getPName
 * 	- Grab Pokemon name
 * 	- Does basic dialogue outline
 * - Damage method
 * 	- Takes pokemon name
 * 	- Queries all data types -- Level, Attack, Defense, Base, STAB, HP
 * 	- Calc Modifier -- Random (0.85, 1.0) * STAB
 * 	- Damage Calc -- (((2 * level + 10)/250) + (Attack/Defense) * Base + 2) * Modifier
 * 	- Subtract damage from HP and display along with damage
 * - Table
 * 	- Call within Damage to pass variables within scope
 */

public class PokemonBattle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pokemonName = battleStart(); // stores pokemon name grabbed in battleStart
		damage(pokemonName);

	}

	public static String battleStart() {
		@SuppressWarnings("resource")
		Scanner getPName = new Scanner(System.in); // scanner to get pokemon name from user
		System.out.println("Another trainer is issuing a challenge!");
		System.out.print("Which Pokemon will you use? ");
		String pokeName = getPName.nextLine(); // grabs pokemon name from user
		System.out.println("You choose " + pokeName + "!");
		System.out.println("It's a Pokemon battle between Zebstrika and " + pokeName + "!");
		return pokeName; //returns user given name

	}

	public static void damage(String name) {
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		System.out.println();
		System.out.println("Zebstrika used Thunderbolt! \n\nTrainer, what are your " + name + "'s stats?");
		System.out.println("Level:"); //grabs level
		int level = console.nextInt();
		System.out.println("Attack:"); //grabs attack
		double attack = console.nextDouble();
		System.out.println("Defense:"); //grabs defense
		double defense = console.nextDouble();
		System.out.println("Base:"); //grabs base value
		double base = console.nextDouble();
		System.out.println("STAB (Same Type Attack Bonus):"); //grabs stab
		double stab = console.nextDouble();
		System.out.println("HP:"); //grabs hp
		double hp = console.nextDouble();
		// Random (0.85, 1.0) * STAB
		double modCalc = (0.85 + (Math.random() * 0.15) * stab);
		// (((2 * level + 10)/250) + (Attack/Defense) * Base + 2) * Modifier
		int damCalc = (int) ((((2 * level + 10) / 250) + (attack / defense) * base + 2) * modCalc); //calculates damage
		System.out.println("\n" + name + " sustained " + damCalc + " points damage.");
		System.out.println("HP, after damage, are now " + (hp - damCalc) + ".\n\n"); //final hp
		int newHP = (int) (hp - damCalc); //stores new hp
		table(name, newHP, level, attack, defense); //calls table within damage -- queries values stores within scope
	}

	public static void table(String name, int HP, int level, double attack, double defense) { //table with all calc and given values
		System.out.println("Name    " + name);
		System.out.println("Level   " + level);
		System.out.println("------------------------------");
		System.out.println("HP      " + HP);
		System.out.println("ATTACK  " + attack);
		System.out.println("DEFENSE " + defense);
		System.out.println("SP. ATK  121");
		System.out.println("SP. DEF  81");
		System.out.println("SPEED    107");
		System.out.println("------------------------------");

	}

}

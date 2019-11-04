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
 */
public class PokemonBattle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pokemonName = battleStart(); //stores pokemon name grabbed in battleStart
		
	}
	public static String battleStart() {
		Scanner getPName = new Scanner (System.in); //scanner to get pokemon name from user
		System.out.println("Another trainer is issuing a challenge!");
		System.out.print("Which Pokemon will you use? ");
		String pokeName = getPName.nextLine(); //grabs pokemon name from user
		System.out.println("You choose " + pokeName + "!");
		System.out.println("It's a Pokemon battle between Zebstrika and " + pokeName + "!");
		return pokeName;
		
	}

}

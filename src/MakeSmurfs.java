
public class MakeSmurfs {
public static void main(String[] args) {
	/* 
	 * 1. Watch this smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g
	 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
	 *
	 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
	 * 6. Make a Smurfette and print her name, hat color and girl or boy. 
	 */
	Smurf blue = new Smurf("handy smurf");
	Smurf papa = new Smurf("papa smurf");
	Smurf lady = new Smurf("Smurfette");
	
	blue.eat();
	System.out.println(blue.getName());
}
}

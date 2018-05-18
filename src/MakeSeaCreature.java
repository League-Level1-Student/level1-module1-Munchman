
public class MakeSeaCreature {
public static void main(String[] args) {
	SeaCreature sponge = new SeaCreature("sponge bob");
	SeaCreature squid = new SeaCreature("squidward");
	SeaCreature star = new SeaCreature("patrick");
	
	squid.eat();
	sponge.eat();
	star.eat();
	squid.laugh();
	sponge.laugh();
	star.laugh();
}
}

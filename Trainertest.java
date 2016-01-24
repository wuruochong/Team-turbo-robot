public class Trainertest{
    public static void main(String[] args){
	Trainer x = new Trainer();
	Trainer y = new Trainer("Dude");
	System.out.println(x.getName());
	System.out.println(y.getName());
	System.out.println(x);
	System.out.println(y);
	Pokemon c = new Charmander();
	Pokemon s = new Squirtle();
	x.setPokemon(0, s);
	y.setPokemon(0, c);
	System.out.println(x);
	System.out.println(y);
    }
}

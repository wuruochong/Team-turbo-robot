import cs1.Keyboard;


import java.util.ArrayList;



public class Game{
    protected Trainer player;
    protected Trainer enemy;
    protected ArrayList<Pokemon> pokemonList;

    public Game(){
	pokemonList = new ArrayList();
	pokemonList.add(new Aerodactyl());
	pokemonList.add(new Alakazam());
	pokemonList.add(new Arbok());
	pokemonList.add(new Arcanine());
	pokemonList.add(new Articuno());
	pokemonList.add(new Beedrill());
	pokemonList.add(new Blastoise());
	pokemonList.add(new Butterfree());
	pokemonList.add(new Chansey());
	pokemonList.add(new Charizard());
	pokemonList.add(new Clefable());
	pokemonList.add(new Cloyster());
	pokemonList.add(new Dewgong());
	pokemonList.add(new Dragonite());
	pokemonList.add(new Dugtrio());
	pokemonList.add(new Electabuzz());
	pokemonList.add(new Electrode());
	pokemonList.add(new Exeggutor());
	pokemonList.add(new Farfetchd());
	pokemonList.add(new Fearow());
	pokemonList.add(new Gengar());
	pokemonList.add(new Golbat());
	pokemonList.add(new Golduck());
	pokemonList.add(new Golem());
	pokemonList.add(new Gyarados());
	pokemonList.add(new Hitmonchan());
	pokemonList.add(new Hitmonlee());
	pokemonList.add(new Hypno());
	pokemonList.add(new Jolteon());
	pokemonList.add(new Jynx());
	pokemonList.add(new Kabutops());
	pokemonList.add(new Machamp());
	pokemonList.add(new Mew());
	pokemonList.add(new Mewtwo());
	pokemonList.add(new Moltres());
	pokemonList.add(new Venusaur());
	pokemonList.add(new Zapdos());
	newGame();

    }
    
    public void newGame(){
	System.out.println("Welcome to Pokemon");
	System.out.println("What is your name?");
	String name = Keyboard.readString();
	player = new Trainer(name);
	for (int count = 0; count<pokemonList.size() ; count++){
	    System.out.println(count+ ": " + (pokemonList.get(count)).getName());
	}
	System.out.println("Choose #1:");
	player.setPokemon(0,pokemonList.get(Keyboard.readInt()));
	System.out.println("Choose #2:");
	player.setPokemon(1,pokemonList.get(Keyboard.readInt()));
	System.out.println("Choose #3:");
	player.setPokemon(2,pokemonList.get(Keyboard.readInt()));
	System.out.println("Choose #4:");
	player.setPokemon(3,pokemonList.get(Keyboard.readInt()));
	System.out.println("Choose #5:");
	player.setPokemon(4,pokemonList.get(Keyboard.readInt()));
	System.out.println("Choose #6:");
	player.setPokemon(5,pokemonList.get(Keyboard.readInt()));
	for (Pokemon x : player.pokemonHolder){
	    x.setStats();
	}
	
	while (player.isAlive()){
	    enemy = new Trainer();
	    enemy.setPokemon(0,pokemonList.get((int)(Math.random()*38)));
	    enemy.setPokemon(1,pokemonList.get((int)(Math.random()*38)));
	    enemy.setPokemon(2,pokemonList.get((int)(Math.random()*38)));
	    enemy.setPokemon(3,pokemonList.get((int)(Math.random()*38)));
	    enemy.setPokemon(4,pokemonList.get((int)(Math.random()*38)));
	    enemy.setPokemon(5,pokemonList.get((int)(Math.random()*38)));
	    for (Pokemon x : enemy.pokemonHolder){
		x.setStats();
	    }
	    for (Pokemon x : player.pokemonHolder){
		x.Heal();
	    }
	    Battle battle = new Battle(player,enemy);

	}
	System.out.println("Game Over");
    }
}
	
	/*enemy = new Trainer("Enemy");
	Pokemon a = new Aerodactyl();
	Pokemon b = new Alakazam();
	Pokemon c = new Arbok();
	Pokemon d = new Articuno();
	Pokemon e = new Butterfree();
	Pokemon f = new Charizard();
	a.setStats();
	b.setStats();
	c.setStats();
	d.setStats();
	e.setStats();
	player.setPokemon(0,a);
	player.setPokemon(1,b);
	player.setPokemon(2,c);
	player.setPokemon(3,d);
	player.setPokemon(4,e);
	player.setPokemon(5,f);
	enemy.setPokemon(0,a);
	enemy.setPokemon(1,b);
	enemy.setPokemon(2,c);
	enemy.setPokemon(3,d);
	enemy.setPokemon(4,e);
	enemy.setPokemon(5,f); */

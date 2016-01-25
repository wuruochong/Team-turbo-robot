import cs1.Keyboard;
import Pokemons.*;

import java.util.ArrayList;



public class Game{
    protected Trainer player;
    protected Trainer enemy;
    protected ArrayList<Pokemon> pokemonList;

    public Game(){
	newGame();
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
    }
    
    public void newGame(){
	System.out.println("Welcome to Pokemon");
	System.out.println("What is your name?");
	String name = Keyboard.readString();
	player = new Trainer(name);

	
	while (!player.isAlive()){
	    Battle battle = new Battle(player,enemy);
	    enemy = new Trainer();
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

import cs1.Keyboard;

public class Game{
    protected Trainer player;
    protected Trainer enemy;

    public Game(){
	newGame();
    }
    
    public void newGame(){
	System.out.println("Welcome to Pokemon");
	System.out.println("What is your name?");
	String name = Keyboard.readString();
	player = new Trainer(name);
	enemy = new Trainer("Enemy");
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
	enemy.setPokemon(5,f);
	
	while (player.isAlive()){
	    Battle battle = new Battle(player,enemy);
	    enemy = new Trainer();
	}
	System.out.println("Game Over");
    }
}
	

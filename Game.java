import cs1.Keyboard;

public class Game{
    protected Trainer player;
    protected Trainer enemy;

    public Static main(String[] args){
	System.out.println("Welcome to Pokemon");
	System.out.println("What is your name?");
	String name = Keyboard.readString();
	player = new Player(name);
	enemy = new Enemy("Enemy");
	while (player.isAlive()){
	    Battle battle = new Battle(player,enemy);
	    enemy = new enemy;
	}
	System.out.println("Game Over");
    }
}
	

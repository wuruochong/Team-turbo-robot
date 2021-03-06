


import cs1.Keyboard;

public class Battle{
    protected Trainer player;
    protected Trainer enemy;
    protected int roundCount;
    protected boolean gameOver;
    protected int playerPok;
    protected int enemyPok;
    
    public Battle(Trainer p, Trainer e){
	player = p;
	enemy = e;
	roundCount = 0;
	playerPok = 0;
	enemyPok = 0;
	gameOver = false;
	newBattle();
    }

    public void newBattle(){
	
	while (gameOver  ==false){
	    newGame(player.getPokemon(playerPok),enemy.getPokemon(enemyPok));
	    if (playerPok > 5 || enemyPok >5){
	    gameOver = true;
	}
	}
    }

    public void newGame(Pokemon player, Pokemon enemy){
        System.out.println("Your Pokemon is:");
	System.out.println(player.toString());
	System.out.println("The enemy is:");
	System.out.println(enemy.toString());
	System.out.println("The battle begins");
	while (gameOver == false){
	    roundCount+=1;
	    System.out.println();
	    System.out.println("Round " + roundCount);
	    System.out.println("Choose a move:\n Avalible moves:");
	    System.out.println(player.PrintMoves());
	    int moveNum1 = Keyboard.readInt();
	    int playerdmg = player.ReadMove(moveNum1,enemy);
	    int moveNum2 = (int)((Math.random()*4)+1);
	    int enemydmg = enemy.ReadMove(moveNum2,player);
	    if (player.getSpd() > enemy.getSpd()){
		enemy.lowerHP(playerdmg);
	        System.out.println("Player dealt "+playerdmg+" dmg");
		if (!enemy.isAlive()){
		    System.out.println("You defeated " + enemy.getName());
		    enemyPok+=1;
		    break;
		}
		System.out.println("enemy hp =" + enemy.getHP());
		player.lowerHP(enemydmg);
		System.out.println("Enemy dealt "+enemydmg+" dmg");
		if (!player.isAlive()){
		    System.out.println("Your " + player.getName() + " has fainted");
		    playerPok+=1;
		    break;
		}
		System.out.println("player hp =" + player.getHP());
	    }
	    else if (player.getSpd() < enemy.getSpd()){
		player.lowerHP(enemydmg);
		System.out.println("Enemy dealt "+enemydmg+" dmg");
		if (!player.isAlive()){
		    System.out.println("Your " + player.getName() + " has fainted");
		    playerPok+=1;
		    break;
		}
		System.out.println("player hp =" + player.getHP());
		enemy.lowerHP(playerdmg);
	        System.out.println("Player dealt "+playerdmg+" dmg");
		if (!enemy.isAlive()){
		    System.out.println("You defeated " + enemy.getName());
		    enemyPok+=1;
		    break;
		}
		System.out.println("enemy hp =" + enemy.getHP());
	    }
	    //	    if ((player.isAlive() == false) || (enemy.isAlive() == false)){
	    //	gameOver = true;
	    // }
	}
	    
	System.out.println("The Battle is Over");
    }

}

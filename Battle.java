import cs1.Keyboardl;

public class Battle{
    private Pokemon player;
    private Pokemon enemy;
    private int roundCount;
    private boolean gameOver;
    
    public Battle(Pokemon p, Pokemon e){
	player = p;
	enemy = e;
	roundCount = 0;
	gameOver = false;
	newGame();
    }

    public void newGame(){
        System.out.println("Your Pokemon is:");
	System.out.println(player.toString);
	System.out.println("The enemy is:");
	System.out.println(enemy.toString);
	System.out.println("The battle begins");
	while (gameOver == false;){
	    roundCount+=1;
	    System.out.println("Round " + roundCount);
	    System.out.println("Choose a move:\n Avalible moves:");
	    System.out.println(player.printMoves);
	    int moveNum1 = Keyboard.readString();
	    int playerdmg = player.readMove(moveNum);
	    int moveNum2 = (int)((Math.random()*4)+1);
	    int enemydmg = enemy.readMove(moveNum);
	    if (player.getSpd() > enemy.getSpd()){
		enemy.lowerHP(playerdmg);
		gameOver = !(enemy.isAlive());
	    }

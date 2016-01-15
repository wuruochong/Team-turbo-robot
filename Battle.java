public class Battle{
    private Pokemon player;
    private Pokemon enemy;
    private int moveCount;
    private boolean gameOver;
    
    public Battle(){
	moveCount = 0;
	gameOver = false;
	newGame();
    }

    public void newGame(){
	

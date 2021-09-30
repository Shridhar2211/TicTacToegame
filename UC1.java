package program;
public class TicTacToeGame {
	//creating a instance variable  and asigning value 10
	static char[] board =new char[10];
	public static void main (String [] args)
	{
	GameBoard();// calling the game board method
	}
	public static void GameBoard() //method is defined for creating board
	{
	for (int i=1;  i<board.length; i++)
	{
	System.out.println(" ");	
		}
	}
}

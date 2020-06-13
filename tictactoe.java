import java.util.*;

class tictactoe
{
	public static void main(String[] args)
	{
		char gameboard[][] = {{' ','|',' ','|',' '},{'-','+','-','+','-'},{' ','|',' ','|',' '},{'-','+','-','+','-'},{' ','|',' ','|',' '}};
		printGameBoard(gameboard);
		int win=0;
		Scanner sc = new Scanner(System.in);
		do
		{
		System.out.println("Player 1 :: Please enter your position:");
		int pos = sc.nextInt();
		switch(pos)
			{
					case 1 :  
					if(gameboard[0][0]== ' ')
					gameboard[0][0] = 'x';
					break;
					case 2 : 
					if(gameboard[0][2]== ' ') 
					gameboard[0][2] = 'x';
					break;
					case 3 :  
					if(gameboard[0][4]== ' ') 
					gameboard[0][4] = 'x';
					break;
					case 4 :  
					if(gameboard[2][0]== ' ') 
					gameboard[2][0] = 'x';
					break;
					case 5 :  
					if(gameboard[2][2]== ' ') 
					gameboard[2][2] = 'x';
					break;
					case 6 :  
					if(gameboard[2][4]== ' ') 
					gameboard[2][4] = 'x';
					break;
					case 7 :
					if(gameboard[4][0]== ' ')   
					gameboard[4][0] = 'x';
					break;
					case 8 :  
					if(gameboard[4][2]== ' ') 
					gameboard[4][2] = 'x';
					break;
					case 9 :  
					if(gameboard[4][4]== ' ') 
					gameboard[4][4] = 'x';
				break;
			}
			printGameBoard(gameboard);
			win=checkwinner(gameboard);
			if(win==1)
			{
				System.out.println("player 1 wins");
			}
			else
			{
			System.out.println("Player 2 :: Please enter your position");
			int pos1 = sc.nextInt();
				switch(pos1)
				{
					case 1 :  
					if(gameboard[0][0]== ' ')
					gameboard[0][0] = 'O';
					break;
					case 2 : 
					if(gameboard[0][2]== ' ') 
					gameboard[0][2] = 'O';
					break;
					case 3 :  
					if(gameboard[0][4]== ' ') 
					gameboard[0][4] = 'O';
					break;
					case 4 :  
					if(gameboard[2][0]== ' ') 
					gameboard[2][0] = 'O';
					break;
					case 5 :  
					if(gameboard[2][2]== ' ') 
					gameboard[2][2] = 'O';
					break;
					case 6 :  
					if(gameboard[2][4]== ' ') 
					gameboard[2][4] = 'O';
					break;
					case 7 :
					if(gameboard[4][0]== ' ')   
					gameboard[4][0] = 'O';
					break;
					case 8 :  
					if(gameboard[4][2]== ' ') 
					gameboard[4][2] = 'O';
					break;
					case 9 :  
					if(gameboard[4][4]== ' ') 
					gameboard[4][4] = 'O';
					break;
					default:
					System.out.println("invalid input");
				}
				printGameBoard(gameboard);
				win=checkwinner(gameboard);
				if(win==1)
			{
				System.out.println("player 2 wins");
			}
		}
		win=checkwinner(gameboard);
	}
		while(win!=1);
	
	}
	public static int checkwinner(char[][] gameboard)
	{
		int win=0;
		for(int i=0;i<5;i=i+2)
		{
			int count=0;
			int count1=0;
			for(int j=0;j<5;j=j+2)
			{
				if(gameboard[i][j]=='X'||gameboard[i][j]=='O')
				{
					if(gameboard[i][j]=='X')
					{
						count++;
					}
					else
					{
						count1++;
					}
				}
				if(count==3 || count1==3)
				{
					win=1;
					break;
				}
			}
		}
		for(int j=0;j<5;j=j+2)
		{
			int count=0;
			int count1=0;
			for(int i=0;i<5;i=i+2)
			{
				if(gameboard[i][j]=='X'||gameboard[i][j]=='O')
				{
					if(gameboard[i][j]=='X')
					{
						count++;
					}
					else
					{
						count1++;
					}
				}
				if(count==3 || count1==3)
				{
					win=1;
					break;
				}
			}
		}
		for(int i=0;i<5;i=i+2)
		{
			int count=0;
			int count1=0;
			for(int j=0;j<5;j=j+2)
			{

				if(gameboard[0][0]=='X' && gameboard[2][2]=='X' && gameboard[4][4]=='X')
				{
					win=1;
					break;
				}
				else if(gameboard[0][0]=='O' && gameboard[2][2]=='O' && gameboard[4][4]=='O')
				{
					win=1;
					break;
				}
				else if(gameboard[4][0]=='O' && gameboard[2][2]=='O' && gameboard[4][0]=='O')
				{
					win=1;
					break;
				}
				else if(gameboard[4][0]=='X' && gameboard[2][2]=='X' && gameboard[4][0]=='X')
				{
					win=1;
					break;
				}
			}
		}
		return win;

	}
		
	public static void printGameBoard(char[][] gameboard)
	{
	for(char[] row:gameboard)
		{
			for(char c:row)
			{
				System.out.print(c);
			}
			System.out.println(" "); 
		}
	}
}
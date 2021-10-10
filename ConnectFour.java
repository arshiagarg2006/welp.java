import java.util.Scanner;

public class ConnectFour{
	public final static int WIDTH = 7, HEIGHT = 6, MAX_HEIGHT = HEIGHT-1, MIN_COLUMN = 1;
	public final static char BLANK = '.';
	
	public static String winMessage = null;
	
	public static int row = 0, column = 0, turn = 1;
	public static char token='x';  

	public static char[][]board = new char[WIDTH][HEIGHT];

	public static void main(String[] args){
		clearBoard();
		while (!isBoardFull() && !isWinner(token, winMessage)){
		System.out.println("\n"+token+"'s turn");
			do{
				userInput();
			} 
			while (!placeToken(column));
			winMessage = checkWin(token, row, column);
			displayBoard();
			token = switchUser(token);
		}
	} 

public static void clearBoard(){
	for(int width=0; width < WIDTH; width++){
		for(int height=0; height < HEIGHT; height++){
			board[width][height]=BLANK;
		}
	}	
}

public static boolean isBoardFull(){
	for(int width=0; width < WIDTH; width++){
		for(int height=0; height < HEIGHT; height++){
			if(board[width][height]==BLANK){
				return false;
			}
		}
	}
	System.out.println("GAME OVER: The board is full");
	return true;	
}

public static boolean isWinner(char token, String winMessage){
	if(winMessage == null){
		return false;
	}
	else{
		System.out.println("\n"+token+" won the game ("+winMessage+")!");
		return true;
	}
}

public static int userInput(){
	int response;
	boolean flag = false;
	Scanner input = new Scanner(System.in);
	System.out.println("\nEnter a column (1-7)");
	while(flag == false){
		while (!input.hasNextInt()) {
				System.out.println("Enter an integer, please!");
				input.nextLine();
			}
			response = input.nextInt()- MIN_COLUMN;
			if (response < WIDTH+1 && response >= 0){
				column = response;
				flag = true;
			}
			else  {
				System.out.println("Not a valid column, try (1-7)");
				flag = false;
			}
		}
		return column;
}

public static boolean placeToken(int column){
	for(int height=0; height < HEIGHT; height++){
		if(board[column][MAX_HEIGHT]!= BLANK){
			System.out.println("That column is full! Please select another one.");
			return false;
		}
		else if (board[column][height]==BLANK){
			board[column][height] = token;
			return true;
		}
	}
	return false;
}

public static String checkWin(char token, int row, int column){
	if(checkVertical(token, column)== true){
		winMessage = "on a vertical";
	}
	else if(checkHorizontal(token, row) == true){
		winMessage = "on a horizontal";
	}
	else if(checkDiagonal(token, row, column) == true){
		winMessage="on a diagonal";
	}
	else if(checkVertical(token, column) == true && checkHorizontal(token, row) == true){
		winMessage="on a vertical & a horizontal";
	}
	else if(checkVertical(token, column) == true && checkDiagonal(token, row, column) == true){
		winMessage="on a vertical & a diagonal";
	}
	else if(checkHorizontal(token, row) == true && checkDiagonal(token, row, column) == true){
		winMessage="on a horizontal & a diagonal";	
	}
	else if(checkVertical(token, column) == true && checkHorizontal(token, row) == true && checkDiagonal(token, row, column) == true){
		winMessage="on a vertical & a horizontal & a diagonal (OH BABY A TRIPLE! OH YEAH!)";
	}
	else{
		winMessage=null;
	}
	return winMessage;
}

public static boolean checkVertical(char token, int column){
	int vertical=0;
	for(int height=0; height < HEIGHT; height++){
		if(board[column][height]==token){
			vertical++;
			if(vertical>=4){
				return true;
			}
		}
		else{
			vertical=0;
		}
	}
	return false;
}

public static boolean checkHorizontal(char token, int row){
	int horizontal=0;
	for(int width=0; width < WIDTH; width++){
		if(board[width][row]==token){
			horizontal++;
			if(horizontal>=4){
				return true;
			}
		}
		else{
			horizontal=0;
		}
	}
	return false;
}

public static boolean checkDiagonal(char token, int row, int column){
	int diagonal=0, antidiagonal=0;

	for(int extra = 0; extra < HEIGHT; extra++){
		for(int height = 0; height < HEIGHT; height++){
			for(int width = 0; width < WIDTH; width++){
				if(diagonal >= 4){
					return true;
				}
				else if((width+extra)==height && board[width][height]==token){
					diagonal++;
				}
				else if((height+extra)== width && board[width][height]==token){
					diagonal++;
				}
				else if((height+extra)== width || (width+extra)==height && board[width][height]!=token){
					diagonal = 0;
				}
			}
		}
	}

	for(int height = 0; height < HEIGHT; height++){
		for(int width = WIDTH-1; width >= 0; width--){
			int difference = 0;
			int metacount = 0;
			difference = width - height;
			metacount = Math.abs(difference);
				if(antidiagonal >= 4){
					return true;
				}
				else if((metacount%2)==0 && board[width][height]==token){
					antidiagonal++;
					height++;
				}
				else if((metacount%2)!=0 && board[width][height]==token){
					antidiagonal = 0;
				}
			}
		}
	return false;
}

public static void displayBoard(){
	for(int height = HEIGHT-1; height >= 0; height--){
		for(int width = 0; width < WIDTH; width++){
			System.out.print(board[width][height]);
		}
		System.out.println("");
	}	
}

public static char switchUser(char token){
	if(winMessage==null){
		turn++;
		if(turn%2 == 1){
			token='x';
			return token;
		}
		else{
			token='o';
			return token;
		}
	}
	else{
		return token;
	}
}
}
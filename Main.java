package toughPuzzles;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("how big do you want each square?");
		int squareSize = scanner.nextInt();
		System.out.println("How many rows?");
		int rows = scanner.nextInt();
		System.out.println("How many columns?");
		int columns = scanner.nextInt();
		System.out.println("how many moves?");
		int numMoves = scanner.nextInt();
		System.out.println("do you want this to be a random game? (y/n)");
		String random = scanner.next();
		
		boolean isRandom = false;
		if(random.equals("y"))
		{
			isRandom = true;
		}*/
				//Game 1 idea SOLVED EASY
				/*Function[] myMoves = new  Function[3];
				int[][] move1 = new int[][] {{1,2,3,4,9},{0,6,7,8,14},{5,11,12,13,19},{10,16,17,18,24},{15,20,21,22,23}};
				int[][] move2 = new int[][] {{0,1,2,3,4},{5,7,8,13,9},{10,6,12,18,14},{15,11,16,17,19},{20,21,22,23,24}};
				int[][] move3 = new int[][] {{0,1,2,3,4},{5,6,7,8,9},{10,11,12,14,13},{15,16,17,18,19},{20,21,22,23,24}};
				int numRows = move1.length;
				int numColumns = move1[0].length;
				myMoves[0] = new Function(move1,numRows,numColumns);
				myMoves[1] = new Function(move2,numRows,numColumns);
				myMoves[2] = new Function(move3,numRows,numColumns);*/
				
				//Game 2 idea SOLVED MEDIUM
				/*Function[] myMoves = new  Function[4];
				int[][]  move1 = new int[][]{{1,4,2},{3,0,5},{6,7,8}};
				int[][] move2 = new int[][] {{0,1,5},{3,2,4},{6,7,8}};
				int[][] move3 = new int[][] {{0,1,2},{3,8,5},{6,4,7}};
				int[][] move4 = new int[][] {{0,1,2},{4,6,5},{3,7,8}};
				int numRows = move1.length;
				int numColumns = move1[0].length;
				myMoves[0] = new Function(move1,numRows,numColumns);
				myMoves[1] = new Function(move2,numRows,numColumns);
				myMoves[2] = new Function(move3,numRows,numColumns);
				myMoves[3] = new Function(move4,numRows,numColumns);*/
				
				//GAME 3 idea SOLVED HARD
				/*Function[] myMoves = new  Function[3];

				int[][] move1 = new int[][] {{1,5,3,7},{0,4,2,6},{9,13,11,15},{8,12,10,14}};
				int[][] move2 = new int[][] {{0,1,2,3},{4,6,10,7},{8,5,9,11},{12,13,14,15}};
				int[][] move3 = new int[][] {{ 3, 1, 2, 0},
											 { 7, 5, 6, 4},
											 {11, 9,10,8},
											 {15,13,14,12}};						 
				int numRows = move1.length;
				int numColumns = move1[0].length;
				myMoves[0] = new Function(move1,numRows,numColumns);
				myMoves[1] = new Function(move2,numRows,numColumns);
				myMoves[2] = new Function(move3,numRows,numColumns);*/
				
				//GAME 4 idea SOLVED EASY
				/*Function[] myMoves = new  Function[3];
				int[][] move1 = new int[][] {{1,2,3,7},
											{0,5,6,11},
											{4,9,10,15},
											{8,12,13,14}};
				int[][] move2 = new int[][] {{0,1,2,3},
											 {4,6,10,7},
										     {8,5,9,11},
											 {12,13,14,15}};
				int[][] move3 = new int[][] {{0,1,2,3},
											{4,5,7,6},
											{8,9,10,11},
											{12,13,14,15}};	
				int numRows = move1.length;
				int numColumns = move1[0].length;
				myMoves[0] = new Function(move1,numRows,numColumns);
				myMoves[1] = new Function(move2,numRows,numColumns);
				myMoves[2] = new Function(move3,numRows,numColumns);*/
											
				//Game 5 idea SOLVED MEDIUM
				/*Function[] myMoves = new  Function[4];
				int[][] move1 = new int[][] {{1,4,2},
											 {0,3,5},
											 {6,7,8}};
				int[][] move2 = new int[][] {{0,2,5},
											 {3,1,4},
											 {6,7,8}};
				int[][] move3 = new int[][] {{0,1,2},
										     {3,5,8},
											 {6,4,7}};
				int[][] move4 = new int[][] {{0,1,2},
											 {4,7,5},
											 {3,6,8}};
				int numRows = move1.length;
				int numColumns = move1[0].length;
			    myMoves[0] = new Function(move1,numRows,numColumns);
				myMoves[1] = new Function(move2,numRows,numColumns);
				myMoves[2] = new Function(move3,numRows,numColumns);
				myMoves[3] = new Function(move4,numRows,numColumns);*/
				
				// Game 6 idea SOLVED EASY
				/*Function[] myMoves = new  Function[6];
				int[][] move1 = new int[][] {{1,0,2,3,4,5,6}};
				int[][] move2 = new int[][] {{0,2,1,3,4,5,6}};
				int[][] move3 = new int[][] {{0,1,3,2,4,5,6}};
				int[][] move4 = new int[][] {{0,1,2,4,3,5,6}};
				int[][] move5 = new int[][] {{0,1,2,3,5,4,6}};
				int[][] move6 = new int[][] {{0,1,2,3,4,6,5}};
				int numRows = move1.length;
				int numColumns = move1[0].length;
				
				myMoves[0] = new Function(move1,numRows,numColumns);
				myMoves[1] = new Function(move2,numRows,numColumns);
				myMoves[2] = new Function(move3,numRows,numColumns);
				myMoves[3] = new Function(move4,numRows,numColumns);
				myMoves[4] = new Function(move5,numRows,numColumns);
				myMoves[5] = new Function(move6,numRows,numColumns);*/
				
				//Game 7 idea SOLVED EASY
				/*Function[] myMoves = new  Function[2];
				int[][] move1 = new int[][] {{1,2,3,0,4}};
				int[][] move2 = new int[][] {{0,1,2,4,3}};
				int numRows = move1.length;
				int numColumns = move1[0].length;
				myMoves[0] = new Function(move1,numRows,numColumns);
				myMoves[1] = new Function(move2,numRows,numColumns);*/
		
				//Game 8 idea SOLVED EASY
				/*Function[] myMoves = new  Function[2];
				int[][] move1 = new int[][] {{1,2,0,3,4}};
				int[][] move2 = new int[][] {{0,1,3,4,2}};
				int numRows = move1.length;
				int numColumns = move1[0].length;
				myMoves[0] = new Function(move1,numRows,numColumns);
				myMoves[1] = new Function(move2,numRows,numColumns);*/
		
				//Game 9 idea easy SOLVED EASY
				/*Function[] myMoves = new  Function[4];
				int[][] move1 = new int[][] {{1,3},{2,0}};
				int[][] move2 = new int[][] {{0,3},{1,2}};
				int[][] move3 = new int[][] {{3,1},{0,2}};
				int[][] move4 = new int[][] {{1,2},{0,3}};

				int numRows = move1.length;
				int numColumns = move1[0].length;
				myMoves[0] = new Function(move1,numRows,numColumns);
				myMoves[1] = new Function(move2,numRows,numColumns);
				myMoves[2] = new Function(move3,numRows,numColumns);
				myMoves[3] = new Function(move4,numRows,numColumns);*/

				//Game 10 idea Addisons 2x2 game Solved but weird
				Function[] myMoves = new  Function[2];
				int[][] move1 = new int[][] {{1,2},{3,0}};
				int[][] move2 = new int[][] {{1,3},{0,2}};
				int numRows = move1.length;
				int numColumns = move1[0].length;
				myMoves[0] = new Function(move1,numRows,numColumns);
				myMoves[1] = new Function(move2,numRows,numColumns);
		
				//Game 11 idea rubiks cube but RU generated edges only SOVLED MEDIUM
				/*Function[] myMoves = new Function[2];
				int[][] move1 = new int[][] {{1,2,3,0,4,5,6}};
				int[][] move2 = new int[][] {{0,1,2,4,5,6,3}};
				int numRows = move1.length;
				int numColumns = move1[0].length;
				myMoves[0] = new Function(move1,numRows,numColumns);
				myMoves[1] = new Function(move2,numRows,numColumns);*/
		
				int numMoves = myMoves.length;
				int maxWidth = 750/numColumns;
				int maxHeight = 700/numRows;
				int squareSize = Math.min(maxWidth, maxHeight);
				//int squareSize = 150;
		new MyFrame(squareSize, numRows,numColumns,numMoves,myMoves);
		/*int squareSize=150;
		int numRows = 2;
		int numColumns = 3;
		int numMoves = 2;
		new MyFrame(squareSize, numRows,numColumns,numMoves);*/

		
	}

}

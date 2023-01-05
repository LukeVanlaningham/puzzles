package toughPuzzles;

public class Grid {
	int[][] Grid;
	int rows;
	int columns;
	
	
	Grid(int myRows, int myColumns)
	{
		Grid = new int[myRows][myColumns];
		columns=myColumns;
		rows=myRows;
		for(int i = 0;i<rows;i++)
		{
			for(int j = 0;j<columns;j++)
				Grid[i][j]=i*columns+j;
		}
		
	}
	public void makeSolved()
	{
		for(int i = 0;i<rows;i++)
		{
			for(int j = 0;j<columns;j++)
				Grid[i][j]=i*columns+j;
		}
	}
	public int getRows()
	{
		return rows;
	}
	
	public int getColumns()
	{
		return columns;
	}
	public int getElement(int i, int j)
	{
		return Grid[i][j];
	}
	public int getSize() {
		return columns*rows;
	}
	public boolean isSolved()
	{
		for(int i = 0;i<rows;i++)
		{
			for(int j = 0;j<columns;j++)
			{
				if(Grid[i][j]!=columns*i+j)
				return false;
			}
		}
		return true;
	}
	public void doFunction(int[][] function)
	{
		int[][] backupGrid = new int[rows][columns];
		for(int i = 0;i<rows;i++)
		{
			for(int j = 0;j<columns;j++)
			{
				backupGrid[i][j]=Grid[i][j];
			}
		}
		for(int i = 0;i<rows;i++)
		{
			for(int j = 0;j<columns;j++)
			{
				Grid[(int)(function[i][j]/columns)][function[i][j]%columns]=backupGrid[i][j];
			}
		}
	}
	public String toString()
	{
		String Return = "";
		for(int i = 0;i<rows;i++)
		{
			for(int j = 0;j<columns;j++)
			{
				if(Grid[i][j]<10)
				{
					Return+=" "+Grid[i][j]+" ";
				}
				else {
					Return+=Grid[i][j]+" ";
				}
			}
			Return+="\n";
		}
		return Return;
	}
	
}

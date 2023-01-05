package toughPuzzles;

public class Function {
int[][] function;
int rows;
int columns;
int size;
Function(int MyRows, int MyColumns)
{
	rows = MyRows;
	columns = MyColumns;
	function = new int[rows][columns];
	size = rows*columns;
	
}
Function(int[][] myFunction, int MyRows, int MyColumns)
{
	
	rows = MyRows;
	columns = MyColumns;
	size = rows*columns;
	function = new int[MyRows][MyColumns];

	for(int i = 0;i<rows;i++)
	{
		for(int j = 0;j<columns;j++)
		{
			function[i][j]=myFunction[i][j];
		}
	}
}
public int getElement(int i, int j)
{
	return function[i][j];
}
public int[][] getfunction()
{
	return function;
}
public void makeRandom()
{
	int[] defaultGrid = new int[size];
	for(int i = 0;i<defaultGrid.length;i++)
	{
		defaultGrid[i]=i;
	}
	int[] randomFunction = new int[size];
	for(int i = 0;i<randomFunction.length;i++)
	{
		int myRandom =(int) (Math.random()*defaultGrid.length);
		while(defaultGrid[myRandom]==-1)
		{
			 myRandom =(int) (Math.random()*defaultGrid.length);
		}
		randomFunction[i]=defaultGrid[myRandom];
		defaultGrid[myRandom]=-1;
		
	}
	for(int i = 0;i<rows;i++)
	{
		for(int j = 0;j<columns;j++)
		{
			function[i][j]=randomFunction[i*columns+j];
		}
	}
}
public String writtenMove()
{
	String myMove="";
	int[][] savemyFunction = new int[rows][columns];
	for(int i = 0;i<rows;i++)
	{
		for(int j = 0;j<columns;j++)
		{
			savemyFunction[i][j]=function[i][j];
		}
	}
	
	for(int i = 0;i<rows;i++)
	{
		for(int j = 0;j<columns;j++)
		{
			if(savemyFunction[i][j]!=-1)
			{
				savemyFunction[i][j]=-1;
				String smallerLoop = "";
				int StartOfLoop = j+i*columns;
				int next = function[i][j];
				if(next==StartOfLoop)
				{
					continue;
				}
					
				smallerLoop+=String.valueOf(StartOfLoop+1);
				savemyFunction[(int)(next/columns)][next%columns]=-1;
				int count = 1;
				while(next!=StartOfLoop)
				{
					smallerLoop+=" "+(next+1);
					next = function[(int) (next/columns)][next%columns];
					savemyFunction[(int)(next/columns)][next%columns]=-1;
					count++;
					
				}
				myMove+="("+smallerLoop+") ("+count+" cycle) ";
			}	
			
		}
	}
	
	return myMove;
}
public String toString()
{
	String Return = "";
	for(int i = 0;i<rows;i++)
	{
		for(int j = 0;j<columns;j++)
		{
			if(function[i][j]<10)
			{
				Return+=" "+function[i][j]+" ";
			}
			else {
				Return+=function[i][j]+" ";
			}
		}
		Return+="\n";
	}
	return Return;
}
}

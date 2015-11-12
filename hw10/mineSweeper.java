
import java.util.Scanner;
public class mineSweeper {
	
	
	public static void checkMine(int[][] a){
		for(int x=0;x<a.length;x++){ //loops	
			for(int y=0;y<a.length;y++){ //loops
				if(a[x][y] >=9){ //cells have values greater than 8 are mines
					
					
						if((x==0 && y==0)){// corner case 1 
							a[x][y+1]++; //increase adjacent cells by 1
							a[x+1][y+1]++;
							a[x+1][y]++;
						}
						if(x==0 && y==a.length-1){//corner case 2
							a[x][y-1]++; //increase adjacent cells by 1
							a[x+1][y-1]++;
							a[x+1][y]++;
						}
						
						if((x==a.length-1 && y==a.length-1)){// corner case 3
							a[x][y-1]++;//increase adjacent cells by 1
							a[x-1][y-1]++;
							a[x-1][y]++;
					
						}
						if(x==a.length-1 && y==0){ //corner case 4
							a[x-1][y]++;//increase adjacent cells by 1
							a[x-1][y+1]++;
							a[x][y+1]++;
						}
						
						 if(y==0 && x!=0 && x!=a.length-1){ //side 1 
							a[x-1][y]++; //increase adjacent cells by 1
							a[x+1][y]++;
							a[x-1][y+1]++;
							a[x][y+1]++;
							a[x+1][y+1]++;
						}
						 if(y==a.length-1 && x!=0 && x!=a.length-1){//side 3
							a[x-1][y]++;//increase adjacent cells by 1
							a[x-1][y-1]++;
							a[x][y-1]++;
							a[x+1][y-1]++;
							a[x+1][y]++;
						}
						 if(x==0 && y!=0 && y!= a.length-1){ //side 2
							a[x][y-1]++;//increase adjacent cells by 1
							a[x][y+1]++;
							a[x+1][y-1]++;
							a[x+1][y]++;
							a[x+1][y+1]++;
						}
						 if(x==a.length-1 && y!=0 && y!=a.length-1){//side 4
							a[x-1][y-1]++;//increase adjacent cells by 1
							a[x-1][y]++;
							a[x-1][y+1]++;
							a[x][y-1]++;
							a[x][y+1]++;
						}
						

					
					else if(x!=0 && x!= a.length-1 && y!=0 && y!=a.length-1){//the rest cell cases
					a[x+1][y+1]++;//increase adjacent cells by 1
					a[x+1][y]++;
					a[x-1][y-1]++;
					a[x-1][y]++;
					a[x][y+1]++;
					a[x][y-1]++;
					a[x+1][y-1]++;
					a[x-1][y+1]++;
					}
				}
			}
			}
		
	}
	

	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);//create a scanner
		System.out.println("enter the size of the board");//ask user to input size of array
		 int size = kb.nextInt(); //assign it to size
		System.out.println("enter number of mines"); //ask user to input number of mines
		int mines = kb.nextInt(); //assign it mines
		
		if(size <=30 && size>=2 && mines>=1 &&mines<=size*size){ //check input validation
		int[][] board = new int[size][size]; //initialize board
		
		

		for(int c=0;c<mines;c++){ //placing mines
			int x = (int)(Math.random()*size); //generate random numbers for x and y
			int y = (int)(Math.random()*size);
				while(board[x][y]>=9){ //keep looping until there is no mine in the cell
					x = (int)(Math.random()*size);
					y = (int)(Math.random()*size);
		}
				board[x][y]=9; //set the mine
		}
		
		System.out.println("");
		checkMine(board); //call method
		
		 for(int i=0;i<size;i++){  //loop
	            for(int j=0;j<size;j++){ //loop 
	                if(board[i][j]>=9)  //showcasing the mine
	                    System.out.print(" M ");  
	                else  
	                    System.out.print(" "+board[i][j]+" " );  //printing out cells adjacent to mine
	            }  
	            System.out.println( );  
	        }  
		 
		//printing out the position of mines for testing
		 for(int a=0;a<size;a++){ 
			 for(int b=0;b<size;b++){
				 if(board[a][b]>=9)
					 System.out.print("("+ a+","+b+")"+" ");
			 }
		 }
		}
		
		
		
	}
}

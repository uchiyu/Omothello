import java.util.Scanner;
import java.util.Random;

class Omothello {
 
  public static final int NUM =  12;

  public static void main( String[] args ) {
    // $BJQ?t@k8@(B
    int turn = 1;
    int[][] board =  {
       { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
       { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
       { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
       { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
       { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
       { 0, 0, 0, 0, 0, -1, 1, 0, 0, 0, 0, 0 },
       { 0, 0, 0, 0, 0, 1, -1, 0, 0, 0, 0, 0 },
       { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
       { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
       { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
       { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
       { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
    };
    int[][] val_board = new int[NUM][NUM] ;
    Random rand = new Random();

    // $BE@?tHWLL$N@8@.(B
    for ( int i = 0; i < NUM; i++ ) {
      for ( int j = 0; j < NUM; j++ ) {
        val_board[i][j] = (rand.nextInt(100) - 50);
      } 
    }
    
    output_bd( val_board);
  
  }

  static void output_bd( int[][] board ) {
    for ( int i = 0; i < NUM; i++ ) {
      for ( int j = 0; j < NUM; j++ ) {
        System.out.printf("%3d ", board[i][j]);
      }
      System.out.println();
    }
  }

  static void process( int[][] board, int[][] val_board, int turn  ) {
    Scanner stdIn = new Scanner(System.in); 

    int x = ;
    int y = 0; //$BCV$/>l=j$N:BI8(B
    
    
    
    
  }

}

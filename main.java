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
    
    output_bd( board );
    output_vl( val_board);
  
  }
  
  // $BHWLL$N=PNO(B
  static void output_bd( int[][] board ) {

    for ( int i = 0; i < NUM; i++ ) {
      for ( int j = 0; j < NUM; j++ ) {
        if ( board[i][j] == 1 ) {
          System.out.print("$B!{(B ");
        } else if (  board[i][j] == -1 ) { 
          System.out.print("$B!|(B ");
        } else if (  board[i][j] == 0 ) { 
          System.out.print("$B!&(B ");
        }
      }
      System.out.println();
    }
  }

  // $BI>2ACM%\!<%I$N=PNO(B
  static void output_vl( int[][] board ) {

    for ( int i = 0; i < NUM; i++ ) {
      for ( int j = 0; j < NUM; j++ ) {
        System.out.printf("%3d ", board[i][j]);
      }
      System.out.println();
    }
  }

  static void process( int[][] board, int[][] val_board, int turn  ) {
    Scanner stdIn = new Scanner(System.in); 

    int x = 0;
    int y = 0; //$BCV$/>l=j$N:BI8(B
    
    /*   
    do {
      System.out.println("x =");
      
      System.out.println("y =");


      System.out.println("OK? [y]or[n]");
    } while (  );*/  
  }

}

import java.util.Scanner;
import java.util.Random;

class Omothello {
 
  public static final int NUM =  12;

  public static void main( String[] args ) {
    // 変数宣言
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

    // 点数盤面の生成
    for ( int i = 0; i < NUM; i++ ) {
      for ( int j = 0; j < NUM; j++ ) {
        val_board[i][j] = (rand.nextInt(100) - 50);
      } 
    }
    
    output_bd( board );
    output_vl( val_board);
  
  }
  
  // 盤面の出力
  static void output_bd( int[][] board ) {

    for ( int i = 0; i < NUM; i++ ) {
      for ( int j = 0; j < NUM; j++ ) {
        if ( board[i][j] == 1 ) {
          System.out.print("○ ");
        } else if (  board[i][j] == -1 ) { 
          System.out.print("● ");
        } else if (  board[i][j] == 0 ) { 
          System.out.print("・ ");
        }
      }
      System.out.println();
    }
  }

  // 評価値ボードの出力
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
    int y = 0; //置く場所の座標
    
    /*   
    do {
      System.out.println("x =");
      
      System.out.println("y =");


      System.out.println("OK? [y]or[n]");
    } while (  );*/  
  }

}

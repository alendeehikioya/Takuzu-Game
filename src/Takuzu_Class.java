import java.util.Scanner;

public class Takuzu_Class extends TakuzuLogic {
    
    public static void main(String[] args) {
 
        char[][] example ={{'|','1', '|', '0', '|','0', '|', '1', '|','1','|', '0','|'}, 
                             {'|','-', '+', '-', '+','-', '+', '-', '+','-', '+','-','|'},
                             {'|','0', '|', '1', '|','1', '|', '0', '|','0', '|','1','|'},
                             {'|','-', '+', '-', '+','-', '+', '-', '+','-', '+','-','|'},
                             {'|','0', '|', '1', '|','0','|', '0', '|','1', '|','1','|'}, 
                             {'|','-', '+', '-', '+','-', '+', '-', '+','-', '+','-','|'},
                             {'|','1', '|', '0', '|','1', '|', '1', '|','0', '|','0','|'},
                             {'|','-', '+', '-', '+','-', '+', '-', '+','-', '+','-','|'},
                             {'|','1', '|', '1', '|','0', '|', '0', '|','1', '|','0','|'},
                             {'|','-', '+', '-', '+','-', '+', '-', '+','-', '+','-','|'},
                             {'|','0', '|', '0', '|','1','|', '1', '|','0', '|','1','|'},};
        
           char[][] gameBoard ={{'|',' ', '|', ' ', '|',' ', '|', ' ', '|',' ','|', ' ','|'}, //row 1
                             {'|','-', '+', '-', '+','-', '+', '-', '+','-', '+','-','|'},
                             {'|',' ', '|', '1', '|','1', '|', ' ', '|',' ', '|',' ','|'}, //row 3
                             {'|','-', '+', '-', '+','-', '+', '-', '+','-', '+','-','|'},
                             {'|','0', '|', ' ', '|',' ','|', ' ', '|','1', '|',' ','|'},  //row 5
                             {'|','-', '+', '-', '+','-', '+', '-', '+','-', '+','-','|'},
                             {'|',' ', '|', ' ', '|',' ', '|', '1', '|',' ', '|','0','|'}, //row 7
                             {'|','-', '+', '-', '+','-', '+', '-', '+','-', '+','-','|'},
                             {'|','1', '|', ' ', '|',' ', '|', ' ', '|',' ', '|',' ','|'},  //row 9
                             {'|','-', '+', '-', '+','-', '+', '-', '+','-', '+','-','|'},
                             {'|',' ', '|', '0', '|',' ','|', '1', '|',' ', '|','1','|'},}; //row 11
        TakuzuLogic takuzuLogic = new TakuzuLogic();
        // ask the user the operation it wants to performs
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.print("Help: type \n 1: To see Example \n 2: To play the Game \n>> ");
            int choice = input.nextInt();

            if( choice == 1){
                printExampleBoard(example);
            }else if(choice == 2){
                takuzuLogic.printGameBoard(gameBoard);
               
            while(true){
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter your placement (1 - 36):");
                int playerPos = scan.nextInt();
                System.out.println("Enter your value (0 or 1):");
                char playerValue = (char)scan.nextShort();

                System.out.println(playerPos);
                // to switch the position which is enter by the player
                playingGround(gameBoard, playerPos, playerValue);
                 takuzuLogic.printGameBoard(gameBoard);

                boolean result = checker(example,gameBoard);
                if (result == true){
                    System.out.println("Congratulation you Won!");
                    break;
                }
            }
            }
            
        }
    } 
    
    public static void printExampleBoard(char[][] example){
        // print out the game board
        for(char[] row : example){
            for(char c:row){
                System.out.print(c); 
            }System.out.println();
        }
    }
    
    public static boolean checker(char [][]result, char game[][]){
      if(result == game){
            return true;
        }
        return false;
    }
}

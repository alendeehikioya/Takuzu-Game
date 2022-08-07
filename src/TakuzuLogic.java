
import java.util.ArrayList;


public class TakuzuLogic {
    
    static ArrayList<Character> playerValues = new ArrayList<>();
    
    public void printGameBoard(char[][] gameBoard){
        // print out the game board
        for(char[] row : gameBoard){
            for(char c:row){
                System.out.print(c); 
            }System.out.println();
        }
    }
    
    
     public static void playingGround(char[][] gameBoard,int playerPos, char playerValue){
        
        switch(playerPos){
            
            case 1:
                switch(playerValue){
                    case 0:{
                        gameBoard[0][1] ='0';
                        playerValues.add('0');}
                        break;
                    case 1:{
                        gameBoard[0][1] = '1';
                        playerValues.add('1');}
                        break;
                    default:
                        break;
                }
                break;
            case 2:
                switch(playerValue){
                    case 0:{
                        gameBoard[0][3] ='0';
                        playerValues.add('0');}
                        break;
                    case 1:{
                        gameBoard[0][3] = '1';
                        playerValues.add('1');}
                        break;
                    default:
                        break;
                }
                break;
            case 3:
                switch(playerValue){
                    case 0:{
                        gameBoard[0][5] ='0';
                        playerValues.add('0');}
                        break;
                    case 1:{
                        gameBoard[0][5] = '1';
                        playerValues.add('1');}
                        break;
                    default:
                        break;
                }
                break;
            case 4:
                switch(playerValue){
                    case 0:{
                        gameBoard[0][7] ='0';
                        playerValues.add('0');}

                        break;
                    case 1:{
                        gameBoard[0][7] = '1';
                        playerValues.add('1');}
                        break;
                    default:
                        break;
                }
                break;
            case 5:
                switch(playerValue){
                    case 0:{
                        gameBoard[0][9] ='0';
                        playerValues.add('0');}
                        break;
                    case 1:{
                        gameBoard[0][9] = '1';
                        playerValues.add('1');}
                        break;
                    default:
                        break;
                }
                break;
            case 6:
                switch(playerValue){
                    case 0:{
                        gameBoard[0][11] ='0';
                        playerValues.add('0');}
                        break;
                    case 1:{
                        gameBoard[0][11] = '1';
                        playerValues.add('1');}
                        break;
                    default:
                        break;
                }
                break;
                //end of the first row
            case 7:
                switch(playerValue){
                    case 0:{
                        gameBoard[2][1] ='0';
                        playerValues.add('0');}
                        break;
                    case 1:{
                        gameBoard[2][1] = '1';
                        playerValues.add('1');}
                        break;
                    default:
                        break;
                }
                break;
//            case 8:
//                gameBoard[2][3] = 1;
//                break;
//            case 9:
//                gameBoard[2][5] = 1;
//                break;
            case 10:
                switch(playerValue){
                    case 0:{
                        gameBoard[2][7] ='0';
                        playerValues.add('0');}
                        break;
                    case 1:{
                        gameBoard[2][7] = '1';
                        playerValues.add('1');}
                        break;
                    default:
                        break;
                }
                break;
            case 11:
                switch(playerValue){
                    case 0:{
                        gameBoard[2][9] ='0';
                        playerValues.add('0');}
                        break;
                    case 1:{
                        gameBoard[2][9] = '1';
                        playerValues.add('1');}
                        break;
                    default:
                        break;
                }
                break;
            case 12:
                switch(playerValue){
                    case 0:{
                        gameBoard[2][11] ='0';
                        playerValues.add('0');}
                        break;
                    case 1:{
                        gameBoard[2][11] = '1';
                        playerValues.add('1');}
                        break;
                    default:
                        break;
                }
                break;
                // end of second row
            case 13:
                
                break;
            case 14:
                switch(playerValue){
                    case 0:
                    {
                        gameBoard[4][1] ='0';
                        playerValues.add('0');}
                        break;
                    case 1:{
                        gameBoard[4][3] = '1';
                        playerValues.add('1');}
                        break;
                    default:
                        break;
                }
                break;
            case 15:
                switch(playerValue){
                    case 0:{
                        gameBoard[4][5] ='0';
                        playerValues.add('0');}
                        break;
                    case 1:
                    {
                        gameBoard[4][5] = '1';
                        playerValues.add('1');}
                        break;
                    default:
                        break;
                }
                break;
            case 16:
                switch(playerValue){
                    case 0:
                    {
                        gameBoard[4][7] ='0';
                        playerValues.add('0');}
                        break;
                    case 1:
                    {
                        gameBoard[4][7] = '1';
                        playerValues.add('1');}
                        break;
                    default:
                        break;
                }
                break;
            case 17:
               
                break;
            case 18:
                switch(playerValue){
                    case 0:{
                        gameBoard[4][11] ='0';
                        playerValues.add('0');}
                        break;
                    case 1:{
                        gameBoard[4][11] = '1';
                        playerValues.add('1');}
                        break;
                    default:
                        break;
                }
                break;
            // end of third row
            
            case 19:
                 switch(playerValue){
                    case 0:{
                        gameBoard[6][1] ='0';
                        playerValues.add('0');}
                        break;
                    case 1:{
                        gameBoard[6][1] = '1';
                        playerValues.add('1');}
                        break;
                    default:
                        break;
                }
                break;
            case 20:
                switch(playerValue){
                    case 0:{
                        gameBoard[6][3] ='0';
                        playerValues.add('0');}
                        break;
                    case 1:{
                        gameBoard[6][3] = '1';
                        playerValues.add('1');}
                        break;
                    default:
                        break;
                }
                break;
            case 21:
                switch(playerValue){
                    case 0:{
                        gameBoard[6][5] ='0';
                        playerValues.add('0');}
                        break;
                    case 1:{
                        gameBoard[6][5] = '1';
                        playerValues.add('1');}
                        break;
                    default:
                        break;
                }
                break;
            case 22:
                
                break;
            case 23:
               switch(playerValue){
                    case 0:{
                        gameBoard[6][9] ='0';
                        playerValues.add('0');}
                        break;
                    case 1:{
                        gameBoard[6][9] = '1';
                        playerValues.add('1');}
                        break;
                    default:
                        break;
                }
                break;
            case 24:
                break;
             
            // end of forth row
            case 25:
                switch(playerValue){
                    case 0:{
                        gameBoard[8][1] ='0';
                        playerValues.add('0');}
                        break;
                    case 1:{
                        gameBoard[8][1] = '1';
                        playerValues.add('1');}
                        break;
                    default:
                        break;
                }
                break;
            case 26:
                switch(playerValue){
                    case 0:{
                        gameBoard[8][3] ='0';
                        playerValues.add('0');}
                        break;
                    case 1:{
                        gameBoard[8][3] = '1';
                        playerValues.add('1');}
                        break;
                    default:
                        break;
                }
                break;
            case 27:
                switch(playerValue){
                    case 0:{
                        gameBoard[8][5] ='0';
                        playerValues.add('0');}
                        break;
                    case 1:{
                        gameBoard[8][5] = '1';
                        playerValues.add('1');}
                        break;
                    default:
                        break;
                }
                break;
            case 28:
                switch(playerValue){
                    case 0:{
                        gameBoard[8][7] ='0';
                        playerValues.add('0');}
                        break;
                    case 1:{
                        gameBoard[8][7] = '1';
                        playerValues.add('1');}
                        break;
                    default:
                        break;
                }
                break;
            case 29:
               switch(playerValue){
                    case 0:{
                        gameBoard[8][9] ='0';
                        playerValues.add('0');}
                        break;
                    case 1:{
                        gameBoard[8][9] = '1';
                        playerValues.add('1');}
                        break;
                    default:
                        break;
                }
                break;
            case 30:
                switch(playerValue){
                    case 0:{
                        gameBoard[8][11] ='0';
                        playerValues.add('0');}
                        break;
                    case 1:{
                        gameBoard[8][11] = '1';
                        playerValues.add('1');}
                    default:
                        break;
                }
                break;
             // end of row
            case 31:
                switch(playerValue){
                    case 0:{
                        gameBoard[10][1] ='0';
                        playerValues.add('0');}
                        break;
                    case 1:{
                        gameBoard[10][1] = '1';
                        playerValues.add('1');}
                        break;
                    default:
                        break;
                }
                break;
            
            case 32:
              /**  switch(playerValue){
                    case 0:
                        gameBoard[8][11] ='0';
                        break;
                    case 1:
                        gameBoard[8][11] = '1';
                        break;
                    default:
                        break;
                }*/
                break;
            
            case 33:
                switch(playerValue){
                    case 0:{
                        gameBoard[10][5] ='0';
                        playerValues.add('0');}
                        break;
                    case 1:{
                        gameBoard[10][5] = '1';
                        playerValues.add('1');}
                        break;
                    default:
                        break;
                }
                break;
                
            case 34:
                
                break;
                    
                case 35:
                switch(playerValue){
                    case 0:{
                        gameBoard[10][9] ='0';
                        playerValues.add('0');}
                        break;
                    case 1:{
                        gameBoard[10][9] = '1';
                        playerValues.add('1');}
                        break;
                    default:
                        break;
                }
                break;
                        
            case 36:
                
                break;
          
        }
    }
}


package ex04_ele_capiralkm;
import java.util.Scanner;
public class RockPaperScissors{
	public static void main(String[] args){
		Move rock = new Move("Rock");
		Move paper = new Move("Paper");
		Move scissors = new Move("Scissors");
                Move user = new Move("null");
                Move computer = new Move("null");
                Move res = new Move("null");
		
		rock.setStrongAgainst(scissors);
		paper.setStrongAgainst(rock);
		scissors.setStrongAgainst(paper);
		
		int roundsToWin = 2;
                int choice = 0;
                int move = 0;
                
                Scanner sc = new Scanner(System.in);
                
              for(int j =0 ; choice < 3; j++) { 
                System.out.println("Welcome to Rock, Paper, Scissors. Please choose an option:");
                 System.out.println("1. Start game");
                 System.out.println("2. Change number of rounds");
                 System.out.println("3. Exit application");
                 choice = sc.nextInt();
            switch (choice) {
              case 1 ->{
                    for(int i = 0; user.getUserScore() <= roundsToWin || computer.getCompScore() <= roundsToWin ; i++){
                        int random = (int) Math.floor(Math.random()*3) + 1;
                        switch(random){
                            case 1 -> computer.setCompMove(rock);
                            case 2 -> computer.setCompMove(paper);
                            case 3 -> computer.setCompMove(scissors);
                        }
                        
                        
                        System.out.println("The computer has selected its move. Select your move:");
                        System.out.println("1. Rock");
                        System.out.println("2. Paper");
                        System.out.println("3. Scissors");
                        move = sc.nextInt();
                        switch(move){
                            case 1 -> user.setUserMove(rock);
                            case 2 -> user.setUserMove(paper);
                            case 3 -> user.setUserMove(scissors);
                            default -> System.out.println("Please only put numbers between 1-3. Run this program to play again.");
                          
                            
                        }
                        
                        int result = Move.compareMoves(computer.getCompMove(),user.getUserMove());
                        switch(result){
                            case 0 -> {
                                res.compWins(computer.getCompMove(),user.getUserMove());
                                computer.setCompScore();
                        }
                            case 1 -> {
                                res.userWins(computer.getCompMove(),user.getUserMove());
                                user.setUserScore();
                        }
                            case 2 -> res.draw(computer.getCompMove(),user.getUserMove());
                                
                        }
                        System.out.println("Player: " + user.getUserScore() + " - Computer: " + computer.getCompScore());
                        
                        if(user.getUserScore() == roundsToWin){
                            System.out.println("User Wins!");
                        }
                        else if(computer.getCompScore()== roundsToWin){
                            System.out.println("Computer Wins!");
                        }
                        else{
                            continue;
                        }
                    
                    break;
                    
            }
              }
                case 2 ->{
                    System.out.println("How many wins are needed to win a match?");
                    int noOfRounds = sc.nextInt();
                    roundsToWin = noOfRounds;
                    break;
                }
                case 3 ->{
                    System.out.println("Thank you for playing!");
                    break;
                }
                default ->{
                    System.out.println("Error. Only put 1, 2, or 3.");
                    break;
                }
            }
                }    
        }
    
        }

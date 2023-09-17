/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex04_ele_capiralkm;

public class Move {
    private final String name;
	private Move strongAgainst;
        private Move compMove;
        private Move userMove;
        private int userScore = 0;
        private int compScore = 0;
    
    public Move(String name){
        this.name = name;
        this.strongAgainst = null;
    }
	public String getName(){
		return name;
	}
	public Move getStrongAgainst(){
		return strongAgainst;
	}
	public void setStrongAgainst(Move s){
		strongAgainst = s;
	}
    public static int compareMoves(Move m1, Move m2){
		// This method returns 0 if m1 wins, 1 if m2 wins, and 2 if neither wins
		if(m1.getStrongAgainst() ==  m2){
                    return 0;
                }
		else if (m2.getStrongAgainst() == m1){
                    return 1;
                }
                else{
                    return 2;
                }
	}
    public void setCompMove(Move m1){
        compMove = m1;
}  
    
    
    public void setUserMove(Move m2){
        userMove = m2;
    }

   
    public Move getCompMove() {
        return compMove;
    }
    
    
    public Move getUserMove() {
        return userMove;
    }
    

    
    public int getUserScore() {
        return userScore;
    }

    
    public void setUserScore() {
        this.userScore = userScore + 1;
    }
    public void setUserScore(int score) {
        this.userScore = score;
    }

    
    public int getCompScore() {
        return compScore;
    }


    public void setCompScore() {
        this.compScore = compScore + 1;
    }
    public void setCompScore(int score) {
        this.compScore = score;
    }
    
    public void userWins(Move m1, Move m2){
        System.out.println("User chose " + m2.name + ". Computer chose " + m1.name + ". Player wins the round!");
        
    }
    public void compWins(Move m1, Move m2){
        System.out.println("User chose " + m2.name + ". Computer chose " + m1.name + ". Computer wins the round!");
        
    }
    public void draw(Move m1, Move m2){
        System.out.println("User chose " + m2.name + ". Computer chose " + m1.name + ".  The round is a draw!");
        
    }
    
}


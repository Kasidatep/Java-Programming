package kasidate.Matchstick;

public class Matchstick {
    private int matchsticks;

    Matchstick(int initMatches){
        this.matchsticks = initMatches;
    }

    public void takeMatches(int numMatches){
        if (isValidMove(numMatches) == true){
        this.matchsticks -= numMatches;}
    }

    public boolean isValidMove(int numMatches){
        if ( numMatches <= 3) {
            return true;
        }else {
            return false;
        }
    }

    public boolean isGameOver(){
        if (this.matchsticks == 0){
            return true;
        }else {
            return false;
        }
    }
}

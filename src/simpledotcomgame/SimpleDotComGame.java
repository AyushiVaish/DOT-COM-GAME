
package simpledotcomgame;


public class SimpleDotComGame {
    
    
    public static void main(String[] args) {
SimpleDotCom game=new SimpleDotCom();
int guess=0;
GameHelper helper = new GameHelper();
int random=(int)(Math.random()*5);
int[] locations={random,random+1,random+2};
game.setLocation(locations);
boolean isAlive=true;

while(isAlive==true)
{
    String guessInput=helper.UserInput("Enter a Number");
    String result=game.checkYourself(guessInput);
    guess++;
if(result.equals("kill"))
{
    isAlive=false;
    System.out.println("You took " + guess + "guesses");
}    
}

    }
}


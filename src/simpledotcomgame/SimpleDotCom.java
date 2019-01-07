/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpledotcomgame;


public class SimpleDotCom {
    int[] location;
    int numOfHits=0;
    public void setLocation(int[] locs)
    {
        location=locs;
    }
    public String checkYourself(String guess)
    {
        int guessNum=Integer.parseInt(guess);
        String result="miss";
        for(int cell:location)
        {
           if(guessNum==cell)
           {
               result="hit";
               numOfHits++;
               break;
               
           }
           
        }
        if(numOfHits==location.length)
        {
            result="kill";
            
        }
        System.out.println(result);
 return result;
    }
    
}

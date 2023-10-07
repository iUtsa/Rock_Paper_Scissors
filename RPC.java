import java.util.*;
public class RPC {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please input: 0=Rock or 1=Paper or 2=Sessiors \n");
        int userInput=input.nextInt();

        Random random=new Random();
        int systemInput=random.nextInt(0,2); //bounding random number

        Elements game=new Elements();
        game.setRock(0);
        game.setPaper(1);
        game.setScissors(2);

        if(userInput==systemInput){
            System.out.println("DRAW!");
        }
        else if((userInput==game.getRock())&& systemInput==2  || (userInput==game.getPaper()) && systemInput==0  || (userInput==game.getScissors()) && systemInput==1 ){
            System.out.println("YEY! YOU WON!!");
        }else{
            System.out.println("YOU LOSE! NEXT TIME IS NEVER LAST TIME!");
        }
    }
}
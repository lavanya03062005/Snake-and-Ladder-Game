import player.Player;
import dice.Dice;
import java.util.*;
import coordinates.Coordinates;
import board.Board;
import jumper.Jumper;
import player.Player;
import game.Game;
public class App {
    public static void main(String[] args) throws Exception {
      HashMap<String,Jumper> map =new HashMap<>();
      map.put("6",new Jumper(new Coordinates(9,5),new Coordinates(6,6)));
      map.put("6",new Jumper(new Coordinates(0,1),new Coordinates(9,9)));
      map.put("6",new Jumper(new Coordinates(7,0),new Coordinates(0,9)));
      map.put("6",new Jumper(new Coordinates(3,3),new Coordinates(7,4)));
       
        System.out.println("Game Snake and Ladder -->");
       Player p1=new Player();
       p1.setplayername("ravi");
      // p1.setPlayerDetailsFromUserInput(p1);
        System.out.println("Player1 name : "+p1.getplayername());
       Player p2=new Player();
       p2.setplayername("seetha");
       //p2.setPlayerDetailsFromUserInput(p2);
       System.out.println("Player2 name : "+p2.getplayername());
       Dice dice=new Dice();
       Board b=new Board(10,map);
       b.printboard();
       Game game=new Game(b,new Player[] {p1,p2},dice);
        game.play();
  

    }
    
}

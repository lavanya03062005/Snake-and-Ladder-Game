package game;
import board.Board;
import player.Player;
import coordinates.Coordinates;
import dice.Dice;
import jumper.Jumper;
public class Game {
Board board;
Player []players;
boolean []isAllowed;
Coordinates []places;
int  turn;
Dice dice;
public Game(Board board,Player []players,Dice dice){
    this.board=board;
    this.players=players;
    this.dice=dice;
    this.turn=0;
    isAllowed=new boolean[players.length];
    places=new Coordinates[players.length];
    for(int i=0;i<players.length;i++){
        places[i]=new Coordinates(board.getboardsize()-1,0);
    }
}
public void play(){
    while(true){
     int num=dice.diceRoll();
     System.out.println(players[turn].getplayername()+" rolled --> "+num+ "["+places[turn].getrow()+","+places[turn].getcol()+"]");
     if(!isAllowed[turn]){
        if(num!=1){
            turn=1-turn;
            continue;
        }
        else{
            isAllowed[turn]=true;
        }
          
     }
     Coordinates nc=getnewcoordinates(places[turn],num);
     if(nc.getrow()<0){
        System.out.println(players[turn].getplayername()+" has won");
        return;
     }
     places[turn]=nc;
     turn=1-turn;
    }
}
private Coordinates  getnewcoordinates(Coordinates oc , int num){
int row=oc.getrow();
int col=oc.getcol();
while(num>0){
    if(row%2!=0){
        if(col==board.getboardsize()-1){
            row--;
        }
        else 
        col++;
    }
    else{
        if(col==0){
            row--;
        }
        else
        col--;
    }
    num--;
}
if(row<0)
return new Coordinates(row,col);
if(checkIfJumperExists(row,col)){
Jumper jumper=board.jumpers.get(board.board[row][col]);
return jumper.end;
}
return new Coordinates(row,col);
}
private boolean checkIfJumperExists(int row,int col){
    return board.jumpers.containsKey(board.board[row][col]);
}
}

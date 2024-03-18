package dice;
public class Dice {
//random() function generates any random value in the range of [0,1]
int MIN=1;
int MAX=6;
public int diceRoll(){
    double d=(Math.random()*MAX)+MIN;
    return (int)d;
}
}

package coordinates;

public class Coordinates {
int row;
int col;
public Coordinates(int x,int y){
    this.row=x;
    this.col=y;
}
public String getcoordinates(){
    StringBuilder sb=new StringBuilder();
    sb.append("[").append(this.row).append(",").append(this.col).append("]");
    return sb.toString();
}
public int getrow(){
    return this.row;
}
public int getcol(){
    return this.col;
}
}

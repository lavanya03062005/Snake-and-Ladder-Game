package player;
import java.util.Scanner;


public class Player {
String name;
int age;
String emailid;
String contactnumber;
String address;
public void setplayerdetails(String name,int age,String contactno,String emailid,String address){
    this.name=name;
    this.age=age;
    this.emailid=emailid;
    this.contactnumber=contactno;
    this.address=address;
}
public void setplayername(String name){
    this.name=name;
}
public void setplayernameandage(String name,int age){
    this.name=name;
    this.age=age;
}

public void setplayernameandemailid(String name,String emailid){
    this.name=name;
    this.emailid=emailid;
}
public String getplayername(){
    return this.name;
}
public void getplayernameandage(){
    System.out.println("Player name : "+this.name);
    System.out.println("Player age : "+this.age);  
}
public void getplayernameandemailid(){
    System.out.println("Player name : "+this.name);
    System.out.println("Player emailid : "+this.emailid); 
}

public void getplayerdetails(){
    System.out.println("Player name : "+this.name);
    System.out.println("Player age : "+this.age);
    System.out.println("Player emailid : "+this.emailid);
    System.out.println("Player contactnumber : "+this.contactnumber);
    System.out.println("Player address : "+this.address);
}
public void setPlayerDetailsFromUserInput(Player p){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the player details");
        System.out.println("Enter the player name");
        String name=sc.nextLine();
        System.out.println("Enter the player Contactnumber");
        String contactno=sc.nextLine();
        System.out.println("Enter the player emailid");
        String emailid=sc.nextLine();
        System.out.println("Enter the player Address");
        String address=sc.nextLine();
        System.out.println("Enter the player age");
        int age=sc.nextInt();
        p.setplayerdetails(name,age,contactno,emailid,address);
    }
}

import java.util.*;
public class play{
public static void main(String[] args){
     Random ran=new Random();
     Scanner s=new Scanner(System.in);
     int a=ran.nextInt(10);
     int guess=0;
     int count=0;
     while(a!=guess){
      guess=s.nextInt();
        
        count++;
        if(guess<a){
          System.out.println("to less");
          }
          else{
          System.out.println("too high");
          }
          System.out.println(count);
          }
      }
  }
          
     

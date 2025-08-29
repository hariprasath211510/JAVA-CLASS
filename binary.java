import java.util.*;
public class binary{
    public static void main(String[] args){
     String Str =" ";
    int n=23;
    while(n>0){
      Str=(n%2)+Str;
      n=n/2;
  }
System.out.println(Str);
}
}

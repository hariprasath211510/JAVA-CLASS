import java.util.*;
public class cards{
public static void main(String[] args){
int arr[]={2,3,4,5};
System.out.println(max_cards(arr,2));
public  static int max _cards(int cardPoints[],int k){
int left=0;
int right=0;
int sum=0;
 
for(int i=0;i<k;i++){
 left+=cardPoints[i];
}
sum=left;

for(int i=0;i<k;i++){
 right+=cardPoints[cardPoints.length-(i+1)];
  left-=cardPoints[k-(i+1)];
int avg=left+right;
sum=Math.max(sum,avg);
}

return sum;
}
}

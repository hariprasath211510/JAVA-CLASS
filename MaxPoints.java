import java.util.*;
public class MaxPoints{
     public static void main(String[] args){
     int arr[]={2,2,2};
     System.out.println(maxscore(arr,2));
     }
     
     public static int maxscore(int[] cardpoints,int k){
     int left=0;
     int right=0;
     int sum=0;
     for(int i=0;i<k;i++){
         left+=cardpoints[i];
        }
        sum=left;
        
        for(int i=0;i<k;i++){
        right+=cardpoints[cardpoints.length-(i+1)];
        left-=cardpoints[k-(i+1)];
        int avg=left+right;
        sum=Math.max(sum,avg);
        }
        return sum;
        }
}

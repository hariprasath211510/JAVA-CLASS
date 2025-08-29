BINARY SEARCH

import java.util.*;

public class Main {
    public static int binarySearch(int[] arr, int n) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == n) {
                return mid;
            }
            if (arr[mid] < n) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int size = s.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter sorted elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("Enter the element to search:");
        int n = s.nextInt();

        int result = binarySearch(arr, n);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}

FIBONNACCI SERIES

import java.util.*;
public class fino{
public static void main(String args[]){
   Scanner s=new Scanner(System.in);
   System.out.println("enter the range");
   int n=s.nextInt();
  int first=0; 
  int second=1;
  for(int i=1;i<=n;i++){
System.out.print(first+" ");
  int next=first+second;
 first=second;
second=next;
}
}
}

PALINDROME 

import java.util.*;
class paly{
public static void main(String[] args){
  Scanner s=new Scanner(System.in);
 int n=s.nextInt();
int n1=n;
int rev=0;
while(n1!=0){
  int div=n1%10;
 rev=rev*10+div;
 n1=n1/10;
}
System.out.println(rev);
if(rev==n){
System.out.print("palindrome");
}else{
System.out.println("not palindrome");
}
}
}


import java.io.*;
import java.util.Scanner;
public class LinearSearch{
    public static int search(int arr[],int N,int x)
    {
        for(int i=0;i<N;i++){
            if(arr[i]==x)
            return i;
                }
                return -1;
        }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the length of array:");
            int N =sc.nextInt();
            int[] arr=new int[N];
            System.out.println("Enter the "+N+"Elements");
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("Enter the element to search:");
            int x=sc.nextInt();
            int result=search(arr,arr.length,x);
            if(result==-1)
            System.out.println("Nil");
            else 
            System.out.println("The Searching Elements Index:"+result);
           sc.close();
            }
                }

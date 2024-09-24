
// prime number---------------------------------------------------------

// import java.util.*;
// public class Main{
//   public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int a=sc.nextInt();

//     int count=0;

//       if(a%2==0){
//         count++;
//       }
//       if(count==0){
//         System.out.println("prime");
//       }
//       else{
//         System.out.println("not prime");

//     }

//     }
// }

// perfect number--------------------------------------------------------------------

// public class Main {

//   public static void main(String[] args) {
//      int num=28;
//      int sum=0;

//      for(int i=1; i<num; i++){
//       if(num%i==0){
//         sum =sum+i;
//       }

//      }
//      if(sum==num){
//       System.out.println("perfect number");
//      }
//      else{
//       System.out.println("not perfect number");
//      }
//   }
// }

// fibonnaci series-------------------------------------------------------

// public class Main {

//   public static void main(String[] args) {
//     int first=0;
//     int second=1;
//     System.out.print(first+" ");
//     System.out.print(second+" ");
//     for(int i=1; i<=5; i++){
//       int temp=first+second;
//       System.out.print(temp+" ");
//       first=second;
//       second=temp;
//     }

//   }
// }

// neon number---------------------------------------------------------------------------

// import java.util.*;
// public class Main{
//   public static void main(String[] args) {
//     Scanner sc =new Scanner(System.in);
//     int num=sc.nextInt();
//     int squre=num*num;
//     int sum=0;
//     int temp=num;
//     int rem=0;

//     while (squre>0) {
//   rem=squre%10;
//       sum=sum+rem;
//       squre=squre/10;
//     }
//     if(temp==sum){
//       System.out.println("neon");
//     }
//     else{
//       System.out.println("not neon");
//     }

//   }
// }

// amstrong number ------------------------------------------------------

// import java.util.*;
// public class Main {

//   public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     for(int i=1; i<=1000; i++){
//       int num=i;
//       int sum=0;
//       int temp=num;
//       int rem=0;

//       while (num>0) {
//         rem=num%10;
//         sum=sum+rem*rem*rem;
//         num=num/10;

//       }
//       if(temp==sum){
//         System.out.println("amstrong number"+ temp);
//       }

//     }

//   }
// }
// paliandreom number------------------------------------------------------
// public class Main {

//   public static void main(String[] args) {
//     for(int i=1; i<=100; i++){
//       int num=i;
//       int sum=0;
//       int temp=num;
//       int rem=0;

//       while (num>0) {

//         rem=num%10;
//         sum=sum*10+rem;
//         num=num/10;

//       }
//       if(temp==sum){
//         System.out.print(temp+" ");
//       }

//     }
//   }
// }

// Factorial-------------------------------------------------------------------------

//  public class Main{  
//   public static void main(String args[]){  
//    int fact=1;  
//    int num=5;    
//    for(int i=1;i<=num;i++){    
//        fact=fact*i;    
//    }    
//    System.out.println("Factorial of "+num+" is: "+fact);    
//   }  
//  }  

// array sort ---------------------------------------------------------------------

// public class Main {
//   static void sort(int a[]){
//     for(int i=0; i<a.length; i++){

//       for(int j=i+1; j<a.length;j++){
//       if(a[i]>a[j]){

//         int temp=  a[i];
//         a[i]=a[j];
//         a[j]=temp;
//       }
//       }
//     }
//   }

//   static void display(int a[]){
//     for(int i=0; i<a.length; i++){
//       System.out.print(a[i]+" ");
//     }
//   }

//   public static void main(String[] args) {
//     int a[]={1,2,3,4,2,4,5,6};
//     display(a);
//     sort(a);
//     System.out.println();
//     display(a);

//   }
// }

// array even number-----------------------------------------------------------------

// public class Main {

//   public static void main(String[] args) {
//    int a[]={1,2,3,4,5};

//    for(int i=0; i<a.length; i++){

//     if(a[i]%2==0){
//       System.out.println(a[i]);
//     }
//    }
//   }
// }

// bigest element of array-----------------------------------------------------

// public class Main {

//   public static void main(String[] args) {
//     int a[]={1,2,3,54,500,5,4};
//     int max=0;

//     for(int i=0; i<a.length; i++){
//       if(a[i]>max){
//         max=a[i];
//       }

//     }
//      System.out.println(max);
//   }
// }

// max and second max array -----------------------------------------------------------

// public class Main {
//   static void sort(int a[]){
//     for(int i=0; i<a.length; i++){

//       for(int j=i+1; j<a.length; j++){
//         if(a[i]>a[j]){
//           int temp=a[i];
//           a[i]=a[j];
//           a[j]=temp;
//         }
//       }

//     }
//   }

//   static void max(int a[]){
//     int max=0;
//      for(int i=0; i<a.length; i++){

//       if(a[i]>max){
//         max=a[i];
//         System.out.println(" ");
//       }

//     }
//     System.out.println(max);
//   }

//    static void display(int a[]){
//     for(int i=0; i<a.length; i++){
//       System.out.print(a[i]+" ");
//     }
//   }

//   public static void main(String[] args) {
//     int a[]={1,2,12,11,5,7,8,9};
//    display(a);
//    sort(a);
//    System.out.println();
//    display(a);
//    max(a);
//    System.out.println();
//    display(a);

//   }
// }

//    *    
//   * *
//  * * *
// * * * *

//  *
//  * *
//  * * *

// public class Main {

//   public static void main(String[] args) {
//     for(int i=1; i<=4; i++){
//       for(int s=3; s>=i; s--){
//         System.out.print(" ");
//       }
//       for(int j=1; j<=i; j++){
//         System.out.print("* ");
//       }
//       System.out.println(" ");
//     }
//   }
// }

// 1
// 2 1
// 3 2 1
// 4 3 2 1
// 5 4 3 2 1
// 6 5 4 3 2 1
// 7 6 5 4 3 2 1

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 7; i++) {
//             for (int j = i; j >= 1; j--) {
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// leap year-----------------------------------------------------------

// import java.util.*;
// public class Main
// {
// public static void main(String[] args) {
// Scanner sc=new Scanner(System.in);
// System.out.println("enter year");
// int y=sc.nextInt();
// if(y%4==0 )
// {
// System.out.println("leap year");
// }
// else if(y%100==0 )
// {
// System.out.println("leap year");
// }
// else if(y%400==0 )
// {
// System.out.println("leap year");
// }
// else
// {
// System.out.println("Not leap year");
// }
// }
// }

// odd/even number sum in array---------------------------------------
// import java.util.*;
// public class Main{
// public static void main(String[] args) {
// Scanner sc=new Scanner(System.in);
// int size=sc.nextInt();
// int a[]=new int [size];

// for(int i=0; i<=a.length-1; i++){
// System.out.println("enter your value");
// a[i]=sc.nextInt();
// }
// for(int j=0; j<=a.length-1;j++){
// System.out.println(a[j]+" ");
// }
// System.out.println(" ");
// int sum=0;

// for(int k=0; k<=a.length-1; k++){
// if(a[k]%2==0){
// sum=sum+a[k];

// }
// }
// System.out.println(sum+" ");

// }
// }

// public class Main {

// public static void main(String[] args) {
// int num=153;
// int sum=0;
// int temp=num;
// int rem=0;

// while (num>0){
// rem=num%10;
// sum=sum+rem*rem*rem;
// num=num/10;
// // System.out.println(sum);
// }
// if (sum==temp) {
// System.out.println(temp+"This is new");

// }
// // else{
// // System.out.println(temp);
// // }

// }
// }

// public class Main {

// public static void main(String[] args) {
// int a[]={1,2,3,4,5,6,7,8,153};
// for(int i=0; i<=a.length; i++){
// // System.out.print(a[i]);
// int num=a[i];
// int rem=0;
// int sum=0;
// int temp=num;

// while (num>0) {
// rem=num%10;
// sum=sum+rem*rem*rem;
// num=num/10;

// }
// if (temp==sum) {
// System.out.println(temp);

// }
// // else{
// // System.out.println("not");
// // }
// }

// }
// }

// import java.util.*;

// public class Main {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter the value of integer:- ");
// int a = sc.nextInt();
// System.out.println("enter the value of float:- ");
// float b = sc.nextFloat();
// System.out.println("enter the value of char:- ");
// char c = sc.next().charAt(0);
// System.out.println("enter the value of boolean:- ");
// boolean d = sc.nextBoolean();
// System.out.println("enter the value of long:- ");
// long e = sc.nextLong();
// System.out.println("enter the value of double:- ");
// double f = sc.nextDouble();

// System.out.println("Value of a:- " + a);
// System.out.println("Value of b:- " + b);
// System.out.println("Value of c:- " + c);
// System.out.println("Value of d:- " + d);
// System.out.println("Value of e:- " + e);
// System.out.println("Value of f:- " + f);

// }
// }

// find duplicat element in 2 arrays-------------------------------------------------------------- 
// public class Main {

//     public static void main(String[] args) {
//         int a[]={1,2,3,5,7,8};
//         int b[]={44,55,66,5,88,92};
//         for(int i=0; i<a.length; i++){
//             if (a[i]==b[i]) {
//                 System.out.println(a[i]);
                
//             }
//         }
//     }
// }

public class Main{
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,7,8};
        int b[]={4,20,52,45,58,88,89};
        for(int i=1; i<a.length; i++){
            for(int j=0; j<a.length; j++){
                if(a[i]==b[i])
                System.out.println(a[i]);

            }
        
        }

        
  }
    }

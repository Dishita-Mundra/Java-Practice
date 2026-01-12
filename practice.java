import java.util.Scanner;

// // 1.check whether a number is positive, negative, or zero
// public class practice {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         if(n>0){
//             System.out.println("positive");
//         } else if(n<0){
//             System.out.println("negative");
//         } else {
//             System.out.println("zero");
//         }
//     }
// }

// //2.check whether a number is even or odd
// public class practice {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         if(n%2==0){
//             System.out.println("even");
//         } else {
//             System.out.println("odd");
//         }
//     }
// }

// //3.largest of two numbers using if–else.
// public class practice{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         if(a>b){
//             System.out.println("a is greater");
//         } else{
//             System.out.println("b is greater");
//         }
//     }
// }

// //4.person is eligible to vote (age ≥ 18).
// public class practice{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int age=sc.nextInt();
//         if(age>=18){
//             System.out.println("can vote");
//         } else{
//             System.out.println("cannot vote");
//         }
//     }
// }

// //5.check whether a year is a leap year.
// public class practice{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int year=sc.nextInt();
//         if(year%4==0){
//             System.out.println("leap year");
//         } else{
//             System.out.println("not a leap year");
//         }
//     }
// }

// //6.largest of three numbers.
// public class practice{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         if (a>=b && a>=c){
//             System.out.println("a is greatest");
//         }
//         if (b>=a && b>=c){
//             System.out.println("b is greatest");
//         }
//         if (c>=a && c>=b){
//             System.out.println("c is greatest");
//         }
//     }
// }

// //7.check whether a character is vowel or consonant.
// public class practice{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         char ch=sc.next().charAt(0);
//         if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
//            ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
//             System.out.println("vowel");
//         } else{
//             System.out.println("consonant");
//         }

//     }
// }

// //8.number is divisible by 5 and 11.
// public class practice {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         if (n%5==0 && n%11==0){
//             System.out.println("divisible by 5 and 11");
//         } else{
//             System.out.println("not divisible by 5 and 11");
//         }
//     }
// }

// //9.Calculate grade based on marks:90–100 → A,75–89 → B,60–74 → C,< 60 → Fail
// public class practice{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int marks=sc.nextInt();
//         if(marks>=90 && marks<=100){
//             System.out.println("grade A");
//         } else if(marks>=75 && marks<=89){
//             System.out.println("grade B");
//         } else if(marks>=60 && marks<=74){
//             System.out.println("gradeC");
//         } else{
//             System.out.println("Fail");
//         }
//     }
// }

// //10.Calculate electricity bill based on units consumed.
// public class practice{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int units=sc.nextInt();
//         double bill=0;
//         if(units<=100){
//             bill=units*1.0;
//         } else if(units<=200){
//             bill=100*1.0+(units-100)*1.5;
//         } else if(units<=300){
//             bill=100*1.0+100*1.5+(units-200)*2.0;
//         } else{
//             bill=100*1.0+100*1.5+100*2.0+(units-300)*3.0;
//         }
//         System.out.println("Electricity Bill: "+bill);
//     }
// }

// //11.calculator using switch case (+, −, ×, ÷).
// public class practice{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int operator=sc.nextInt();
//         switch(operator){
//             case 1: System.out.println(a + b);
//                     break;
//             case 2: System.out.println(a - b);
//                     break;
//             case 3: System.out.println(a * b);
//                     break;
//             case 4: if(b==0){
//                         System.out.println("cannot divide by zero");
//                     } else {
//                         System.out.println(a / b);
//                     }
//                     break;
//             case 5: if(b==0){
//                         System.out.println("cannot divide by zero");
//                     } else {
//                         System.out.println(a % b);
//                     }
//                     break;
//             default: System.out.println("invalid operator");
//         }
//     }
// }

// //12.day of the week based on day number (1–7).
// public class practice{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int day=sc.nextInt();
//         switch(day){
//             case 1:System.out.println("monday");
//                    break;
//             case 2:System.out.println("tuesday");
//                    break;
//             case 3:System.out.println("wednesday");
//                    break;
//             case 4:System.out.println("thursday");
//                    break;
//             case 5:System.out.println("friday");
//                    break;
//             case 6:System.out.println("saturday");
//                    break;
//             case 7:System.out.println("sunday");
//                    break;
//         }
//     }
// }

// // //13.month name based on month number (1–12).
// public class practice{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int month=sc.nextInt();
//         switch(month){
//             case 1:System.out.println("january");
//                    break;
//             case 2:System.out.println("february");
//                    break;
//             case 3:System.out.println("march");
//                    break;
//             case 4:System.out.println("april");
//                    break;
//             case 5:System.out.println("may");
//                    break;
//             case 6:System.out.println("june");
//                    break;
//             case 7:System.out.println("july");
//                    break;
//             case 8:System.out.println("august");
//                    break;
//             case 9:System.out.println("september");
//                    break;
//             case 10:System.out.println("october");
//                    break;
//             case 11:System.out.println("november");
//                    break;
//             case 12:System.out.println("december");
//                    break;
//         }
//     }
// }

// //14.menu-driven program for area of circle, square, rectangle.
// public class practice{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int choice=sc.nextInt();
//         switch(choice){
//             case 1: //area of circle
//                     double r=sc.nextDouble();
//                     double areaCircle=3.14*r*r;
//                     System.out.println(areaCircle);
//                     break;
//             case 2: //area of square
//                     double s=sc.nextDouble();
//                     double areaSquare=s*s;
//                     System.out.println(areaSquare);
//                     break;
//             case 3: //area of rectangle
//                     double l=sc.nextDouble();
//                     double w=sc.nextDouble();
//                     double areaRectangle=l*w;
//                     System.out.println(areaRectangle);
//                     break;
//         }
//     }
// }

// //15.Print numbers from 1 to 100.
// public class practice{
//     public static void main(String[] args) {
//         for(int i=1;i<=100;i++){
//             System.out.println(i);
//         }
//     }
// }

// //16.Print even numbers between 1 and 50.
// public class practice{
//     public static void main(String[] args) {
//         for(int i=2;i<=50;i=i+2){
//             System.out.println(i);
//         }
//     }
//}

//17.Find the sum of first N natural numbers.
// public class practice{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int sum=0;
//         for(int i=1;i<=n;i++){
//             sum=sum+i;
//         }
//         System.out.println(sum);
//     }
// }

//18.Print the multiplication table of a number
// public class practice{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=10;i++){
//             System.out.println(n*i);
//         }
//     }
// }

//19.Count the number of digits in a number.
// public class practice{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int count=0;
//         while(n>0){
//             count++;
//             n=n/10;
//         }
//         System.out.println(count);
//     }
// }

//20.Check whether a number is prime.
// public class practice{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         boolean isPrime=true;
//         for(int i=2;i<=n-1;i++){    
//             if(n%i==0){
//                 isPrime=false;
//                 break;
//             }   
//             System.out.println(isPrime?"prime":"not prime");
//         }
//         System.out.println(isPrime?"prime":"not prime");
//     }
// }

//21.Find the factorial of a number.
// public class practice{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int fact=1;
//         for(int i=1;i<=n;i++){
//             fact=fact*i;
//         }
//         System.out.println(fact);
//     }
// }

//22.reverse a given number.
public class practice{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        while(n>0){
            int digits=n%10;
            rev=rev*10+digits;  
            n=n/10;
        }
        System.out.println(rev);
    }
}
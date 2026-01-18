import java.util.Scanner;

//1.accept two integers and check whether they are equal or not

// public class practice1 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         if (a == b) {
//             System.out.println("Equal");
//         } else {
//             System.out.println("Not Equal");
//         }
//     }
// }


//2.check whether a number is even or odd
// public class practice1{
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


//3.check whether a number is positive or negative
// public class practice1 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         if(n>0){
//             System.out.println("positive");
//         } else if(n<0{
//             System.out.println("negative");
//         } else {
//             System.out.println("zero");  
//         }
//     }
// }


//4.check whether a year is a leap year.
// public class practice1{
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


//5.person is eligible to vote (age ≥ 18).
// public class practice1{
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


//6.accept the height of a person in centimeter and categorize the person according to their height.
// public class practice1{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int height=sc.nextInt();
//         if(height<150){
//             System.out.println("short");
//         } else if(height<=170){
//             System.out.println("average");
//         } else{
//             System.out.println("tall");
//         }
//     }
// }


//7.find the largest of three numbers.
// public class practice1{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int c=sc.nextInt();
//         if(a>=b && a>=c){
//             System.out.println("largest is: " + a);
//         } else if(b>=a && b>=c){
//             System.out.println("largest is: " + b);
//         } else{
//             System.out.println("largest is: " + c);
//         }
//     }
// }


//8.eligibility for admission based on marks in three subjects.
// public class practice1{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int maths=sc.nextInt();
//         int phy=sc.nextInt();
//         int chem=sc.nextInt();
//         int total=maths+phy+chem;
//         int tM=maths+phy;
//         if (maths>=65 && phy>=55 && chem>=50 && total>=190 || tM>=140) {
//             System.out.println("Candidate is eligible");
//         } else {
//             System.out.println("Candidate is not eligible");
//         }
//     }
// }


//9.Python program to read roll no, name and marks of three subjects and calculate the total, percentage and division.
// public class practice1{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int rollno=sc.nextInt();
//         String name=sc.next();
//         int s1=sc.nextInt();
//         int s2=sc.nextInt();    
//         int s3=sc.nextInt();
//         int total=s1+s2+s3;
//         float percentage=(total/300.0f)*100;
//         System.out.println("Total: " + total);
//         System.out.println("Percentage: " + percentage);
//     }
// }


//10.read temperature in centigrade and display a suitable message according to temperature
// public class practice1{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int temp=sc.nextInt();
//         if(temp<0){
//             System.out.println("Freezing weather");
//         } else if(temp<=10){
//             System.out.println("Very Cold weather");
//         } else if(temp<=20){
//             System.out.println("Cold weather");
//         } else if(temp<=30){
//             System.out.println("Normal in Temp");
//         } else if(temp<=40){
//             System.out.println("Its Hot");
//         } else{
//             System.out.println("Its Very Hot");
//         }
//     }
// }


//11.triangle is Equilateral, Isosceles or Scalene.
// public class practice1{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int c=sc.nextInt();
//         if(a==b && b==c){
//             System.out.println("Equilateral triangle");
//         } else if(a==b || b==c || a==c){
//             System.out.println("Isosceles triangle");
//         } else{
//             System.out.println("Scalene triangle");
//         }
//     }
// }


//12.check whether a triangle can be formed by the given value for the angles.
// public class practice1{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt(); 
//         int c=sc.nextInt();
//         if(a+b+c==180){
//             System.out.println("Triangle can be formed");
//         } else{
//             System.out.println("Triangle cannot be formed");
//         }
//     }
// }


//13.check whether a character is an alphabet, digit or special character.
// public class practice1{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         char ch=sc.next().charAt(0);
//         if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
//             System.out.println("Alphabet");
//         } else if(ch>='0' && ch<='9'){
//             System.out.println("Digit");
//         } else{
//             System.out.println("Special Character");
//         }
//     }
// }


//14.check whether an alphabet is a vowel or consonant.
// public class practice1{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         char ch=sc.next().charAt(0);
//         if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
//             System.out.println("Vowel");
//         } else{
//             System.out.println("Consonant");
//         }
//     }
// }


//15.calculate profit and loss on a transaction.
// public class practice1{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         float costPrice=sc.nextFloat();
//         float sellingPrice=sc.nextFloat();  
//         if(sellingPrice>costPrice){
//             float profit=sellingPrice-costPrice;
//             System.out.println("Profit: " + profit);
//         } else if(costPrice>sellingPrice){
//             float loss=costPrice-sellingPrice;
//             System.out.println("Loss: " + loss);
//         } else{
//             System.out.println("No Profit No Loss");
//         }
//     }
// }


//16.accept a grade and declare the equivalent description
// public class practice1{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         char grade=sc.next().charAt(0);
//         if(grade=='A'){
//             System.out.println("Average");
//         } else if(grade=='E'){
//             System.out.println("Excellent");
//         } else if(grade=='G'){
//             System.out.println("Good");
//         } else if(grade=='V'){
//             System.out.println("Very Good");
//         } else if(grade=='F'){
//             System.out.println("Fail");
//         }
//     }
// }


//17.Read any Month Number in integer and display Month name in the word
// public class practice1{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int month=sc.nextInt();
//         if(month==1){
//             System.out.println("January");
//         } else if(month==2){
//             System.out.println("February");
//         } else if(month==3){
//             System.out.println("March");
//         } else if(month==4){
//             System.out.println("April");
//         } else if(month==5){
//             System.out.println("May");
//         } else if(month==6){
//             System.out.println("June");
//         } else if(month==7){
//             System.out.println("July");
//         } else if(month==8){
//             System.out.println("August");
//         } else if(month==9){
//             System.out.println("September");
//         } else if(month==10){
//             System.out.println("October");
//         } else if(month==11){
//             System.out.println("November");
//         } else if(month==12){
//             System.out.println("December");
//         }
//     }
// }


//18.Read any Month Number in integer and display the number of days for this month.
// public class practice1{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int month=sc.nextInt();
//         if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
//             System.out.println("31 days");
//         } else if(month==4 || month==6 || month==9 || month==11){
//             System.out.println("30 days");
//         } else if(month==2){
//             System.out.println("28 or 29 days");
//         }
//     }
// }


//19.Menu-Driven Program to compute the area of the various geometrical shape.
// public class practice{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("1. Area of Circle");
//         System.out.println("2. Area of Square");
//         System.out.println("3. Area of Rectangle");
//         System.out.println("4. Area of Triangle");
//         int choice=sc.nextInt();
//         if (choice==1){
//             System.out.println("Enter radius:");
//             float r=sc.nextFloat();
//             float area=3.14f*r*r;
//             System.out.println("Area of Circle: " + area);
//         } else if(choice==2){
//             System.out.println("Enter side:");
//             float s=sc.nextFloat();
//             float area=s*s;
//             System.out.println("Area of Square: " + area);
//         } else if(choice==3){
//             System.out.println("Enter length and breadth:");
//             float l=sc.nextFloat();
//             float b=sc.nextFloat();
//             float area=l*b;
//             System.out.println("Area of Rectangle: " + area);
//         } else if(choice==4){
//             System.out.println("Enter base and height:");
//             float base=sc.nextFloat();
//             float height=sc.nextFloat();
//             float area=0.5f*base*height;
//             System.out.println("Area of Triangle: " + area);
//         } else{
//             System.out.println("Invalid choice");
//         }
//     }
// }


//20.Menu-Driven Program to perform a simple calculation.
// public class practice1{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("1. Addition");
//         System.out.println("2. Subtraction");
//         System.out.println("3. Multiplication");
//         System.out.println("4. Division");
//         int choice=sc.nextInt();
//         System.out.println("Enter two numbers:");
//         float a=sc.nextFloat();
//         float b=sc.nextFloat();
//         if(choice==1){
//             System.out.println("Result: " + (a+b));
//         } else if(choice==2){
//             System.out.println("Result: " + (a-b));
//         } else if(choice==3){
//             System.out.println("Result: " + (a*b));
//         } else if(choice==4){
//             if(b!=0){
//                 System.out.println("Result: " + (a/b));
//             } else{
//                 System.out.println("Cannot divide by zero");
//             }
//         } else{
//             System.out.println("Invalid choice");
//         }
//     }
// }


//21.read any day number in integer and display day name in the word.
// public class practice1{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int day=sc.nextInt();
//         if(day==1){
//             System.out.println("Sunday");
//         } else if(day==2){
//             System.out.println("Monday");
//         } else if(day==3){
//             System.out.println("Tuesday");
//         } else if(day==4){
//             System.out.println("Wednesday");
//         } else if(day==5){
//             System.out.println("Thursday");
//         } else if(day==6){
//             System.out.println("Friday");
//         } else if(day==7){
//             System.out.println("Saturday");
//         }
//     }
// }
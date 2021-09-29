import javax.swing.plaf.synth.SynthStyleFactory;
import java.nio.file.LinkPermission;
import java.util.ArrayList;
import java.util.Scanner;

public class Practice {
    /*For this problem, the prefilled code will contain a function. Write a program to return the value passed to the function.
    static void inputOf(int b){
        System.out.println(b);
    }

    For this problem, the prefilled code will contain a function. Write a program to concatenate the message "Welcome " followed by the given name.
    static void MessageOf(String a){
        System.out.println("Welcome "+a );
    }

    For this problem, the prefilled code will contain a function. Write a program that the given function will multiply the number N with three.
   static  void MultipleOf(int a){
       System.out.println(a*3);
   }

   For this problem, the prefilled code will contain a function. Write a program that the given function will
   check if the number N is divisible by 7.
       static void DivisibleOf(int a){
        if (a%7==0)
            System.out.println("True");
        else
            System.out.println("False");
    }

    For this problem, the prefilled code will contain a function. Write a program that the given
     function will return the second character in the word passed to the function.
    static void SecondLetter(String a,int c){
        String b = String.valueOf(a.charAt(c));
        System.out.println(b);
    }

    For this problem, the prefilled code will contain a function. Write a function with two arguments that prints
    the message as expected
    static void StudentMessage(String a, int b){
        System.out.println(a + " is " + b + "years old." );
    }

    For this problem, the prefilled code will contain a function. Write a program to count the number of
    uppercase and lowercase letters in the given word.
    static void EnglishLetter(String a){
        ArrayList<String> ListA = new ArrayList<>();
        for(int i=0; i<a.length(); i++){
            ListA.add(String.valueOf(a.charAt(i)));
        }
        int UpperLetters = 0;
        int LowerLetters = 0;
        for(int j=0; j<ListA.size(); j++){
            String b = ListA.get(j).toUpperCase();
            if(ListA.get(j) == b){
                UpperLetters = UpperLetters + 1;
            }
            else{
                LowerLetters = LowerLetters + 1;
            }
        }
        System.out.println("Upper letters: "+UpperLetters);
        System.out.println("Lower letters: "+LowerLetters);
    }

    Write a function with the name calculate_league_points that takes the number of wins, draws, and losses and calculates
    the number of points a football team has obtained so far.
    - Each win is equal to 4 points
    - Each draw is equal to 2 points
    - Each loss is equal to -1 point
    static void league_points(int win,int draw,int loss){
        int a = win * 4;
        int b = draw * 2;
        int c = loss * -1;
        System.out.println(a+b+c);
    }

    Write a function with the name get_speed_status that takes the speed (S) as an argument.
 - If the speed is less than 60, it should return "Normal".
 - If the speed is greater than or equal to 60 and less than 80, it should return "Warning".
 - If the speed is greater than or equal to 80, it should return "Over Speed".
    static void SpeedStatus(int a){
        if (a>=80){
            System.out.println("Over Speed!");
        }
        else if(a<80 && a>60){
            System.out.println("Warning.");
        }
        else{
            System.out.println("Normal Speed!");
        }
    }

    Write a function with the name get_discount that takes the bill amount as an argument.
 - If the bill amount is less than 500, the discount should be "5%".
 - If the bill amount is greater than or equal to 500 and less than 2500, the discount should be "10%".
 - If the bill amount is greater than or equal to 2500, the discount should be "20%".
    static void GetDiscount(int a){
        if (a<500){
            System.out.println("you got 5% of discount!");
        }
        else if(a>=500 && a<2500){
            System.out.println("you got 10% of discount!");
        }
        else{
            System.out.println("you got 20% of discount!");
        }
    }

    Write a function with the name fizz_buzz that takes a number as an argument.
 - If the number is divisible by 3, it should return “Fizz”.
 - If it is divisible by 5, it should return “Buzz”.
 - If it is divisible by both 3 and 5, it should return “FizzBuzz”.
 - Otherwise, it should return the same number.
    static void fizz_buzz(int a){
        if (a%3==0){
            System.out.println("Fizz!");
        }
        else if(a%5==0){
            System.out.println("Buzz!");
        }
        else{
            System.out.println(a);
        }
    }

     Write a function with name sum_of_squares_m_to_n that takes two integers (M and N) and sum the squares from M to N.
    static void SumOfSquares(int a, int b){
        double sum = 0;
        for(int i=a; i<=b; i++){
            sum = sum +Math.pow(i,2);
        }
        System.out.println(sum);
    }


Write a function with the name show_numbers that takes a number (N) and print all the numbers from 0 to N with a label to
identify the even and odd numbers as shown below
    static void ShowNumbers(int a){
        for(int i=0; i<=a; i++){
            if(i%2==0){
                System.out.println(i + ": Even Number");
            }
            else{
                System.out.println(i + ": Odd Number");
            }
        }
    }

     Write a function with the name count_the_vowels that takes a word as an argument and count the number of vowels
     in the given word. The letters (a, e, i, o, u) are considered as vowels
    static void CountVowels(String a){
        a = a.toLowerCase();
        int c = 0;
        for(int i=0; i<a.length(); i++){
            String b = String.valueOf(a.charAt(i));
            if (("a".equals(b))|| ("e".equals(b))||("i".equals(b))||("o".equals(b))||("u".equals(b))){
                c = c + 1;
            }
        }
        System.out.println(c);
    }

    A typical car can hold four passengers and one driver, allowing five people to travel around. Write a function with
    the name number_of_cars_needed that takes a number of people (N) and return how many cars are needed to seat everyone
    comfortably.
    static void NumberOfCars(int a){
        if (a<=5)
            System.out.println(1);
        else{
            float F = a;
            float car =  F/5;
            System.out.println(Math.round(car+0.4));
        }
    }

    Write a function with the name validate_atm_pin_code that takes a word as an argument.
    ATM PIN is considered valid only if the given word contains
    - Exactly 4 or 6 characters
    - All the characters should be digits */
    static void ATMPin(String a){
        int count = 0;
        if ((a.length()==4)||(a.length()==6)) {
            for (int i = 0; i < a.length(); i++) {
                char c = a.charAt(i);
                if((Character.isDigit(c))){
                    count = count + 1;
                }
            }
        }
        if(count == a.length()){
            System.out.println("Valid Pin code!");
        }
        else{
            System.out.println("Invalid Pin code!");
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
       /* String b = input.nextLine();
        MessageOf(b);

        int a = input.nextInt();
        inputOf(a);

        int b = input.nextInt();
        MultipleOf(b);

        int b = input.nextInt();
        DivisibleOf(b);

        String name = input.nextLine();
        int place = input.nextInt();
        SecondLetter(name,place);

        String name = input.nextLine();
        int age = input.nextInt();
        StudentMessage(name,age);

        String name = input.nextLine();
        EnglishLetter(name);

        int win = input.nextInt();
        int draw = input.nextInt();
        int loss = input.nextInt();
        league_points(win,draw,loss);

        int a = input.nextInt();
        SpeedStatus(a);

        int a = input.nextInt();
        GetDiscount(a);

        int a = input.nextInt();
        fizz_buzz(a);


        int a = input.nextInt();
        int b = input.nextInt();
        SumOfSquares(a,b);

        int a = input.nextInt();
        ShowNumbers(a);

        String a = input.nextLine();
        CountVowels(a);

        int a = input.nextInt();
        NumberOfCars(a);
        */
        String a = input.nextLine();
        ATMPin(a);

        /*888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888*/

        /*The first line of input will contain space-separated words, denoting the elements of the list.
        String a = input.nextLine();
        ArrayList<String> ListA = new ArrayList<>();
        String [] b = a.split(" ");
        int c = b.length;
        int d = 1;
        for(int i=0; i<c; i++){
            ListA.add(b[c-d]);
            d = d+1;
        }
        System.out.println(ListA);

        Given a list of numbers, write a program to print the sum of the numbers in the list.
        String a = input.nextLine();
        String [] b = a.split(" ");
        int sumOf = 0;
        for(int i=0; i<b.length; i++){
            int c = Integer.parseInt(b[i]);
            sumOf =  sumOf + c;
        }
        System.out.println(sumOf);

        Given a sentence, write a program to reverse the letters in words of the sentence.
        input: The cat is on the mat.
        String a = input.nextLine();
        ArrayList<String> ListA = new ArrayList<>();
        ArrayList<String> ListB = new ArrayList<>();
        for(int i=0; i<a.length(); i++){
            ListA.add(String.valueOf(a.charAt(i)));
        }
        for(int j=1; j<=a.length(); j++){
            ListB.add(ListA.get((a.length())-j));
        }

        ListA.removeAll(ListA);
        String StringA = "";
        for(var k: ListB){
            if (k==" "){
                StringA = StringA + " ";
            }
            else{
                StringA = StringA+k;
            }
        }
        System.out.println(StringA);


        */
    }
}



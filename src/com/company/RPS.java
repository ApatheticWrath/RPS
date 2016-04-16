package com.company;
import java.util.*;
import java.lang.*;
import java.util.regex.*;

public class RPS{



    public static void main(String[] args){

        int p1 = 0;
        Scanner input = new Scanner(System.in);
        String inputs = "";

        Random r = new Random();
        int pc = r.nextInt(3);
        String pattern = "(rock|Rock|paper|Paper|scissor|Scissor)";
        Pattern p = Pattern.compile("(rock|Rock|paper|Paper|scissor|Scissor)");
        System.out.println(inputs);
        Matcher m = p.matcher(inputs);

        boolean matches = m.matches();
        do{
            System.out.println("Enter rock, paper, or scissor.");
            inputs = input.nextLine();


            System.out.println(""+p.toString());
            System.out.println(""+m.toString());
            System.out.println(""+matches);
            System.out.println("test line");










        }while(!matches);
        p1 = stringConverter(inputs);
        String winner=winnerSelect(p1,pc);

        System.out.println(""+winner);




        //0 = rock
        //1 = paper
        //2 = scissor
    }

    public static int stringConverter(String inputs){
        if (inputs.equalsIgnoreCase("rock")){
            return 0;
        }
        else if (inputs.equalsIgnoreCase("paper")){
            return 1;
        }
        else {
            return 2;
        }

    }
    public static String winnerSelect(int p1, int pc){


        if(p1==0 && pc==2){
            return  "You are the winner. \nThe cpu picked scissor.";
        }
        else if(p1==0 && pc==1){
            return  "The Cpu is the winner. \nIt picked paper.";
        }
        else if(p1==1 && pc==0){
            return  "You are the winner. \nThe cpu picked rock.";
        }
        else if(p1==1 && pc==2){
            return  "The Cpu is the winner. \nIt picked s0cissor.";
        }
        else if(p1==2 && pc==1){
            return  "You are the winner. \nThe cpu picked paper";
        }
        else if(p1==2 && pc==0){
            return  "The Cpu is the winner. \nIt picked rock.";
        }
        else{
            return  "Tie";
        }


    }
}


package com.company;
import java.util.*;
import java.lang.*;
import java.util.regex.*;

public class RPS{



    public static void main(String[] args){
        Random r = new Random();
        int p1 = 0;
        int pc = r.nextInt(3); 
        Scanner input = new Scanner(System.in);
        String inputs = "test";
        boolean matches;
        
              
       
        do{
            System.out.println("Enter rock, paper, or scissor.");
            inputs = input.nextLine();
            matches = inputValidation(inputs);

        }while(!matches);
        
        p1 = stringConverter(inputs);
        String winner=winnerSelect(p1,pc);
        System.out.println(winner);




        //0 = rock
        //1 = paper
        //2 = scissor
    }

    public static int stringConverter(String userinput){
        if (userinput.equalsIgnoreCase("rock")){
            return 0;
        }
        else if (userinput.equalsIgnoreCase("paper")){
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
        
        
    public static Boolean inputValidation(String userinput){
        Pattern p = Pattern.compile("(rock|Rock|paper|Paper|scissor|Scissor)");
        Matcher m = p.matcher(userinput);
        boolean matches = m.matches();
         
        
        return matches;
        }



    }



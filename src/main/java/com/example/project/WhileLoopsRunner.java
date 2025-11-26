package com.example.project;


public class WhileLoopsRunner{

    public static void main(String[] args) {
        
        // System.out.println( WhileLoops.countEvensUpTo(1));
        // System.out.println( WhileLoops.countEvensUpTo(2));   // {2}
        // System.out.println( WhileLoops.countEvensUpTo(6));   // {2,4,6}
        // System.out.println( WhileLoops.countEvensUpTo(10));  // {2,4,6,8,10}
    
        // System.out.println( WhileLoops.countEvensUpTo(0));
        // System.out.println( WhileLoops.countEvensUpTo(-5));
        // System.out.println( WhileLoops.countEvensUpTo(15));  // 2..14 (7 evens)


    
        // System.out.println( WhileLoops.digitSum(0));
        // System.out.println( WhileLoops.digitSum(7));
        // System.out.println( WhileLoops.digitSum(123));
        // System.out.println( WhileLoops.digitSum(4098));

    
        // System.out.println( WhileLoops.digitSum(199));   
        // System.out.println( WhileLoops.digitSum(1000));  
        // System.out.println( WhileLoops.digitSum(99999)); 

    
        // System.out.println( WhileLoops.countDownBy(20, 3));  
        // System.out.println( WhileLoops.countDownBy(10, 4));  
        // System.out.println( WhileLoops.countDownBy(5, 5));  
        // System.out.println( WhileLoops.countDownBy(4, 6));   // can't subtract once

    
        System.out.println( WhileLoops.countDownBy(7, 10));  // no subtraction
        System.out.println( WhileLoops.countDownBy(0, 5));   

        // Define behavior when step <= 0: just return start
        System.out.println( WhileLoops.countDownBy(7, 0));
        System.out.println( WhileLoops.countDownBy(7, -3));

    
        System.out.println( WhileLoops.weeksToReachGoal(0, 50, 200));
        System.out.println( WhileLoops.weeksToReachGoal(100, 20, 110));
        System.out.println( WhileLoops.weeksToReachGoal(500, 100, 400)); // already enough
        System.out.println( WhileLoops.weeksToReachGoal(10, 10, 40));   

    
        System.out.println( WhileLoops.weeksToReachGoal(0, 10, 0));   // goal already met
        System.out.println( WhileLoops.weeksToReachGoal(10, 10, 10)); // already at goal

    
        System.out.println( WhileLoops.minutesUntilDead(100, 10)); 
        System.out.println( WhileLoops.minutesUntilDead(15, 10));   
        System.out.println( WhileLoops.minutesUntilDead(5, 10));   

    
        System.out.println( WhileLoops.minutesUntilDead(0, 10));   // already dead
        System.out.println( WhileLoops.minutesUntilDead(-5, 10));  // invalid start
        System.out.println( WhileLoops.minutesUntilDead(50, 0));   // invalid usage rate
        System.out.println( WhileLoops.minutesUntilDead(50, -5));  // invalid usage rate

        System.out.println( WhileLoops.minutesUntilDead(100, 33));
    }
}
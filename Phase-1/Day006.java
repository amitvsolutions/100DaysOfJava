public class Day006{
	
   public static void main(String args[]){
      // Illustrating break statement (execution stops when value of i becomes to 4.)
      System.out.println("Break Statement\n");
      for(int i=1;i<=9;i++){
         if(i==4) break;
         System.out.println(i);
      }
      // Illustrating continue statement (execution skipped when value of i becomes to 1.)
      System.out.println("Continue Statement\n");
      for(int i=1;i<=9;i++){
         if(i==4) continue;
         System.out.println(i);
      }
   }	
}

/*
The considerable difference between break and continue is that the break exits a loop at once.
Once a break statement is executed, the loop will not run again. However, after executing
the continue statement, the following lines of code will be skipped for the current iteration only
*/
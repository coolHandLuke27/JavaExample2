public class Driver
{
   public static void main(String[] args)
   {
      Task [] tasks =
      {
         new Task ("Take out trash", "Somewhat important"),
         new Task ("Sweep the floor", "Not too important"),
         new Task ("Do the dishes" , "Highly important")
      };
      
      System.out.println("Here is the numeric priority of the tasks:");
      System.out.println(" ");
      
      tasks[0].setPriority(4);
      tasks[1].setPriority(2);
      tasks[2].setPriority(8);
      
      for (int z = 0; z < 3; z++)
      {
         tasks[z].toString();
      }
  
   }
}
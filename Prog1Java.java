/**
 @author yues
 */
public class Prog1Java
{
   /**
    @param args the command line arguments
    */
   public static void main(String[] args)
   {
      try
      {
         FixedPointList fpl = new FixedPointList();
         fpl.run();
      }
      catch (Exception e)
      {
         System.out.println("Program Error!" + e);
      }
   }
   
}



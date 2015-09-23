import java.util.Scanner;
class madglibs {
   public static void main(String args[]){
      Scanner input = new Scanner (System.in);
      String color;
      String noun1;
      String noun2;
      String Adj;
      System.out.print("Type in a color.");
      color = input.nextLine();
      System.out.print("Type in a noun (Plural).");
      noun1 = input.nextLine();
      System.out.print("Type in a noun.");
      noun2 = input.nextLine();
      System.out.print("Type in a adjective.");
      Adj = input.nextLine();
      
      System.out.println("Roses are " + color+",");
      System.out.println(noun1  + " are blue,");
      System.out.println(noun2  + " is " + Adj+",");
      System.out.println("and so are you.");


  }
   }
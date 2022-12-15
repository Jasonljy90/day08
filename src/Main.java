import java.util.ArrayList;
import java.util.Scanner;

public class Main {

     public static void main(String[] args) {
          
          Game game = new Game();
          Scanner sc = new Scanner(System.in);
          System.out.println("Game start");
          try {
               game.startGame();
          } catch (Exception e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
          }
          
          ArrayList<String> info;
          
          String input = "west_of_house";

          while (true) {
          switch (input){
                       
               case "west_of_house":
                    info = Game.getGameInfo("west_of_house");
                    System.out.println(info.get(0));
                    System.out.println(info.get(1));
                    System.out.println(info.get(2));
                    System.out.println(info.get(3));
                    System.out.println("Please enter a direction");
                    input = sc.nextLine();
                    //info = Game.getGameInfo(input);
                    break;

               case "north_of_house":
                    info = Game.getGameInfo("north_of_house");
                    System.out.println(info.get(0));
                    System.out.println(info.get(1));
                    System.out.println(info.get(2));
                    System.out.println(info.get(3));
                    System.out.println("Please enter a direction");
                    input = sc.nextLine();
                    //info = Game.getGameInfo(input);
                    break;
               
               case "behind_house":
                    info = Game.getGameInfo("behind_house");
                    System.out.println(info.get(0));
                    System.out.println(info.get(1));
                    System.out.println(info.get(2));
                    System.out.println(info.get(3));
                    System.out.println("Please enter a direction");
                    input = sc.nextLine();
                    //info = Game.getGameInfo(input);
                    break;
               
               case "forest_path":
                    info = Game.getGameInfo("forest_path");
                    System.out.println(info.get(0));
                    System.out.println(info.get(1));
                    System.out.println(info.get(2));
                    System.out.println(info.get(3));
                    System.out.println("Please enter a direction");
                    input = sc.nextLine();
                    //info = Game.getGameInfo(input);
                    break;
               }
          }
     }
}
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Game {

    private String room;
    private String name;
    private String description;
    private String direction1; 
    private String direction2;
    private static Map<String, ArrayList<String>> gameInfo = new HashMap<>();

    public Game() {
        // this.room = room;
        // this.name = name;
        // this.description = description;
        // this.direction1 = direction1;
        // this.direction2 = direction2;
    }

    public String getRoom() {
        return room;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getDirection1() {
        return direction1;
    }

    public String getDirection2() {
        return direction2;
    }
    
    public static ArrayList<String> getGameInfo(String k) {
        return gameInfo.get(k);
    }

    public void startGame() throws Exception{
       
        FileReader fr = new FileReader("zork.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;

        while ((line = br.readLine()) != null) {
            String[] lineSplit = line.split(" ");
            // room
            if(line.length() != 0) {
                String room = lineSplit[1];
                //info.add(line);
            
                if (gameInfo.containsKey(room)){
                    ArrayList<String> info = new ArrayList<>();
                    // name
                    line = br.readLine();
                    info.add(line);
                    
                    //description
                    line = br.readLine();
                    info.add(line.replace("<break>", "\n"));
                    
                    // direction 1
                    line = br.readLine();
                    info.add(line);

                    // direction 2
                    line = br.readLine();
                    info.add(line);    
                }else{ // If room does not exists in map
                    ArrayList<String> info = new ArrayList<>();
                    line = br.readLine();
                    info.add(line);
                    
                    //description
                    line = br.readLine();
                    info.add(line.replace("<break>", "\n"));
                    
                    // direction 1
                    line = br.readLine();
                    info.add(line);

                    // direction 2
                    line = br.readLine();
                    info.add(line);    
                    gameInfo.put(room, info);
                }
            }    
        }
    }

}




















/*
 *line = br.readLine();
            lineSplit = line.split(" ");
            this.name = lineSplit[1];
            line = br.readLine();
            line = line.replace("description: ", "");
            line = line.replace("<break>", "\n");
            this.description = line;
            line = br.readLine();
            this.direction1 = line.replace("direction: ", "");
            line = br.readLine();
            this.direction2 = line.replace("direction: ", ""); 
 */
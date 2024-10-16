import java.util.ArrayList;
public class Forest {
    private ArrayList<MountainHare> hares;
    private static String season;

    public Forest() {
        hares = new ArrayList<>();
    }

    public void addHare(MountainHare hare) {
        hares.add(hare);
    }

    public static void setSeason(String newSeason) {
        season = newSeason;
        if (season.equals("зима")) {
            MountainHare.setColor("белый");
        } else {
            MountainHare.setColor("серо-рыжий");
        }
    }

    public void printHares() {
        for (MountainHare hare : hares) {
            System.out.println(hare);
        }
    }
}


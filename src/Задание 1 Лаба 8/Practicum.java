import java.util.ArrayList;
    public class Practicum {
        public static void main(String[] args) {
            Forest forest = new Forest();
            forest.addHare(new MountainHare(4, 4.4, 120));
            forest.addHare(new MountainHare(7, 3.6, 150));
            forest.addHare(new MountainHare(1, 2.3, 100));

            System.out.println("В лесу лето!");
            Forest.setSeason("лето"); // создаем летний лес с зайцами

            System.out.println("Список зайцев:");
            forest.printHares(); // напечатайте список всех зайцев

            System.out.println("В лесу зима!");
            Forest.setSeason("зима"); // поменяйте время года на зиму

            System.out.println("Список зайцев:");
            forest.printHares(); // напечатайте список всех зайцев
        }
    }
import java.util.ArrayList;
import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Шиншилла");
        animals.add("Крокодил");
        animals.add("Лев");
        animals.add("Медведь");
        animals.add("Слон");

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nМеню:");
            System.out.println("1. Показать список всех животных");
            System.out.println("2. Добавить животное");
            System.out.println("3. Удалить животное");
            System.out.println("4. Очистить список");
            System.out.println("5. Проверить наличие животного");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Считываем оставшийся символ новой строки

            switch (choice) {
                case 1:
                    showAnimals(animals);
                    break;
                case 2:
                    System.out.print("Введите имя животного для добавления: ");
                    String newAnimal = scanner.nextLine();
                    animals.add(newAnimal);
                    System.out.println(newAnimal + " добавлено в список.");
                    break;
                case 3:
                    if (!animals.isEmpty()) {
                        System.out.print("Введите имя животного для удаления: ");
                        String animalToRemove = scanner.nextLine();
                        if (animals.remove(animalToRemove)) {
                            System.out.println(animalToRemove + " удалено из списка.");
                        } else {
                            System.out.println("Животное не найдено в списке.");
                        }
                    } else {
                        System.out.println("Список животных пуст.");
                    }
                    break;
                case 4:
                    if (!animals.isEmpty()) {
                        animals.clear();
                        System.out.println("Список животных очищен.");
                    } else {
                        System.out.println("Список уже пуст.");
                    }
                    break;
                case 5:
                    System.out.print("Введите имя животного для проверки: ");
                    String animalToCheck = scanner.nextLine();
                    if (animals.contains(animalToCheck)) {
                        System.out.println(animalToCheck + " есть в зоопарке.");
                    } else {
                        System.out.println(animalToCheck + " нет в зоопарке.");
                    }
                    break;
                case 0:
                    System.out.println("Выход из программы.");
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        } while (choice != 0);

        scanner.close();
    }

    private static void showAnimals(ArrayList<String> animals) {
        System.out.println("Сегодня в зоопарке можно увидеть кормления " + animals.size() + " животных.");
        System.out.println("Это будут:");
        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}

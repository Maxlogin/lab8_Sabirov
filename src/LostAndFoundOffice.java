import java.util.ArrayList;

class LostAndFoundOffice {
    // Список для учёта потерянных вещей
    private ArrayList<Object> things = new ArrayList<>();

    // Метод для добавления вещи в список
    public void put(Object element) {
        if (element != null) {
            things.add(element);
        }
    }

    // Метод для проверки наличия вещи в списке
    public boolean check(Object target) {
        if (target == null) {
            return false; // Если передана пустая ссылка, возвращаем false
        }
        for (Object object : things) {
            if (object.equals(target)) {
                return true; // Если вещь найдена, возвращаем true
            }
        }
        return false; // Если вещь не найдена, возвращаем false
    }
}
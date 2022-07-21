import java.util.*;

public class ExampleHashSet {
    public static void main(String[]args)
    {
        HashSet<String> h = new HashSet<String>();

        // Добавляем элементы в HashSet с помощью метода add()
        h.add("Торт");
        h.add("Пирожное");
        h.add("Кекс");
        h.add("Чизкейк");
        h.add("Печенье");
        h.add("Торт");// пытаемся добавить еще один такой же элемент

        // Выводим элементы HashSet в консоль
        System.out.println(h);
        System.out.println("Имеется ли в списке пирожное:" +
                h.contains("Пирожное"));

        // Удаляем элементы из множества с помощью метода remove()
        h.remove("Чизкейк");
        System.out.println("Список сладостей без чизкейка:"+h);

        // Проходимся по элементам HashSet с помощью итератора:
        System.out.println("Сладости:");
        Iterator<String> i = h.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
}

package home_made_04;

/* Создайте класс Pair, который будет представлять пару значений любого типа. 
Этот класс должен иметь два обобщенных параметра: T и U, которые будут 
представлять типы значений первого и второго элементов пары соответственно.

Класс Pair должен иметь следующие методы:

getFirst(): метод для получения первого элемента пары.
getSecond(): метод для получения второго элемента пары.
setFirst(T first): метод для установки значения первого элемента пары.
setSecond(U second): метод для установки значения второго элемента пары. */

/* Пример использования:

Pair<Integer, String> pair = new Pair<>(10, "Hello");
System.out.println("First element: " + pair.getFirst());
System.out.println("Second element: " + pair.getSecond());

pair.setFirst(20);
pair.setSecond("World");
System.out.println("Updated first element: " + pair.getFirst());
System.out.println("Updated second element: " + pair.getSecond());

Ожидаемый вывод:

First element: 10
Second element: Hello
Updated first element: 20
Updated second element: World

В этом примере класс Pair используется для хранения пары значений: 
целого числа и строки. 
Методы getFirst() и getSecond() используются для получения 
значений первого и второго элементов пары соответственно, 
а методы setFirst() и setSecond() - для изменения значений этих элементов.
*/

/* 
Задание 2 по желанию

Создайте обобщенный класс DataContainer, который будет представлять 
контейнер для хранения данных любого типа. Этот класс должен иметь 
обобщенный параметр T, представляющий тип данных, которые будут храниться в контейнере.

Класс DataContainer должен иметь следующие методы:

add(T item): метод для добавления элемента в контейнер.
get(int index): метод для получения элемента по индексу из контейнера.
remove(int index): метод для удаления элемента по индексу из контейнера.
getSize(): метод для получения размера контейнера.
Реализуйте класс DataContainer таким образом, чтобы он мог хранить 
элементы внутри себя в виде массива. Предусмотрите динамическое 
расширение массива при добавлении новых элементов.

Пример использования:

// Создание контейнера для строк
DataContainer<String> stringContainer = new DataContainer<>();

// Добавление элементов в контейнер
stringContainer.add("Apple");
stringContainer.add("Banana");
stringContainer.add("Orange");

// Получение и удаление элемента по индексу
String fruit = stringContainer.get(1);
System.out.println("Fruit at index 1: " + fruit);
stringContainer.remove(1);

// Вывод размера контейнера
System.out.println("Size of container: " + stringContainer.getSize());
Ожидаемый вывод:

Fruit at index 1: Banana
Size of container: 2 
*/

/* Дополнительные указания:
При реализации метода add, учитывайте необходимость расширения массива, 
если его текущий размер недостаточен для добавления нового элемента.
При реализации метода remove, удалите элемент из массива и сдвиньте 
оставшиеся элементы влево для замещения удаленного элемента.
Убедитесь, что ваш класс обрабатывает ситуации, когда элементы 
не найдены или индекс выходит за пределы размера контейнера. */

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        Pair<Integer, String> pair = new Pair<>(10, "Hello");
        System.out.println("First element: " + pair.getFirst());
        System.out.println("Second element: " + pair.getSecond());
        
        pair.setFirst(20);
        pair.setSecond("World");
        System.out.println("Updated first element: " + pair.getFirst());
        System.out.println("Updated second element: " + pair.getSecond());

        // Создание контейнера для строк
        System.out.println("Задача 2");
        DataContainer<String> stringContainer = new DataContainer<>();

        // Добавление элементов в контейнер
        stringContainer.add("Apple");
        stringContainer.add("Banana");
        stringContainer.add("Orange");

        // Получение и удаление элемента по индексу
        String fruit = stringContainer.get(1);
        System.out.println("Fruit at index 1: " + fruit);
        stringContainer.remove(1);

        // Вывод размера контейнера
        System.out.println("Size of container: " + stringContainer.getSize());
    }
}

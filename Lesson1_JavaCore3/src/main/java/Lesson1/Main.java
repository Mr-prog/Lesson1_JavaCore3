package Lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String array[] = {"2", "9", "6", "7", "45", "66", "1"};

        ChangePlace<String> ioe = new ChangePlace<String>(array);
        ioe.changePlace(5, 6);
//        Lesson1.ArrayList<String> arrayList = new Lesson1.ArrayList<String>(array);
        taskTwo();
        taskThree();





        }

        public static void taskTwo() {
            Integer[] firstArray = {1, 2, 7, 4, 5, 4, 7, 8, 9, 0, 9, 456};
            Double[] secondArray = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0};
            String[] thirdArray = {"ono", "two", "NoNe", "four", "five"};
            arrayToArrayList(firstArray);
            arrayToArrayList(secondArray);
            arrayToArrayList(thirdArray);
            System.out.println(Arrays.toString(firstArray));
            System.out.println(Arrays.toString(secondArray));
            System.out.println(Arrays.toString(thirdArray));



    }
    public static void taskThree() {
        Box<Apple> boxWithApple = new Box<Apple>(new Apple(), new Apple(), new Apple());
        Box<Orange> boxWithOranges = new Box<Orange>(new Orange(), new Orange());
        Box<Orange> anotherBoxWithOranges = new Box<Orange>();
        System.out.println("A box of apples weighs " + boxWithApple.getWeight());
        System.out.println("A box of oranges weight " + boxWithOranges.getWeight());
        System.out.println(boxWithApple.compare(boxWithOranges));
        boxWithOranges.replaceFruitsToAnotherBox(anotherBoxWithOranges);
        System.out.println(boxWithOranges.getBox());
        System.out.println(anotherBoxWithOranges.getBox());
    }



    private static <T> ArrayList arrayToArrayList(T[] array) {
        return new ArrayList<Object>(Arrays.asList(array));
    }


}



package Lesson1;

public class Main {
    public static void main(String[] args) {
        String array[] = {"2", "9", "6", "7", "45", "66", "1"};

        ChangePlace<String> ioe = new ChangePlace<String>(array);
        ioe.changePlace(5, 6);




    }
}

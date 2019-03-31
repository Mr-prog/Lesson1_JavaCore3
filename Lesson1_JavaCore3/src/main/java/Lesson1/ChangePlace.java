package Lesson1;

import java.util.Arrays;

public class ChangePlace< Z extends String> {

    private Z [] obj3;
    protected Object sym1;
    protected Object sym2;


    public ChangePlace(Z obj3[]) {
        this.obj3 = obj3;
    }

    public void changePlace(int a, int b){
        Object [] array = obj3;
        sym1 = obj3[b - 1];
        sym2 = obj3[a - 1];
        array[a - 1] = sym1;
        array[b - 1] = sym2;
        System.out.println(Arrays.toString(array));
    }
}

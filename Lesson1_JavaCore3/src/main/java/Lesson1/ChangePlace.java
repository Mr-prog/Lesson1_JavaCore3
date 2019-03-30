package Lesson1;

public class ChangePlace< Z extends String> {

    private Z [] obj3;
    protected String sym1;
    protected String sym2;


    public ChangePlace(Z obj3[]) {
        this.obj3 = obj3;
    }

    public void changePlace(int a, int b){
        Object [] array = obj3;
        array[a] = obj3[b];
        array[b] = obj3[a];
        System.out.println(array);
    }
}

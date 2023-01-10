package dataStructures;



public class Generics {

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3};
        String[] str1 = {"Hello", "World"};

        printAll(array);
        printAll(str1);
    }

    public static <E> void printAll(E[] data){
        for(E t: data){
            System.out.println(t);
        }
    }
    /*
//    Method OverLodding
    private static void printArray(int[] a) {
    }

    private static void printArray(String[] a) {
    }*/

}

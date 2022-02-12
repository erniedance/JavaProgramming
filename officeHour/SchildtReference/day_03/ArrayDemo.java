package SchildtReference.day_03;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] arraysOfInegers = new int[]{5,6,7};
        int[] array ={2,4,6,8,10};
        int [] [] multidimesionalArray={
                {1,2},
                {3,4},
                {5,6},
        };
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[4]);
        //System.out.println(array[5]);//will compile 'exception' it doesn't exist
        System.out.println("size of first array in multidementional array " +multidimesionalArray[0].length);

    }
}

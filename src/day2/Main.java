package day2;

public class Main {
    public static void main(String[] args) {
//        int[] array={2,1,4,6,3,1};
//        InsertionSort insertionSort=new InsertionSort();
//        insertionSort.insertionSort(array);
//
//        for(int i=0;i<array.length;i++){
//            System.out.print(" "+array[i]);
//        }


//        int[] array = {2, 1, 4, 6, 3, 1};
//        BubbleSort bubbleSort = new BubbleSort();
//        bubbleSort.bubbleSort(array);
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(" " + array[i]);
//        }

        int[] array = {2, 1, 4, 6, 3, 1};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(array,0,array.length-1);

        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }
}

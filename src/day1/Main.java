package day1;

public class Main {
    public static void main(String[] args) {

       // BubbleSort
//        int[] array={3,2,5,8,1,2,0,5};
//
//        for(int i=0;i<array.length;i++){
//            System.out.print(" "+array[i]);
//        }
//
//        BubbleSort bubbleSort=new BubbleSort();
//        bubbleSort.bubbleSort(array);
//        System.out.println(" ");
//
//        for(int i=0;i<array.length;i++){
//            System.out.print(" "+array[i]);
//        }


        //SelectionSort
//        int[] array={3,2,5,8,1,2,0,5};
//        SelectionSort selectionSort=new SelectionSort();
//        selectionSort.selectionSort(array);
//
//        for(int i=0;i<array.length;i++){
//            System.out.print(" "+array[i]);
//        }

        //QuickSort
        int[] array={3,2,5,8,1,2,0,5};
        Quicksort1 quicksort1=new Quicksort1();
        quicksort1.quickSort(array,0,array.length-1);

        for(int i=0;i<array.length;i++){
            System.out.print(" "+array[i]);
        }



    }
}

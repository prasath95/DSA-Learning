package day2;

public class QuickSort {
    public void quickSort(int[] array, int start, int end) {

        if(end<=start){
            return;
        }
        int partition = findPartition(array, start, end);
        quickSort(array, start, partition - 1);
        quickSort(array, partition + 1, end);
    }

    private int findPartition(int[] array, int start, int end) {
        int pivot = array[end];
        int j = start - 1;

        for (int i = start; i < end; i++) {
            if (pivot > array[i]) {
                j++;
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
        j++;
        int temp=array[j];
        array[j]=array[end];
        array[end]=temp;
        return j;
    }
}

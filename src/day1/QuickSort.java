package day1;

public class QuickSort {
    public void quickSort(int[] array,int start,int end){

        if(start>=end){
            return;
        }
        int partition=findPartition(array,start,end);
        quickSort(array,start,partition-1);
        quickSort(array,partition+1,end);

    }

    private int findPartition(int[] array, int start, int end) {
        int pivot=array[end];
        int j=start-1;

        for(int i=0;i<end;i++){
            if(pivot>array[i]){
                j++;
                int temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        }
        j++;
        int temp=array[j];
        array[j]=array[end];
        array[end]=temp;
        return j;

    }

}

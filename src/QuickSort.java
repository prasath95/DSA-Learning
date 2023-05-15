public class QuickSort {
    int[] arr={2,4,1,5,3,8,0,9};


    public void quickSort(int[] array,int start,int end){
        /*
        * 1. pick a pivot - last
        * 2. run a loop from 0 to until pivot
        * 3. while looping, finds minimum value than pivot
        * 4. then another looping from 0 to pivot
        * 5. swap it
        * 6. find the partition
        * 7. then do this via divider and concor
        *
        * */

        //to make sure array contains more than 2 values
        if(end<=start){
            return;
        }

        int partition=findPartition(array,start,end);
        quickSort(array,start,partition-1);
        quickSort(array,partition+1,end);

    }

    private int findPartition(int[] array, int start, int end) {
        int pivot=array[array.length-1];
        int j=start-1;

        for(int i=start;i<end;i++){
            if(pivot>array[i]){
                j++;
                int temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        }
        //for final swap, crete a place and move pivot to that place
        j++;
        int temp=array[j];
        array[j]=array[end];
        array[end]=temp;
        return j;
    }
}




















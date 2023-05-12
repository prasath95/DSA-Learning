package day1;

/*
* arrange in a order
*  0 1 2
*
* */
public class DutchNationalFlagAlgorithm {

    public int[] arrangeArray(int[] array){
        int low=0;
        int mid=0;
        int high=array.length-1;

        for(int i=0;i<array.length-1;i++){
            switch (array[mid]){
                case 0:
                    swap(array,low,mid);
                    low++;
                    mid++;
                break;

                case 1:
                    mid++;
                break;

                case 2:
                    swap(array,mid,high);
                    high--;
                break;
            }
        }
        return array;
    }

    private void swap(int[] array,int first, int second) {
        int temp=array[first];
        array[first]=array[second];
        array[second]=temp;
    }
}

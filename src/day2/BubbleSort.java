package day2;

public class BubbleSort {
    public void bubbleSort(int[] array){
        //iteration for array element count
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-1;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
}

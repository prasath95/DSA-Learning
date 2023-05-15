package day1;

public class SelectionSort {

    public void selectionSort(int[] array){

        for(int i=0;i<array.length;i++){

            int index=i;
            for(int j=i+1;j<array.length;j++){
                if(array[index]>array[j]){
                    index=j;
                }
            }

            int temp=array[index];
            array[index]=array[i];
            array[i]=temp;

        }
    }
}

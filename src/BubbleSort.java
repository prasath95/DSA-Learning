public class BubbleSort {
    public void bubbleSort(int[] array){

        for(int i=0;i<array.length;i++){

            for(int j=1;j<array.length;j++){

                if(array[j-1]>array[j]){
                    int temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                }
            }
        }

    }
}

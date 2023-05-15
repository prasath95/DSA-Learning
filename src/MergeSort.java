public class MergeSort {

    public void mergeSort(int[] array){
        int length=array.length;

        if(length<=1){
            return; // base case
        }

        int l=length/2;
        int r=length-l;
        int j=0;

        int[] leftArray=new int[l];
        int[] rightArray=new int[r];

        for(int i=0;i<length;i++){
            if(i<l){
                leftArray[i]=array[i];
            }else{
                rightArray[j]=array[i];
                j++;
            }
        }

        mergeSort(rightArray);
        mergeSort(leftArray);
        merge(leftArray,rightArray,array);

    }

    private void merge(int[] leftArray, int[] rightArray, int[] array) {
        int l=0,r=0,i=0;

        int lefSize=array.length/2;
        int rightSize=array.length-lefSize;

        //check the condition for merging
        while (l<lefSize && r<rightSize){
            if(leftArray[l]>rightArray[r]){
                array[i]=rightArray[r];
                i++;
                r++;
            }else{
                array[i]=leftArray[l];
                i++;
                l++;
            }
        }

        while (l<lefSize){
            array[i]=leftArray[l];
            i++;
            l++;
        }

        while (r<rightSize){
            array[i]=rightArray[r];
            i++;
            r++;
        }

    }
}

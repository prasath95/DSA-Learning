package day1;

public class SlidingWindow {

    public int findContiguousMax(int[] array,int k){

        int max=0;

        for(int i=0;i<array.length-k+1;i++){
            int current=0;
            for(int j=0;j<k;j++){
                current+=array[i+j];
            }

            if(current>max){
                max=current;
            }

        }

        return max;
    }
}

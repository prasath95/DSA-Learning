package day1;

/*
* max sum of contiguous sub array
* */
public class KadaneAlgorithm {
    int[] array={-1,4,3,-3,5,-8,-1,3};

    public int maxSum(int[] array){
        int total=0;
        int value=0;
        for(int i=0;i<array.length;i++){
            total+=array[i];

            if(total<0){
                value=0;
            }

            if(value<total){
                value=total;
            }
        }
        return value;
    }
}

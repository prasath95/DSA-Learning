public class StaticWindowSliding {

    public int maxContiguousNumber(int[] array,int k){

       int maxSum=0;

       for(int i=0;i<array.length-k+1;i++){
           int currentSum=0;

           for(int j=0;j<k;j++){
               currentSum+=array[i+j];
           }

           if(currentSum>maxSum)
               maxSum=currentSum;
       }

      return maxSum;
    }

    public int minContiguousNumber(int[] array,int k){

        int maxSum=Integer.MAX_VALUE;

        for(int i=0;i<array.length-k+1;i++){
            int currentSum=0;

            for(int j=0;j<k;j++){
                currentSum+=array[i+j];
            }

            if(currentSum<maxSum)
                maxSum=currentSum;
        }

        return maxSum;
    }
}

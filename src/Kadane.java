public class Kadane {
    public int findContiguousSum(int[] array){
        int tempSum=0;
        int finalSum=0;
        for(int i=0;i<array.length;i++) {
            tempSum+=array[i];

            if(tempSum<0){
                finalSum=0;
            }

            if (tempSum>finalSum) {
                finalSum=tempSum;
            }
        }
        return finalSum;
    }
}

public class TwoPointer {

    public int[] twoSum(int[] array,int sum){
        int low=0;
        int high=array.length-1;

        while (array[low]+array[high]!=sum ){//&& low<array.length-1 && high>=0){

            if(low>=array.length&&high<=0){
                if(array[low]+array[high]>sum){
                    high--;
                }else{
                    low++;
                }
            }else {
                return new int[]{};
            }

        }


        return new int[]{low+1,high+1};
    }
}

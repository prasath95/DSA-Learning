public class FindMaxMin {
    public int findMaxValue(int[] array){
        int max=array[0];
        for(int no:array){
            if(max<=no){
                max=no;
            }
        }
       // System.out.println("maximum is "+max);
        return max;
    }

    public int findMinValue(int[] array){
        int min=array[0];
        for(int no:array){
            if(min>=no){
                min=no;
            }
        }
      //  System.out.println("minimum is "+min);
        return min;
    }
}

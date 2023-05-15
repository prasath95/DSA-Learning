package code_monk;

public class MonkAndRotation {
    public void rotation(int[] array,int rotatedBy){
        for(int i=0;i<array.length/2;i++){
            int temp=array[i];
            array[i]=array[i+rotatedBy];
            array[i+rotatedBy]=temp;
        }
    }
}

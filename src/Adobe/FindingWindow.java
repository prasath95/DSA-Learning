package Adobe;

public class FindingWindow {
    /*
    * 1. get the String S
    * 2. change as a char
    * 3. likewise do it for String T
    * 4. run a for loop and find the match(current) and store it into the max match
    * */

    public char[] findingWindow(String s, String t){
        char[] mainChar=s.toCharArray();
        char[] subChar=t.toCharArray();

        int main=mainChar.length;
        int sub=subChar.length;

        char[] myChar=new char[mainChar.length];

        int myPointer=0;
        int maxSum=0;


        for(int i=0;i<main-sub+1;i++){
            int currentSum=0;
            for(int j=0;j<sub;j++){
                if(mainChar[i]==subChar[j]){
                    myChar[myPointer]=mainChar[i];
                    myPointer+=1;
                    currentSum+=1;
                }else{
                    myChar[myPointer]=mainChar[i];
                    myPointer+=1;
                }
            }
            myPointer=0;
            if(maxSum<currentSum){
                maxSum=currentSum;
            }


        }

        System.out.println(" max "+myPointer);
        return myChar;
    }

}

package Adobe;

public class Main {
    public static void main(String[] args) {
        FindingWindow findingWindow=new FindingWindow();
        char[] findWindow=findingWindow.findingWindow("abcdebdde","bde");

        for(int i=0;i<findWindow.length;i++){
            System.out.print(" "+findWindow[i]);
        }

    }
}

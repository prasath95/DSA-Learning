package arrays_and_strings.one_d;

public class TramRide {
    public int findMinimumStation(){
        int start=3;
        int finish=1;
        int n=4;
        int[] ticket_cost=new int[n];
        String costa="1234";

        String[] costString=costa.split("");

        for(int i=0;i<n;i++){
            ticket_cost[i]=Integer.parseInt(costString[i]);
        }

//        int cost1=0;
//        for (int i = start-1; i < finish-1 ; i++) {
//            cost1+=ticket_cost[i];
//        }
//        System.out.println("cost 1 - "+cost1);
//
//        int cost2=0;
//
//        for (int i = start-1; i !=finish-1 ; i--) {
//            if(i==0){
//                cost2+=ticket_cost[ticket_cost.length-1];
//                i=ticket_cost.length;
//            }else{
//                cost2+=ticket_cost[i-1];
//            }
//        }
//
//        System.out.println("cost 2 - "+cost2);

        //////

        // 1 2 2 4
        // 0 1 2 3
        int cos1=0;
        for (int i = start-2; i > finish-2 ; i--) {
            cos1+=ticket_cost[i];
        }
        System.out.println("cos  1 - "+cos1);

        // 1 2 2 4
        // 0 1 2 3
        int cos2=0;
        for (int i = start-1; i!=finish ; i++) { //2;true ///
                if(i==ticket_cost.length-1){
                    cos2+=ticket_cost[ticket_cost.length-1];
                    i=0;
                }else{
                    cos2+=ticket_cost[i];
                }
        }

        System.out.println("cos  2 - "+cos2);


        return 0;

    }
}

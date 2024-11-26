public class TowerOfHanoi {
    public static void main(String[] args) {
        int noOfDiscs = 10;
        doTowers(noOfDiscs,'A','B','C');
    }
    public static void doTowers(int topN,char from,char to,char using){
        if(topN==1){
            System.out.println("Move disc 1 "+" from "+from+" to "+to);
        }else{
            doTowers(topN-1, from, using,to);
            System.out.println("Move disc " + topN + " from " + from + " to " + to);
            doTowers(topN - 1, using, to , from);

        }
    }
}

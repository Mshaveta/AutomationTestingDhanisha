package ControlStatements.LoopingStatements.NestedLoop;
/*
	1	2	3
1	*
2	*	*
3	*	*	*
4	*	*
5	*


 */
public class TYpe5_1 {
    public static void main(String[] args) {

        int n=5;
        int half=(n+1)/2;//3
        System.out.println(half);
        int st=0;
        for(int row=1;row<=n;row++){
            //1<=3, 2<=3,3<=3, 4<=3, 5<=3
            if(row<=half){
                st = row;//st=1,2,3
            }else{
                st--;//3->2->1
            }

            for(int star=1;star<= st ;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

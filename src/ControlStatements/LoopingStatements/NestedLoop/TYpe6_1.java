package ControlStatements.LoopingStatements.NestedLoop;
/*
	1	2	3	4	5
1			*
2		*		*
3	*		*		*
4		*		*
5			*
 */
public class TYpe6_1 {
    public static void main(String[] args) {
        int n=4;
        if(n%2==0){ //n is even
            n=n-1;
        }
        int half = (n+1)/2;
        int sp=0,st=0;
        for(int row=1;row<=n;row++){
            if(row<=half){ //Row - 1,2,3
                //upperhalf
                sp = half-row; //3-1=2, 3-2=1, 3-3=0
                st = row;//1,2,3
            }else{ //4,5
                //lowerhalf
                sp++;//0->1-->2
                st--;//3-->2-->1
            }
            for(int space=1;space<= sp  ;space++){
                System.out.print("-");
            }
            for(int star=1;star<= st ;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

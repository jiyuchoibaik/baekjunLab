import java.util.Scanner;

public class num15552{
        public static void main(String[] args){
        Scanner stdln=new Scanner(System.in);
        int caseTest=stdln.nextInt();
        int a[]=new int[caseTest];
        int b[]=new int[caseTest];
        int c[]=new int[caseTest];
        for(int i=0;i<caseTest;i++){
            a[i]=stdln.nextInt();
            b[i]=stdln.nextInt();
            c[i]=a[i]+b[i];    
        }
        for(int i=0;i<caseTest;i++){
            System.out.println(c[i]);
        }
        stdln.close();
    }
}

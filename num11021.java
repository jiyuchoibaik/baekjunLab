import java.util.Scanner;

public class num11021 {
    public static void main(String[] args){
        Scanner stdln=new Scanner(System.in);
        int times=stdln.nextInt();
        int results[]=new int[times];
        
        for(int i=0;i<times;i++){
            int a=stdln.nextInt();
            int b=stdln.nextInt();
            results[i]=a+b;
        }
        for(int i=0;i<times;i++){
            System.out.println("Case #"+(i+1)+": "+results[i]);
        }
    }
    
}

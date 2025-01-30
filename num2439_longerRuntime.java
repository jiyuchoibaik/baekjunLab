import java.util.Scanner;

public class num2439_longerRuntime {
    public static void main(String[] args){
        Scanner stdln=new Scanner(System.in);
        int n=stdln.nextInt();
        String s="";
        for(int i=0;i<n;i++){
            for(int j=n;j>i+1;j--){
                s+=" ";
            }
            for(int j=0;j<i+1;j++){
                s+="*";
            }
            s+="\n";
        }
        System.out.print(s);
        stdln.close();
    }
    
}

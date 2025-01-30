import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class num2438 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();

        int n=Integer.parseInt(br.readLine());

        for(int j=0;j<n;j++){
        for(int i=0;i<j+1;i++){
            sb.append("*");
        }
        sb.append("\n");
    }
    System.out.print(sb.toString());

    }
}

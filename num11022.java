//11021번의 non_duality님의 코드 참고

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num11022 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=null;

        int t=Integer.parseInt(br.readLine());

        int a,b;

        for(int i=0;i<t;i++){
            st=new StringTokenizer(br.readLine());

            a=Integer.parseInt(st.nextToken());
            b=Integer.parseInt(st.nextToken());

            sb.append("Case #").append(i+1).append(": ").append(a).append(" + ").append(b).append(" = ").append(a+b).append("\n");
        }

        System.out.println(sb.toString());

    }
    
}

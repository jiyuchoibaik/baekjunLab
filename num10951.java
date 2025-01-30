import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class num10951 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        String line;
        StringTokenizer st;

        while((line=br.readLine())!=null){
            st=new StringTokenizer(line);
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());

            if((a<0) || (b>10)) break;

            bw.write((a+b)+"\n");
        }
        br.close();
        bw.flush();
        bw.close();



    }
    
}

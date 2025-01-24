import java.io.*;

public class num15552_shorterRuntime{
    public static void main(String args[]) throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(System.out));

        int caseTest=Integer.parseInt(reader.readLine());
        int c[]=new int[caseTest];
        
        for(int i=0;i<caseTest;i++){
            String[] input=reader.readLine().split(" ");
            int a=Integer.parseInt(input[0]);
            int b=Integer.parseInt(input[1]);
            c[i]=a+b;
        }
        for(int i=0;i<caseTest;i++){
            writer.write(c[i]+"\n");
        }

        reader.close();
        writer.flush();
        writer.close();

    }
}
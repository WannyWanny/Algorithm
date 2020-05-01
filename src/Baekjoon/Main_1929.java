
import java.io.*;
import java.util.StringTokenizer;

public class Main_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        for(int i=m; i<=n; i++)
        {
            int div = 2;
            double root = Math.sqrt(i);
            boolean isPrime = true;

            if(i==1)
                isPrime = false;
            while(div <=root)
            {
                if(i % div == 0) {
                    isPrime = false;
                    break;
                }
                div++;
            }
            if(isPrime)
            {
                bw.write(String.valueOf(i));
                bw.newLine();
            }
        }
        bw.flush();
    }
}

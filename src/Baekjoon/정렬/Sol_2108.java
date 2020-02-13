package 정렬;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;
public class Sol_2108 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] chk = new int[8001];
        int sum =0;
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
            chk[arr[i]+4000]++;
        }
        int max = 0;
        ArrayList<Integer>list = new ArrayList<>();
        for(int i=0; i<8001; i++){
            if(chk[max] < chk[i]){
                max = i;
                list.clear();
            }
            else if(chk[i] != 0 && chk[i] == chk[max])
                list.add((i-4000));
        }
        Arrays.sort(arr);
        int n1 = (int)Math.round((double)sum / n);
        int n2 = arr[n/2];
        int n3;
        if(list.size() != 0)
            n3 = list.get(0);
        else
            n3 = max - 4000;
        int n4 = arr[n-1] - arr[0];

        br.close();
        bw.flush();
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
    }
}

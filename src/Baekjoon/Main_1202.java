package Baekjoon;

import java.util.*;

public class Main_1202 {
    /*
    * jewelies배열은 보석의 무게와 가격을 담고 무게를 오름차순으로 정렬합니다.
    * Bags는 ArrayList로 가방의 무게를 오름차순으로 정렬하는데 그냥 배열 썻어도 됐을거 같네요
    * inventory는 가방에 담을 수 있는 보석을 담은 뒤 최대 무게를 끄집어 낸다.
    * sum(long썻음에 유의)에는 최대 가격만 담긴다.
    * */
    static class Jewely implements Comparable<Jewely>{
        int m;          //무게
        int v;          //가격

        public Jewely(int m, int v) {
            this.m = m;
            this.v = v;
        }

        @Override
        public int compareTo(Jewely o) {
            return this.m - o.m;
        }
    }
    static Jewely[] jewelies;
    static ArrayList<Integer> bags;
    static PriorityQueue<Integer> inventory;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        jewelies = new Jewely[N];
        bags = new ArrayList<>();
        inventory = new PriorityQueue<>();

        for(int i=0; i<N; i++){
            int m = sc.nextInt();
            int v = sc.nextInt();
            jewelies[i] = new Jewely(m, v);
        }

        for(int k=0; k<K; k++){
            int c = sc.nextInt();
            bags.add(c);
        }

        Collections.sort(bags);
        Arrays.sort(jewelies);

        long sum = 0;
        int idx = 0;
        for(int m : bags){
            while(idx < N){
                if(m >= jewelies[idx].m){
//                    아래 수식을 사용하는데 굉장히 어려웠다.
                    inventory.add(-(jewelies[idx].v));
                    idx++;
                }else
                    break;
            }
            if(!inventory.isEmpty()){
                sum += Math.abs(inventory.poll());
            }
        }
        System.out.println(sum);
    }
}

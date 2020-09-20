package ETC;

import java.util.Arrays;

public class Practice {
    static int[] arr = {1, 2, 3};
    static boolean[] visited = new boolean[arr.length];
    public static void main(String[] args) {
//        System.out.println("Subset");
//        Subset(new boolean[arr.length], 0);

        System.out.println("Permutation");
        Permutation(new int[arr.length], 0);

//        System.out.println("RePermutation");
//        RePermutation(new int[arr.length], 0);

        System.out.println("Combination");
        Combination(new int[arr.length-1], 0, 0);

//        System.out.println("Recombination");
//        ReCombination(new int[arr.length-1], 0, 0);
    }

    private static void Combination(int[] ans, int idx, int r) {
        if(r == ans.length) {
            System.out.println(Arrays.toString(ans));
            return;
        }
        if(idx == arr.length) return;
        ans[r] = arr[idx];
        Combination(ans, idx+1, r+1);
        Combination(ans, idx+1, r);
    }

    private static void Permutation(int[] ans, int idx){
        if(idx == ans.length){
            System.out.println(Arrays.toString(ans));
            return;
        }
        for(int i=0; i<ans.length; i++){
            if(!visited[i]){
                visited[i] = true;
                ans[idx] = arr[i];
                Permutation(ans, idx+1);
                visited[i] = false;
            }
        }
    }

    private static void Subset(boolean[] ans, int idx){
        if(idx == ans.length){
            for(int i=0; i<ans.length; i++){
                if(ans[i]) System.out.println(arr[i]+" ");
            }
            System.out.println();
            return;
        }
        ans[idx] = true;
        Subset(ans, idx+1);
        ans[idx] = false;
        Subset(ans, idx+1);
    }
}

package SWExpertAcademy.D3;

public class Solution_3131 {
    public static void main(String[] args) {
        boolean[] prime = new boolean[1000001];
        prime[0]=prime[1]=false;

        for(int i=2; i<prime.length; i++){
            prime[i] = true;
        }

        for(int i=2; i*i<prime.length; i++){
            for(int j=i*i; j<prime.length; j+=i){
                prime[j] = false;
            }
        }

        for(int i=0; i<prime.length; i++){
            if(prime[i])
                System.out.print(i+" ");
        }
    }
}

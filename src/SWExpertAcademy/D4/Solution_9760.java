package SWExpertAcademy.D4;

import java.util.*;

public class Solution_9760 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            boolean flag=false;
            String ans = "High card";
            int[] nums = new int[5];            //숫자를 담을 배열. 정렬 하기 위함
            char[] shapes = new char[5];         //모양을 담을 배열. 정렬 하기 위함
            for(int i=0; i<5; i++) {
                String str = sc.next();
                shapes[i] = str.charAt(0);
                char rank = str.charAt(1);
                if(rank == 'A') nums[i] = 1;
                else if(rank == 'J') nums[i]=11;
                else if(rank == 'K') nums[i]=12;
                else if(rank == 'Q') nums[i]=13;
                else nums[i] = rank-48;
            }
            Arrays.sort(nums);
            Arrays.sort(shapes);

            //Straight Flush: 동일한 슈트에 랭크가 연속적
            int cnt1=0;
            for(int i=0; i<4; i++){
                if(shapes[i] != shapes[i+1]) break;
                if(nums[i]+1 != nums[i+1]) break;
                cnt1++;
            }
            if(cnt1==4){
                ans = "Straight Flush";
                flag = true;
            }

            //Full House
            if(!flag){
                int cnt2=0;
                HashSet<Integer> hs = new HashSet<>();
                for(int i=0; i<4; i++){
                    if(nums[i] == nums[i+1]){
                        hs.add(nums[i]);
                    }
                    else{
                        cnt2++;
                    }
                }
                if(hs.size()==2 && cnt2==1){
                    ans="Full House";
                    flag = true;
                }
            }

            //Four of a Kind : 5장 중 4개의 랭크가 동일
            if(!flag) {
                int cnt2 = 0;
                HashSet<Integer> hs = new HashSet<>();
                for (int i = 0; i < 4; i++) {
                    if(nums[i] == nums[i+1]){
                        hs.add(nums[i]);
                        cnt2++;
                    }
                }
                if(cnt2==3 && hs.size()==1){
                    ans = "Four of a Kind";
                    flag = true;
                }
            }
            
            //Flush
            if(!flag){
                HashSet<Character> hs = new HashSet<>();
                int cnt4=0;
                for(int i=0; i<4; i++){
                    if(shapes[i] == shapes[i+1]){
                        hs.add(shapes[i]);
                        cnt4++;
                    }
                }
                if(cnt4==4 && hs.size()==1){
                    ans = "Flush";
                    flag = true;
                }
            }

            //Straight
            if(!flag){
                HashSet<Character> hs = new HashSet<>();
                int cnt5=0;
                for(int i=0; i<4; i++){
                    if(nums[i]+1 != nums[i+1]) break;
                    if(shapes[i] != shapes[i+1]) hs.add(shapes[i]);
                    cnt5++;
                }
                if(cnt5==4 && hs.size() != 4){
                    ans="Straight";
                    flag = true;
                }
            }

            //Three of a kind
            if(!flag){
                HashSet<Integer> hs = new HashSet<>();
                int cnt6=0;
                for(int i=0; i<4; i++){
                    if(nums[i]==nums[i+1]){
                        cnt6++;
                        hs.add(nums[i]);
                    }
                }
                if(cnt6==2 && hs.size()==1){
                    ans="Three of a kind";
                    flag=true;
                }
            }

            //Two pair
            if(!flag){
                int cnt7=0;
                HashSet<Integer> hs = new HashSet<>();
                for(int i=0; i<4; i++){
                    if(nums[i] == nums[i+1]){
                        hs.add(nums[i]);
                    }
                    else{
                        cnt7++;
                    }
                }
                if(hs.size() == 2 && cnt7==2){
                    ans="Two pair";
                    flag=true;
                }
            }

            //One pair
            if(!flag){
                HashSet<Integer> hs = new HashSet<>();
                int cnt8=0;
                for(int i=0; i<4; i++){
                    if(nums[i] == nums[i+1]) {
                        cnt8++;
                        hs.add(nums[i]);
                    }
                }
                if(cnt8==1 && hs.size()==1){
                    ans="One pair";
                }
            }

            System.out.println("#"+tc+" "+ans);
        }
    }
}

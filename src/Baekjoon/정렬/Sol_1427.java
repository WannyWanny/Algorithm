

import java.util.*;

public class Sol_1427 {
    public static void main(String[] args){
        ArrayList<Integer>list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        for(int i=0; i<str.length(); i++){
            list.add(str.charAt(i) - 48);
        }
        Collections.sort(list);
        for(int i = str.length()-1; i>-1; --i)
            System.out.println(list.get(i));
    }
}

package ETC;

public class Main {
    public static void main(String[] args) {
        String str = "1234";
        String str2 = "-1234";
        int num2=0;
        if(str2.charAt(0) == '-'){
            num2 = Integer.parseInt(str);
            num2 *= -1;
        }
        int num = Integer.parseInt(str);
        System.out.println(num);
        System.out.println(num2);
    }
}

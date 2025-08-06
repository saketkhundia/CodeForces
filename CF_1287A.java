import java.util.Scanner;

public class CF_1287A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            int maxminutes = 0 , count = 0;
            boolean angryseen = false;

            for(char c:s.toCharArray()){
                if(c=='A'){
                    angryseen = true;
                    count = 0;
                }else if(angryseen){
                    count++;
                    maxminutes = Math.max(maxminutes,count);
                }
            }
            System.out.println(maxminutes);
        }
        sc.close();
    }
    
}

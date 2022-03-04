import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        int Anumber =0;
        int anumber =0;
        int count=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串");
         String s = scanner.nextLine();
         for (int i = 0; i < s.length() ; i++){
             char c = s.charAt(i);
             if(c >='A' &&  c<= 'Z'  ){
                 Anumber++;
             }else if (c>='a' && c<='z'){
                 anumber++;
             }else{
                    count++;
             }

         }
        System.out.println(Anumber+" "+anumber+" "+count);
        System.out.println(Anumber+" "+anumber+" "+count);

    }
}

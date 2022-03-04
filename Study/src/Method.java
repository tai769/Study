public class Method {
    public static void main(String[] args) {
               // print(10,20);
                int i =22;
                change(i);
        System.out.println(i);
        int arr[] = {11,22,33};
        change(arr);
        System.out.println(arr[1]);

    }
    public static void change(int arr[]){

        arr[1]=  200;
    }

    public static void  change(int i){
        i= 55;
    }
    public static void print(int n,int m){
        for (int i = n ; i <= m ; i++){
            if (i % 2 == 1){
               // System.out.println(i);
            }
        }
    }
}

public class file3 {
    public static void main(String[] args) {
        decOrder(10);
    }
    static void decOrder(int num){
        if(num==0){
            return;
        }
        System.out.println(num);
        decOrder(num-1);
    }
}

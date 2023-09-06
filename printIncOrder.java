public class file3{
    public static void main(String[] args) {
        incOrder(10,1);
    }
    static void incOrder(int num,int i){
        if(i==num){
            System.out.println(i);
            return;
        }
        System.out.println(i);
        incOrder(num,i+1);
    }
}

public class file3 {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,2,2};
        int num=2;
        System.out.println(Arrays.toString(occur(arr,num)));
    }
    static int[] occur(int[] arr,int num){
        int n=arr.length;
        int[] arr2=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]==num){
                arr2[j]=i;
                j++;
            }
        }
        return arr2;
    }
}

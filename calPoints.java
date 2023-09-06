class Solution {
    public int calPoints(String[] operations) {
        int j=-1;
        int[] arr=new int[operations.length];
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                j++;
                arr[j]=arr[j-1]+arr[j-2];
            }
            else if(operations[i].equals("D")){
                j++;
                arr[j]=2*arr[j-1];
            }
            else if(operations[i].equals("C")){
                arr[j]=0;
                j--;
            }
            else{
                j++;
                arr[j]=Integer.valueOf(operations[i]);
            }
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
}

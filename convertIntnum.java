public class file3 {
    public static void main(String[] args) {
        int num=1123;
        convert(num);
    }
    static void convert(int num){
        String s=Integer.toString(num);
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            switch (s.charAt(i)){
                case('1'):
                    sb.append("one ");
                    break;
                case('2'):
                    sb.append("two ");
                    break;
                case('3'):
                    sb.append("three ");
            }
        }
        System.out.println(sb);
    }
}

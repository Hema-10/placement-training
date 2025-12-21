import java.util.Scanner;
class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count =0;
        for(int i=0;i<32;i++){
            count +=(n&1);
            n>>>=1;
        }
        return(count);        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String binary=sc.nextLine();
        int n =(int)Long.parseLong(binary,2);
        Solution obj=new Solution();
        int result=obj.hammingWeight(n);
        System.out.println(result);

    }
}

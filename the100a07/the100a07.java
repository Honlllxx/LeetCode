package the100a07;
public class the100a07 {
    public static int trap(int []height){
        int sum =0 ;
        int max_left=0;
        int max_right=0;
        int left=1;
        int right=height.length-2;
        for (int i = 0; i < height.length; i++) {
            if(height[left-1]<height[right+1]){
                max_left =Math.max(max_left, height[left-1]);
                int min =max_left;
                if (min>height[left]) {
                    sum=sum+(min-height[left]);
                }
                left++;
            }else{
                max_right =Math.max(max_right, height[right+1]);
                int min =max_right;
                if(min>height[right]){
                    sum=sum+(min-height[right]);
                }
                right--;
            }
            }
        return sum;
       }


   public static void main(String[] args) {
    System.out.println("========================================");

    int []arr={4,4,5,8,5,5,0};
    System.out.println(trap(arr));
    System.out.println("========================================");
   }

}
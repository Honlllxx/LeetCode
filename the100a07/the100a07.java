package the100a07;
public class the100a07 {
    public static int trap(int[] height) {
        // 如果数组长度小于 3，无法困住雨水，直接返回 0
        if (height.length < 3) {
            return 0;
        }
        int sum = 0;
        int max_left = 0;
        int max_right = 0;
        int left = 1;
        int right = height.length - 2;
        // 使用双指针法，当 left 小于 right 时继续循环
        while (left <= right) {
            if (height[left - 1] < height[right + 1]) {
                // 更新左侧最大高度
                max_left = Math.max(max_left, height[left - 1]);
                int min = max_left;
                if (min > height[left]) {
                    // 计算当前位置能困住的雨水量并累加到总和中
                    sum = sum + (min - height[left]);
                }
                left++;
            } else {
                // 更新右侧最大高度
                max_right = Math.max(max_right, height[right + 1]);
                int min = max_right;
                if (min > height[right]) {
                    // 计算当前位置能困住的雨水量并累加到总和中
                    sum = sum + (min - height[right]);
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
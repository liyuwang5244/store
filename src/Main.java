public class Main {
    public int maxRotateFunction(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return 0;
        }

        int initialF = 0;
        int totalF = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            initialF += i * nums[i];
            totalF += nums[i];
        }

        max = initialF;

        for (int i = 0; i < nums.length-1; i++){
            int change = nums[i] * nums.length - totalF;
            initialF += change;
            max = Math.max(max, initialF);
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(new Main().maxRotateFunction(new int[]{4, 3, 2, 6}));
    }
}
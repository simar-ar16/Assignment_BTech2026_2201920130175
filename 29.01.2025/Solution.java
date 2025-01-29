class Solution {
        private int[] nums;
       
        Solution(int[] nums) {
            this.nums = nums;
        }
     
        public void display() {     
            int max = nums[0];
            for (int i : nums) {
                if (i > max) {
                    max = i;
                }
            }
            System.out.println("Largest element in given array: " + max);
        }
     
        public static void main(String[] args) {
            int[] nums = {35,7,25,16,29,20};
            Solution obj = new Solution(nums);
            obj.display();
        }
     }
## Platform Used: GeeksforGeeks

### Problem:
Create a class that contains a single-dimensional array as a data member and a method display() to find and display the largest element of the array.

### Approach:
We have created a class Solution which has an array as data member. We use a constructor to initialize the value of the awway. This is a parametrized constructors i.e. we take values of data member when the object is made. This class contains a function `display()` that is used to display the largest number in the array. Then in the main function we create the object of the class and pass the array. Then we call `display()` function with the help of object and largest number in array is displayed. 

### Code:

```java
class Solution {
        private int[] nums;
       
        Solution(int[] nums) {
            this.nums = nums;
        }
     
        void display() {     
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
```

### Output:

```
Largest element in given array: 35
```

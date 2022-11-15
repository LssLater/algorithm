package com.yu.five.four;

import java.util.Arrays;

/**
 * @Author: yy
 * @Date: 2022/2/3 12:56
 * @Version: 1.0.0
 */
public class Solution {
    public static int search(int[] nums, int target) {
        int first = 0;
        int last = nums.length-1;

        while (first <= last){
            int mid = (last-first)/2+first;

            if (nums[mid] == target){
                return mid;
            }
            else if (nums[mid] > target){
                last = mid-1;

            }
            else {
                first = mid+1;
            }
        }
        return -1;
    }

    public static int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            ans[i] = (int) Math.pow(nums[i],nums[i]);
        }
        Arrays.sort(ans);
        return ans;
    }

    public static void moveZeroes(int[] nums) {
        if(nums.length==0){
            return;
        }
        int j=0;
        for(int i=0;i<nums.length;i++){
            //      -1,0,0,3,5
            //      -1 3 0 0 5
            //      -1 3 5 0 0
            //i不断向右移动，当 i 指向非零元素且j指向零时，将 j 指向元素与当前元素进行交换，
            // 若 i 指向0不进行任何操作,i+1,j不变。
            if(nums[i]!=0){
                if(nums[j]==0){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                j++;
            }
        }
    }

        public static String reverseWords(String s) {
            StringBuffer ret = new StringBuffer();
            int length = s.length();
            int i = 0;
            //  Let's take LeetCode contest
            while (i < length) {
                int start = i;
                while (i < length && s.charAt(i) != ' ') {
                    i++;
                }
                for (int p = start; p < i; p++) {
                    ret.append(s.charAt(start + i - 1 - p));
                }
                while (i < length && s.charAt(i) == ' ') {
                    i++;
                    ret.append(' ');
                }
            }
            return ret.toString();

    }

    public static String reverseWords3(String s) {
        String[] ss = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String value : ss) {
            StringBuilder ssb = new StringBuilder();
            ssb.append(value);
            sb.append(ssb.reverse().append(" "));
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
//        int[] nums = new int[]{-1,0,3,5};
//        System.out.println(nums);
////        int search = search(nums, 9);
////        System.out.println(search);
//        moveZeroes(nums);
//
//        System.out.println(Arrays.toString(nums));
        String s = "Let's take LeetCode contest";
        System.out.println(Arrays.toString(s.split(" ")));
        //System.out.println(reverseWords(s));
    }
}

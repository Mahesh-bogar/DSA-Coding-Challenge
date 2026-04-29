# Day 15 - Merge Sorted Array

## Approach
Use three pointers and merge from the end.

## Explanation
- Use pointer i for nums1  
- Use pointer j for nums2  
- Use pointer k for final position  
- Compare elements and place larger one at end  
- Continue until all elements are merged  

## Example
Input: [1,2,3,0,0,0], [2,5,6]  
Output: [1,2,2,3,5,6]  

## Time Complexity
O(m + n)

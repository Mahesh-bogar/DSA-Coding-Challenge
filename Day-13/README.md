# Day 13 - Plus One

## Approach
Traverse the array from the end and handle carry.

## Explanation
- Start from the last digit  
- If digit is less than 9 → add 1 and return  
- If digit is 9 → make it 0 and carry forward  
- If all digits are 9 → create a new array  

## Example
Input: [1,2,3]  
Output: [1,2,4]  

Input: [9,9,9]  
Output: [1,0,0,0]  

## Time Complexity
O(n)

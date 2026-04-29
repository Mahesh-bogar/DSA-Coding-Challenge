# Day 17 - Valid Palindrome

## Approach
Use two pointers and skip non-alphanumeric characters.

## Explanation
- Use left and right pointers  
- Ignore special characters  
- Convert characters to lowercase  
- Compare both sides  
- If mismatch → false  

## Example
Input: "A man, a plan, a canal: Panama"  
Output: true  

Input: "race a car"  
Output: false  

## Time Complexity
O(n)

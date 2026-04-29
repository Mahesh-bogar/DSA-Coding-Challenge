# Day 14 - Valid Anagram

## Approach
Sort both strings and compare them.

## Explanation
- Convert strings to character arrays  
- Sort both arrays  
- Compare them  
- If equal → anagram  
- Else → not anagram  

## Example
Input: "anagram", "nagaram"  
Output: true  

Input: "rat", "car"  
Output: false  

## Time Complexity
O(n log n)

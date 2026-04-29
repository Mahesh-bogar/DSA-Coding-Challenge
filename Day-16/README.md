# Day 16 - Longest Common Prefix

## Approach
Start with first string and reduce prefix.

## Explanation
- Take first string as prefix  
- Compare with other strings  
- Remove last character if not matching  
- Continue until prefix matches all  

## Example
Input: ["flower","flow","flight"]  
Output: "fl"  

Input: ["dog","racecar","car"]  
Output: ""  

## Time Complexity
O(n * m)

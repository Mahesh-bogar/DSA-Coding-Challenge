# Day 3 - Reverse Integer

## 🧠 Problem
Given a signed 32-bit integer, reverse its digits.  
If the reversed integer overflows, return 0.

## 🔗 Platform
LeetCode #7 – Reverse Integer

## 🚀 Approach
1. Extract last digit using modulo (`%`)  
2. Build reversed number step by step  
3. Check for overflow before updating result  

## 📊 Example
Input:  
123 → Output: 321  
-123 → Output: -321  
120 → Output: 21  

## 💡 Key Learning
- Handling integer overflow conditions  
- Working with digits using modulo & division  
- Writing safe and optimized code  

## ⏱ Time Complexity
O(log n)

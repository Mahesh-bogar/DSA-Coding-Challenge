# Day 7 - Happy Number (LeetCode #202)

## 🧠 Problem
Determine if a number is a happy number.

A happy number eventually becomes 1 after repeatedly replacing the number with the sum of squares of its digits.

## 🚀 Approach
1. Extract digits using modulo (%)  
2. Find sum of squares of digits  
3. Repeat process  
4. If number becomes 1 → Happy Number  
5. If loop repeats → Not Happy  

## 📊 Example

Input: 19

1² + 9² = 82  
8² + 2² = 68  
6² + 8² = 100  
1² + 0² + 0² = 1  

Output: true

## 💡 Key Learning
- Digit manipulation  
- Cycle detection using HashSet  
- Repeated transformations

## ⏱ Time Complexity
O(log n)

# Day 4 - Two Sum (Hashing Pattern)

## 🧠 Problem
Given an array of integers and a target, return the indices of two numbers such that they add up to the target.

## 🚀 Approach
1. First tried brute force using nested loops (O(n²))  
2. Optimized using HashMap for faster lookup (O(n))  
3. For each element, calculate:
   need = target - current element  
4. Check if the required value already exists in the map  

## 📊 Example
Input:  
nums = [2, 7, 11, 15], target = 9  

Output:  
[0, 1]  

Explanation:  
2 + 7 = 9  

## 💡 Key Learning
- HashMap helps reduce time complexity significantly  
- Avoid checking all pairs by storing values  
- Important concept:  
  need = target - current element  

## ⏱ Time Complexity
O(n)

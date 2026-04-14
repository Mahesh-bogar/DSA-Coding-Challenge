# Day 2 - Second Largest Element in Array

## 🧠 Problem
Find the second largest element in an unsorted array.

## 🚀 Approach
Instead of sorting the array, used a single traversal approach:

1. Maintain two variables → `first` (largest), `second` (second largest)  
2. Traverse the array once  
3. Update values based on comparison  
4. Ensure second largest is not equal to the largest  

## 📊 Example
Input:  
[10, 5, 20, 8]  

Output:  
10  

## 💡 Key Learning
- Optimized solution from **O(n log n) → O(n)**  
- Avoid unnecessary sorting for better performance  
- Learned how to handle edge cases in arrays  

## ⏱ Time Complexity
O(n)

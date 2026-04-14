# Day 5 - Merge Sort (Divide & Conquer)

## 🧠 Problem
Sort an array using the Merge Sort algorithm.

## 🚀 Approach
1. Divide the array into two halves recursively  
2. Continue dividing until each subarray has only one element  
3. Merge the subarrays in sorted order  
4. While merging, compare elements from both halves and place them in correct order  

## 📊 Example
Input:  
[32, 18, 17, 15]  

Step 1:  
[32,18]   [17,15]  

Step 2:  
[32] [18]   [17] [15]  

Step 3 (Merge):  
[18,32]   [15,17]  

Final Output:  
[15,17,18,32]  

## 💡 Key Learning
- Merge Sort uses **Divide and Conquer** technique  
- Breaking problems into smaller parts makes solving easier  
- Efficient sorting compared to simple methods  

## ⏱ Time Complexity
O(n log n)

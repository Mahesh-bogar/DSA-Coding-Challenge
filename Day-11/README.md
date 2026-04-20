# Day 11 - Contains Duplicate (Hashing Pattern)

## 🧠 Problem
Given an integer array nums, return true if any value appears at least twice in the array.  
Return false if all elements are distinct.

---

## 🚀 Approach
- Use a HashSet to store elements  
- Traverse the array  
- If element already exists → duplicate found  
- Otherwise, add element to the set  

---

## 📊 Example

Input:  
[1, 2, 3, 1]  

Process:  
Add 1 → {1}  
Add 2 → {1,2}  
Add 3 → {1,2,3}  
Check 1 → already exists → duplicate found  

Output:  
true  

---

Input:  
[1, 2, 3, 4]  

Output:  
false  

---

## 💡 Key Learning
- HashSet provides O(1) lookup  
- Efficient duplicate detection  
- Avoid nested loops  

---

## ⏱ Time Complexity
O(n)

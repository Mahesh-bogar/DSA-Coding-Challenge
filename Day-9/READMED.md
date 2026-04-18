# Day 9 - Reverse String (Two Pointer Pattern)

## 🧠 Problem
Reverse a string given as a character array in-place using O(1) extra space.

## 🚀 Approach
We use two pointers:

- left → start of array  
- right → end of array  

### Steps:
1. Swap elements at left and right  
2. Move left forward  
3. Move right backward  
4. Repeat until both meet  

---

## 📊 Example

Input:  
['h','e','l','l','o']

Step 1:  
swap h & o → ['o','e','l','l','h']

Step 2:  
swap e & l → ['o','l','l','e','h']

Output:  
['o','l','l','e','h']

---

## 💡 Key Learning
- Two Pointer Technique  
- In-place array manipulation  
- Efficient memory usage  


## ⏱ Time Complexity
O(n)


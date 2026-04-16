# Day 6 - Remove Duplicates from Sorted Array (Two Pointer Pattern)

## 🧠 Problem
Given a sorted array, remove duplicates in-place such that each unique element appears only once.

Return the number of unique elements (k).  
The first k elements of the array should contain the unique values.

---

## 🚀 Approach (Two Pointer Technique)

We use two pointers:

- i → keeps track of unique elements  
- j → scans the array  

### Steps:
1. Start with i = 0  
2. Traverse array using j  
3. If nums[i] != nums[j]:
   - Move i forward  
   - Copy nums[j] to nums[i]  
4. Continue until end  

---

## 📊 Example 1

Input:  
[1,1,2]

Step-by-step:
- i=0, j=1 → duplicate → skip  
- j=2 → new element → move i → [1,2,_]

Output:  
k = 2  
Array = [1,2,_]

---

## 📊 Example 2

Input:  
[0,0,1,1,1,2,2,3,3,4]

Output:  
k = 5  
Array = [0,1,2,3,4,_...]

---

## 💡 Key Learning
- Two Pointer Pattern helps solve problems efficiently  
- No extra space needed (in-place solution)  
- Works well for sorted arrays  

---

## ⏱ Time Complexity
O(n)

---

## 💻 Code (Java)

```java
class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        
        for(int j = 1; j < nums.length; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        
        return i + 1;
    }
}

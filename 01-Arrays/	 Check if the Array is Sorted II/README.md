# Check If Array Is Sorted - Java

This project explains how to check whether a given array is **sorted in non-decreasing order**.

## Concept

For a sorted array, **the previous element of every element is smaller than or equal to the current element**.  

From this, we can conclude:  

- If the previous element is smaller than or equal to the current element, the two elements are in order.  
- If this condition holds for the **entire array**, the array is sorted.  

## Approach

1. Traverse the array starting from the second element.  
2. For each element, compare it with its previous element:  
   - If the previous element is **less than or equal** to the current element, move to the next index.  
   - If not, the array is **not sorted**.  
3. If the entire array is traversed successfully, or the array size is 0 or 1 (i.e., `N = 0` or `N = 1`), then the array is **sorted**.  

## Dry Run Example

Array: `[1, 2, 3, 4, 5]`  

| Index | Previous Element | Current Element | Condition (prev <= curr) | Result  |
|-------|-----------------|----------------|--------------------------|---------|
| 1     | 1               | 2              | 1 <= 2 ✅                | Continue|
| 2     | 2               | 3              | 2 <= 3 ✅                | Continue|
| 3     | 3               | 4              | 3 <= 4 ✅                | Continue|
| 4     | 4               | 5              | 4 <= 5 ✅                | Continue|

**Conclusion:** The array is sorted.

Array: `[1, 3, 2, 4, 5]`  

| Index | Previous Element | Current Element | Condition (prev <= curr) | Result         |
|-------|-----------------|----------------|--------------------------|----------------|
| 1     | 1               | 3              | 1 <= 3 ✅                | Continue       |
| 2     | 3               | 2              | 3 <= 2 ❌                | Array not sorted |

**Conclusion:** The array is **not sorted**.

---

## Key Points

- An array of size 0 or 1 is **always considered sorted**.  
- The check can be done efficiently in **O(N) time** and **O(1) extra space**.  
- Dry running with examples helps to understand the comparison pattern.

## Practice Problem

You can try this problem online to practice:  
[Check if Array is Sorted - GeeksforGeeks](https://practice.geeksforgeeks.org/problems/check-if-array-is-sorted0704/1)

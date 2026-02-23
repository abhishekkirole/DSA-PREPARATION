# Remove Duplicates from Sorted Array - Java

This project explains how to **remove duplicates from a sorted array in-place** using a space-optimized two-pointer approach.

## Concept

- In a **sorted array**, all duplicate values appear **adjacent** to each other.  
- Instead of using extra space (like a set), we can **track unique elements using pointers**.  
- The first element is always unique. From there, we compare each element to the last kept unique element.  
- If it’s the same, it’s a duplicate and skipped.  
- If it’s different, it is placed **right after the last kept unique element**.  

By the end, the **first part of the array contains all unique elements**, and the rest can be ignored.

---

## Approach (Two-Pointer Strategy)

1. Start with the first element of the array as the first unique element.  
2. Use a pointer `lastUniqueIndex` to track the last unique element placed.  
3. Iterate through the array starting from the second element:  
   - If the current element equals the last unique element, **skip** it.  
   - If it’s different, increment `lastUniqueIndex` and **place the current element** there.  
4. Continue until the end of the array.  
5. The array is now rearranged **in-place** with all unique elements grouped at the front.

---

## Dry Run Example

Array: `[1, 1, 2, 2, 3, 4, 4, 5]`  

| Step | Current Element | Last Unique Element | Action                    | Array State                    |
|------|----------------|-------------------|---------------------------|--------------------------------|
| 0    | 1              | 1                 | Keep                      | `[1, _, _, _, _, _, _, _]`    |
| 1    | 1              | 1                 | Skip (duplicate)          | `[1, _, _, _, _, _, _, _]`    |
| 2    | 2              | 1                 | Place after last unique   | `[1, 2, _, _, _, _, _, _]`    |
| 3    | 2              | 2                 | Skip (duplicate)          | `[1, 2, _, _, _, _, _, _]`    |
| 4    | 3              | 2                 | Place after last unique   | `[1, 2, 3, _, _, _, _, _]`    |
| 5    | 4              | 3                 | Place after last unique   | `[1, 2, 3, 4, _, _, _, _]`    |
| 6    | 4              | 4                 | Skip (duplicate)          | `[1, 2, 3, 4, _, _, _, _]`    |
| 7    | 5              | 4                 | Place after last unique   | `[1, 2, 3, 4, 5, _, _, _]`    |

**Result:** First 5 elements `[1, 2, 3, 4, 5]` are unique.

---

## Key Points

- Uses **O(1) extra space** (in-place modification).  
- Efficient with **O(N) time complexity**.  
- Maintains the **original order of unique elements**.  
- Ideal for **sorted arrays** where duplicates are consecutive.

---

## Practice Problem

Try this problem online:  
[Remove Duplicates from Sorted Array - LeetCode](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)


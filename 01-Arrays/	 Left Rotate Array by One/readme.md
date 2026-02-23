# Rotate Array by One - Java

This project explains how to **rotate the elements of an array to the left by one position**.

## Concept

- To rotate an array by one, the **first element moves to the last position**, and every other element shifts **one position to the left**.  
- This can be done efficiently by using a **temporary variable** to store the first element while we shift the others.

---

## Approach

1. Store the value of the **first element** in a temporary variable.  
2. Iterate through the array starting from the second element.  
3. For each element, **shift it one position to the left** by assigning it to the position of its predecessor.  
4. After completing the iteration, place the value from the **temporary variable** into the **last position** of the array.  

This ensures that the array is rotated **in-place** without using extra space.

---

## Dry Run Example

Array: `[1, 2, 3, 4, 5]`  

| Step | Action                                    | Array State               |
|------|------------------------------------------|---------------------------|
| 0    | Store first element (1) in temp          | `temp = 1`               |
| 1    | Shift 2 to index 0                        | `[2, 2, 3, 4, 5]`       |
| 2    | Shift 3 to index 1                        | `[2, 3, 3, 4, 5]`       |
| 3    | Shift 4 to index 2                        | `[2, 3, 4, 4, 5]`       |
| 4    | Shift 5 to index 3                        | `[2, 3, 4, 5, 5]`       |
| 5    | Place temp (1) at last index             | `[2, 3, 4, 5, 1]`       |

**Result:** The array is rotated left by one position: `[2, 3, 4, 5, 1]`.

---

## Key Points

- The rotation is done **in-place**, with **O(1) extra space**.  
- Time complexity is **O(N)**, where N is the size of the array.  
- The first element is preserved using a **temporary variable**.  
- Efficient for **small or large arrays** without additional memory.

---

## Practice Problem

Try this problem online:  
[Rotate Array by One - GeeksforGeeks](https://practice.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1)

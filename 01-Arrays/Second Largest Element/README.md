# Check If Array Is Sorted - Java

This project explains the approach to check whether a given array is **sorted in non-decreasing order**.  
It helps understand array traversal, comparison logic, and conditional reasoning in Java.

## How It Works

1. For a sorted array, the **previous element is always smaller than or equal to the current element**.  
2. Iterate through the array starting from the second element.  
3. Compare the current element with the previous element:
   - If the previous element is **less than or equal** to the current element, continue to the next element.  
   - If not, the array is **not sorted**.
4. If the entire array is traversed successfully or the array size is 0 or 1, the array is **sorted**.

---

## Dry Run Example

Array: `[1, 2, 3, 4, 5]`  

| Index | Previous | Current | Condition (prev <= curr) | Result  |
|-------|----------|---------|--------------------------|---------|
| 1     | 1        | 2       | 1 <= 2 ✅                | Continue|
| 2     | 2        | 3       | 2 <= 3 ✅                | Continue|
| 3     | 3        | 4       | 3 <= 4 ✅                | Continue|
| 4     | 4        | 5       | 4 <= 5 ✅                | Continue|

**Conclusion:** The array is sorted.

Array: `[1, 3, 2, 4, 5]`  

- At index 2, previous = 3, current = 2 → 3 > 2 ❌ → array is **not sorted**.

---

## Practice Problem Link

You can try this problem online to strengthen your understanding:  
[Check if Array is Sorted - GeeksforGeeks](https://practice.geeksforgeeks.org/problems/check-if-array-is-sorted0704/1)

---

## Notes

- An array of size 0 or 1 is **always considered sorted**.  
- This approach is efficient with **O(N) time complexity** and **O(1) space complexity**.  
- Dry run the logic with multiple examples to fully understand the pattern.

---

## Author

**Abhishek Kirole** - Learning DSA and Java

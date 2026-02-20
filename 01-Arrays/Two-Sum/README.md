## 🧠 Algorithm (Two Pointer Approach)

1. Sort the given array in ascending order.

2. Initialize two pointers:
   - `left = 0` (first index)
   - `right = n - 1` (last index)

3. While `left < right`, repeat:
   
   a. Calculate:
      ```
      currentSum = arr[left] + arr[right]
      ```

   b. If `currentSum == target`
      - Return `"YES"` or the indices (as required).

   c. If `currentSum < target`
      - We need a larger sum.
      - Increment the left pointer:
        ```
        left++
        ```

   d. If `currentSum > target`
      - We need a smaller sum.
      - Decrement the right pointer:
        ```
        right--
        ```

4. If the loop ends and no pair is found:
   - Return `"NO"` or `{-1, -1}`.

# Largest Element in Array - Java

This project contains a simple Java program to find the **largest element in an array**.  
It demonstrates the use of arrays, loops, and basic conditional statements.

## How It Works

1. Create a variable called `max` and initialize it with the value of the first element in the array.
2. Use a `for` loop to iterate through the rest of the elements in the array.
3. In each iteration, compare the current element with the `max` variable.
4. If the current element is greater than `max`, update `max` with the current element's value.
5. After completing the loop, `max` holds the largest value in the array, which is then printed.

## Example

```java
int[] arr = {2, 5, 1, 3, 0};
int max = Solution.findLargestElement(arr, arr.length);
System.out.println("The largest element in the array is: " + max);

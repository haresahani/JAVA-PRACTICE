package sorting;

public class CountingSort {
    public static void countingSort(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) if (num > max) max = num;

        int[] count = new int[max + 1];
        for (int num : arr) count[num]++;

        for (int i = 1; i <= max; i++) count[i] += count[i - 1];

        int[] output = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        System.arraycopy(output, 0, arr, 0, arr.length);
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        countingSort(arr);
        for(int i : arr) {
            System.out.print(i+" ");
        }
    }
}

/*
🧠 COUNTING SORT (Non-Comparison Sorting Algorithm)

▶ PURPOSE:
Sort non-negative integers when the range (max value) is not too large.

▶ TIME COMPLEXITY:
Best / Avg / Worst: O(n + k)
Space: O(k)
Stable: YES
In-Place: NO

────────────────────────────────────────
        👣 STEPS:

1. Find the maximum value to define range (k = 8).

2. Create a count array of size k + 1 (from 0 to 8) and initialize all values to 0.

3. Store the count of each element in the count array.

4. Modify the count array so that each element at index i stores the cumulative count (how many elements ≤ i).

5. Place the elements in the correct position in the output array using the count array.

6. Copy the output back to the original array (if needed).

────────────────────────────────────────
        🧪 EXAMPLE:

Input:  [4, 2, 2, 8, 3, 3, 1]
max = 8
Initial count[]:   [0, 0, 0, 0, 0, 0, 0, 0, 0]
After counting:    [0, 1, 2, 2, 1, 0, 0, 0, 1]
Cumulative count:  [0, 1, 3, 5, 6, 6, 6, 6, 7]
Build output[] →   [1, 2, 2, 3, 3, 4, 8]
Final sorted arr:  [1, 2, 2, 3, 3, 4, 8]

────────────────────────────────────────

🔥 Use when:
- Data is small integers
- Range is limited
- You want linear time sorting

❌ Avoid when:
- Large integer range
- Negative numbers (unless offset logic added)
*/
//------------------------------------------------------------------------------
/*
Input:  {4, 2, 2, 8, 3, 3, 1}
Step 1: max = 8
Step 2: count[0..8] = {0,0,0,0,0,0,0,0,0}
Step 3: count each element:
        count[1]++, count[2]++, ...
        count = {0,1,2,2,1,0,0,0,1}
Step 4: cumulative count:
        count[1] = 1
        count[2] = 1+2 = 3
        count[3] = 3+2 = 5
        ...
        count = {0,1,3,5,6,6,6,6,7}
Step 5: Place elements in output:
        output[count[arr[i]] - 1] = arr[i];
        and reduce count[arr[i]]--
        => output = {1,2,2,3,3,4,8}
*/
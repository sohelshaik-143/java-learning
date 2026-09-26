15. Why Integer.MIN_VALUE?

We need an initial value smaller than normal integers.

Java provides:

Integer.MIN_VALUE

which represents the smallest possible int.

This allows the algorithm to work correctly even when the array contains negative numbers.

Example:

[-10, -5, -20]

Second largest:

-10

If you started with:

secondLargest = 0;

you'd get the wrong answer because 0 isn't even in the array.

16. Why This Condition?
if (arr[i] > largest)

If the current element is bigger than the largest:

old largest → second largest
current      → largest

Example:

largest = 25
current = 42

Therefore:

secondLargest = 25
largest = 42
17. Why else if?

This is important.

if (arr[i] > largest) {

    secondLargest = largest;
    largest = arr[i];

} else if (...) {
    ...
}

If the current value becomes the new largest, we've already handled it.

We don't want the second condition to run immediately afterward.

That's why else if is useful.

18. Duplicate Values

Consider:

[10, 20, 20, 5]

If we're looking for the second distinct largest, answer is:

10

That's why we included:

arr[i] != largest

But be careful: problems sometimes define "second largest" differently.

For example:

[10, 20, 20]

could be interpreted as:

second distinct largest → 10
second element after sorting with duplicates → 20

In coding interviews, read the exact problem definition.

19. Edge Cases

Test these:

Normal
[10, 20, 30, 40]

Answer:

30
Negative
[-10, -5, -20]

Answer:

-10
Unsorted
[50, 10, 90, 30, 70]

Answer:

70
Duplicate maximum
[10, 50, 50, 30]

For second distinct largest:

30
Too few distinct values
[10, 10]

There is no second distinct largest value.

Your production-quality version should handle this explicitly instead of silently returning Integer.MIN_VALUE.

20. Complexity

We traverse the array once:

n elements

Therefore:

Time

O(n)

Space

Only:

largest
secondLargest

So:

O(1)

This is much better than sorting just to find the answer.

Sorting would generally cost:

O(n log n)

while our one-pass solution is:

O(n)

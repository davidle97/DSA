###IDEA:
pick the pivot index, and then compare all items to that pivot, 
Smaller is on the left, and Greater is on the right;

##PIVOT:
It's helper function for quicksort;
swap the pivot if it's smaller, swap to bigger value 
, and then put the value of the pivot to right position after swap method.

Apply the same quicksort for the left, and the right. 

##BigO:
Quicksort doesn't create a new array, just move item around.

space complexity: O(1)

time complexity: 
    Best and  Average O(nlogn),
    worse case: O(n^2)



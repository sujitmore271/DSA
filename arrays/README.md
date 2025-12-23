# Arrays - Easy
 1 **Largest Element**:
 -brute force : O(n^2) (insertion sort)
 - Optimal : O(n) (liner scan)
2 **Second Largest Element**
   - **Logic**: Single pass using `largest` and `secondLargest` variables to handle duplicates.
   - **Complexity**: Time: $O(n)$ | Space: $O(1)$
4 **Remove duplicate from sorted array**
  - **Logic** : single pass using two pointer technique to identify and overwrite the array
  - **complexity** : time : O(n)
5 **Rotate Array left by one element**
  - **Logic** : using pointer to overwrite the previous element
  - **complexity** : time : O(n) ; space : O(1) as single extra element used
 6 **Rotate Array left by K elements**
  - **Logic**: learned from teacher (revisit)
  - **complexity**: time : O(n) ; space : O(1)
7 **MOVE ZEROS TO END**
  -brute force : use 2 loops and a counter to keep track 
  - complexity : time : O(n^2) 
  - optimal : use 2 pointer technique to ship the element
  - complexity : time : O(n)
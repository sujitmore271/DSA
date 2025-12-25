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
  8 **UNion of Sorted arrays**
  - logic : set 2 pointer for each arrays and iterate and compare and add to array list 
  - complexity: time: O(N1 + n2) 
  9 **Find missing number**
  - logic : find sum by formula then find sum and substract
  - complexity : time o(n)
  -logic : if num is too big xor the number from 0 to n then xor array element the xor the xor
   complexity : time O(n)
  10 ** Consecutive ones**
  - logic : loop ones with 2 variables and count them
  - complexity : time : O(n)
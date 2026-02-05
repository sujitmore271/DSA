# Arrays - Easy
 1 **Largest Element**:
 -brute force : O(n^2) (insertion sort)
 - Optimal : O(n) (liner scan)
 --------------------------------
2 **Second Largest Element** :
   - **Logic**: Single pass using `largest` and `secondLargest` variables to handle duplicates.
   - **Complexity**: Time: $O(n)$ | Space: $O(1)$
 --------------------------------
3 **none**:
  nothing.
 ---------------------------------
4 **Remove duplicate from sorted array**:
  - **Logic** : single pass using two pointer technique to identify and overwrite the array
  - **complexity** : time : O(n)
  --------------------------------
5 **Rotate Array left by one element**:
  - **Logic** : using pointer to overwrite the previous element
  - **complexity** : time : O(n) ; space : O(1) as single extra element used
  --------------------------------
 6 **Rotate Array left by K elements**:
  - **Logic**: learned from teacher (revisit)
  - **complexity**: time : O(n) ; space : O(1)
  --------------------------------
7 **MOVE ZEROS TO END**:
  -brute force : use 2 loops and a counter to keep track 
  - complexity : time : O(n^2) 
  - optimal : use 2 pointer technique to ship the element
  - complexity : time : O(n)
  --------------------------------
  8 **UNion of Sorted arrays**:
  - logic : set 2 pointer for each arrays and iterate and compare and add to array list 
  - complexity: time: O(N1 + n2) 
  --------------------------------
  9 **Find missing number**:
  - logic : find sum by formula then find sum and substract
  - complexity : time o(n)
  -logic : if num is too big xor the number from 0 to n then xor array element the xor the xor
   complexity : time O(n)
   --------------------------------
  10 **Consecutive ones**:
  - logic : loop ones with 2 variables and count them
  - complexity : time : O(n)
  --------------------------------
  11 **Longest sub array with sum k** :
  - logic : sliding window with two pointers and sum while right pointer selects the boundry and left calculate sum with maxlen
  - complexity : time O(2n)
  --------------------------------

# Arrays - Medium

1 **Two sum** :
- logic : brute force- two loop with two pointers
          optimal - hashmap to store value and index and compare with next iterator
- complexity : brute_forec - o(n2)
             : optiaml O(n)
--------------------------------
2 **sort 0's , 1's and 2's**:
- logic : brute- counting logic count numbers and replace
        : optimal - Dutch National Flag Algorithm and  Three Pointer Technique
-complexity : brute - O(2n)
            : optimal - O(n)
---------------------------------
3**majority element (>n/2)**:
- logic : brute - use 2 loops to calculate all numbers
        : better - use hashmap to store the values and frequency of element
        : optimal - use boyer voting algo and just 2 varibals to count and check to solve the problem
-complexity : brute - time complexity : O(n^2) and space 
            : better - time complexity = O(n) and space = O(n)
            : optimal - time complexity = O(n) and space = O(1)
---------------------------------
4 **Kadanes algorithm**:
- logic : running sum , reset the sum when it is <0 
- complexity : brute : O(N^2)
             : optimal : O(n)
---------------------------------
5 **Buy and sell Stocks** :
- logic : calculate running diff encounter highest price and calculate previous diff
- complexity : brute : O(n^2)
             : optimal : O(N)
---------------------------------
6 **Next Permutation** :
- logic : search for the reducing edge or pivot which is lower than next i.e i < i+1 then find next greater element than i and then arrange all elements decreasing order to make small number
- complexity : O(N)
---------------------------------
7 **Leaders in an Array** :
- logic : note the maxSoFar from end and compare it with current elemnet if >= then update the leader and add 
- complexity : O(N)
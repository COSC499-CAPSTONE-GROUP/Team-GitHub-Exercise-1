# Team-GitHub-Exercise-1

## Features

### Feature #1: Finding Max

#### Overview
*Finding max* refers to finding the largest (maximum) value of a given set of numbers. To find the maximum value, compare all the numbers in the set against each other, starting from the very beginning of the list. Update the maximum number every time a new number is a greater than the current max value. Continue this process until the end of the list is reached.

#### The Method: findMax()
This method works by taking the user's inputed array of integers and using a `for` loop to iterate through all the elements. The variable `max` keeps track of the current maximum value and is updated every time a new maximum value is found. Once all of the elements have been compared, the maximum value is returned for it to be displayed back to the user. 

For example, if the user enters the values `3, 26, 73, 15, 29, 56, 81` and chooses the maximum value feature, the method should return the value `81`.

### Feature #2: Finding Mean

*Finding mean* 
refers to finding the average  value of a given set of numbers.

*Mathematically* 
you just need to add all the numbers together and divide it by the total number of integers.


*Programmatcally*
a for loop is run which calculates the sum of all integers in an array, after the loop ends the sum is divided by the length of the array to get the mean

*Why is this the best approach*
After thorough research, i found 2 ways of writing a function to calculate the mean, the first one was to use iteration which is what i ended up using and other was using recursion. Both had a runtime of O(n) so instead i looked at the space complexity, the iteration algorithm had O(1) and the recursive one had O(N), hence i decided to go for the iteration algorithm.

### Feature #3: Finding Mode

*Finding Mode*
refers to finding the most frequent number in a given set of numbers

*Mathematically*
You just need to find the most frequent number that occurs in a set of numbers.

*Programmatically*

A for loop will run and identify the most frequent number.

*Why is this the best approach*
After going through a vast range of algorithims, the way I cose to write the functions had a better time complexity. Making it the better approach.
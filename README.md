# Team-GitHub-Exercise-1

## Features

### Feature #1: Finding Max

#### Overview
*Finding max* refers to finding the largest (maximum) value of a given set of numbers. To find the maximum value, compare all the numbers in the set against each other, starting from the very beginning of the list. Update the maximum number every time a new number is a greater than the current max value. Continue this process until the end of the list is reached.

#### The Method: findMax()
This method works by taking the user's inputed array of integers and using a `for` loop to iterate through all the elements. The variable `max` keeps track of the current maximum value and is updated every time a new maximum value is found. Once all of the elements have been compared, the maximum value is returned for it to be displayed back to the user. 

For example, if the user enters the values `3, 26, 73, 15, 29, 56, 81` and chooses the maximum value feature, the method should return the value `81`.

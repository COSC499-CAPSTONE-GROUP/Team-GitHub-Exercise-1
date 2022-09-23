# Team Github Exercise #1

## Overview

The simple Java program created for this exercise allows the user to enter a series of numbers (in this case, 7 integers), and then choose the option to know the maximum value, minimum value, mean value or mode value of the set of integers they entered.

## Features

### Feature #1: Finding Max

_Finding max_ refers to finding the largest (maximum) value of a given set of numbers. To find the maximum value, compare all the numbers in the set against each other, starting from the very beginning of the list. Update the maximum number every time a new number is a greater than the current max value. Continue this process until the end of the list is reached.

#### The Method: findMax()

This method works by taking the user's inputed array of integers and using a `for` loop to iterate through all the elements. The variable `max` keeps track of the current maximum value and is updated every time a new maximum value is found. Once all of the elements have been compared, the maximum value is returned for it to be displayed back to the user.

>For example, if the user enters the values `3, 26, 73, 15, 29, 56, 81` and chooses the maximum value feature, the method should return the value `81`.

After researching and coming up with different ways to achieve the maxiumum value, this method would be the most efficient to accomplish the task as it has a time complexity of O(1).

### Feature #2: Finding Min

_Finding min_ refers to evaluating which value is the minimum integer value from a given array that only contains integer values.

#### The Method: findMin()

This method will take in an integer array as a parameter and will return the minimum value in the array by iterating through the array using a `for` loop.

> For example, if the user enters the values `6, 37, 51, 2, 95, 27, 84` and wants to know the minimum value, the method should return the value `2`.

### Feature #3: Finding Mean

_Finding mean_ refers to finding the average value of a given set of numbers. Mathematically, you just need to add all the numbers together and divide it by the total number of integers.

#### The Method: calculateMean()

A `for` loop is run which calculates the sum of all integers in an array, after the loop ends the sum is divided by the length of the array to get the mean.

> For example, if the user enters the values `10, 12, 13, 14, 5,61,17` and wants to know the mean value, the method should return the value `18`.

After thorough research, we discovered two ways of writing a function to calculate the mean, the first one was to use iteration and other was using recursion. Both had a runtime of O(n) so instead, I looked at the space complexity, the iteration algorithm had O(1) and the recursive one had O(N), hence I decided to go for the iteration algorithm.

### Feature #4: Finding Mode

_Finding Mode_
refers to finding the most frequent number in a given set of numbers. Mathematically, you just need to find the most frequent number that occurs in a set of numbers.

#### The Method: mode()

A `for` loop will run and identify the most frequent number.

> For example, if the user enters the values `27, 27, 15, 15, 11, 3, 15` and wants to know the mean value, the method should return the value `15`.

After going through a vast range of algorithms, the one chosen had a better time complexity, making it the better approach.

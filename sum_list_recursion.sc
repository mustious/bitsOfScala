/*
This snippet of code contains a function to calculate the sum of 
values in a List using recursion to avoid using mutable variables.
Usage:
val a = List(1,2,-23,212,-159)
val sum_list = sum(a)
*/
def sum(a_list: List[Int]): Int = {
  if (a_list.isEmpty == true) {
    0
  }
  else {
    a_list.head + sum(a_list.tail))
  }
}

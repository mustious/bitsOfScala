/*
This snippet of code contains a function to calculate the max value
in a List using recursion to avoid using mutable variables. Usage:
val a = List(1,2,-23,23)
val max_value = max(a)

*/
def max(a_list: List[Int]): Int = {
  if (a_list.isEmpty == true) {
    0
  }
  else {
    Math.max(a_list.head, max(a_list.tail))
  }
}

## Iteratively
* To alter a node, from pointing to next to pointing to previous. 3 nodes are involved, previous, current and next.
* So the loop should assign these 3 variables properly so that we could loop the whole list.
* In each iteration, there is one more operation to actually change pointer from next to previous.

## Recursively
* Exit condition is next == null which is obvious.
* If using only one node as argument of recursive function, only current and next is given. As "Iteratively" part mentioned, we need 3 variables in total, so recursive function needs both previous and current as argument. (next is included in current.) 
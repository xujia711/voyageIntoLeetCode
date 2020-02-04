* Head is not provided, and it's a singly linked list, no way to change pointer before the node.
* So only approach is to do something to node itself, alter it so that it becomes exactly the same as next node. Then it points to next of next.
* In this way, node itself is gone (its value becomes value of next). Target is achieved.
One small example of tree is linkedlist
Tree is more advanced. Instead of poiting to next like
linkedlist, It points to left and right.
Left and Right is another node, and continue to point to left and right 
Binary: Each node point to 2 nodes.

Full tree: one node point to 0 node or 2 nodes.
Perfect Tree: Full tree and every level of the tree is completely filled
Complete Tree: Nodes are filled from left to right

Left and Right are children nodes of the parent 
Left and Right node are sibling relationship
A node with no children is a leaf

Binary Search Tree: 
if the number is greater--> go to the right of the node
if the number is smaller--> go to the left of the node

If the node was taken, the right side is greater than that node
and the left side is smaller than that node.

Time Complexity: 
one node:  2^1=1
second level: 2^2-1
third level: 2^3-1
four level: 2^4-1
--> time complexity to find a node, add node, remove
is O(logn) <O(n)

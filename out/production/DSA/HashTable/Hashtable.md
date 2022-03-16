## Hash Table
Hash table includes index and key value pairs (key and value)
Hash method:
    One way: index --> key value 
    Deterministic: one key only one address 
Collision happen when hash address 2 values at same address,
we can store both in one address.

get(key)--> get index--> return value 

## Collision 
####Method 1: Linear Probing (open addressing)
Adding to the next null index 

####Method 2: 
Form a linkedlist for every index
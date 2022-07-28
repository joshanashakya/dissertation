from collections import Counter 

def solve():    array = [int(i) for i in range(int(input()), 0, -1)]


if len(array) % 2:        temp = array[len(array) // 2]
array[len(array) // 2] = 1
array[-1] = temp
return array for i in range(int(input())):    for
i in solve(): print(i, end=" ")
print()

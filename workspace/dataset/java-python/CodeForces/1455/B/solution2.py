from collections import defaultdictimport

matht = int(input())
for i in range(t):    n = int(input())
val = math.ceil((math.sqrt(1 + 8 * n) - 1) / 2)
comp = (val * (val + 1)) // 2 - 1
if (n != comp):
    print(val)    else:
    print(val + 1)       

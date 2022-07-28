import mathfrom

collections
import Countert = int(input())
for i in range(t):    n = int(input())
l = list(input())
if (l.count('>') == 0 or l.count('<') == 0):
    print(n)    else:
    count = 0
for j in range(n):            if
    (l[j] == '-' or l[j - 1] == '-'): count += 1
print(count) 

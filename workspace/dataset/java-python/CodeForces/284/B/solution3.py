from collections import Countert = int(input())arr= list(input()) c = Counter(arr)if c['I']==0:    res = c['A']elif c['I']==1:    res = 1else:    res = 0print(res)

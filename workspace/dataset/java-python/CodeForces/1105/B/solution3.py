from sys import *; from math import *; from collections import *; from bisect import *INF = maxsizedef get_ints(): return map(int, stdin.readline().strip().split())def get_array(): return list(map(int, stdin.readline().strip().split()))def input(): return stdin.readline().strip()mod = 1000000007 from string import *n,k=get_ints()s=input()ans=0for letter in ascii_lowercase:    curr=0    cnt=0    for i in range(n):        if s[i]==letter:            curr+=1            if curr==k:                cnt+=1                curr=0        else:            curr=0    ans=max(ans, cnt)print(ans)

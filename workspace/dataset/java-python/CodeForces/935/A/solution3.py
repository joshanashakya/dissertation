from collections import Counter def solve():    n=int(input())    count=1     for i in range(2,n//2+1):        if n%i==0:            count+=1     return count print(solve())

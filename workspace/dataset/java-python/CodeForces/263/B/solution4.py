import sys def input():    return sys.stdin.readline().strip()def iinput():   return int(input())def rinput():   return map(int, sys.stdin.readline().strip().split()) def get_list(): return list(map(int, sys.stdin.readline().strip().split()))   n,k=rinput()a=get_list() if(k>n):    print(-1)else:    a.sort()    a=list(reversed(a))    print(a[k-1],0)
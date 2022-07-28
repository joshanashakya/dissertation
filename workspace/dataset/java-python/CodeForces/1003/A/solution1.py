from collections import Countern=int(input())l=list(map(int,input().split()))c=Counter(l)print(max(c.values()))

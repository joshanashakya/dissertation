from collections import Countern=int(input())aa = list(map(int,input().split()))c = Counter()best = 0lead = 1for a in aa:    c[a]+=1    if c[a]>best:        best = c[a]        lead = a print(lead)   

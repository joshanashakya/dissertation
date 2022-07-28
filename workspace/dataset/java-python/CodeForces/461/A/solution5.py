n=int(input())l=sorted(list(map(int,input().split())))s=[l[i]*(i+2) for i in range(n)]print(sum(s)-l[-1])

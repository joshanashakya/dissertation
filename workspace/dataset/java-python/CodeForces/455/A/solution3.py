import sys,mathfrom itertools import permutations,combinationsfrom collections import defaultdict,dequeinput=sys.stdin.readline n=int(input())l=list(map(int,input().split()))d=defaultdict(int)maxi=0for i in l:    maxi=max(maxi,i)    d[i]+=1dp=[0 for i in range(maxi+1)]dp[1]=d[1]for i in range(2,maxi+1):    dp[i]=max(d[i]*i+dp[i-2],dp[i-1])print(dp[-1])    

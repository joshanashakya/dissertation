import sys#input=sys.stdin.readlinefrom collections import defaultdict as dcfrom collections import Counterfrom bisect import bisect_right, bisect_leftimport mathfrom operator import itemgetterfrom heapq import heapify, heappop, heappushn=int(input())l=list(map(int,input().split()))c=l[-1]x=l[-1]for i in range(n-2,-1,-1):    x=max(0,min(x-1,l[i]))    c+=xprint(c)

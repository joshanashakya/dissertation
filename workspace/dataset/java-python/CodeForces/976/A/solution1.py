import sysinput=sys.stdin.readlinefrom collections import defaultdict as dcfrom collections import Counterfrom bisect import bisect_right, bisect_leftimport mathfrom operator import itemgetterfrom heapq import heapify, heappop, heappushfrom queue import PriorityQueue as pqn=int(input())s=input()[:-1]if int(s,2)==0:    print(s)else:    c=0    for i in s:        if i=='0':            c+=1    l=['1']+['0']*c    print(''.join(l))

import math,sys#from itertools import permutations, combinations;import heapq,random;from collections import defaultdict,dequeimport bisect as bidef yes():print('YES')def no():print('NO')#sys.stdin=open('input.txt','r');sys.stdout=open('output.txt','w');def I():return (int(sys.stdin.readline()))def In():return(map(int,sys.stdin.readline().split()))def Sn():return sys.stdin.readline().strip()#sys.setrecursionlimit(1500)from heapq import heappush,heappopdef dict(a):    d={}     for x in a:        if d.get(x,-1)!=-1:            d[x]+=1        else:            d[x]=1    return ddef find_gt(a, x):    'Find leftmost value greater than x'    i = bi.bisect_left(a, x)    if i != len(a):        return i    else:                    return -1def main():    try:        n=I()        p=list(In())        a=list(In())        b=list(In())        p12,p11,p13,p22,p23,p33=[],[],[],[],[],[]        for i in range(n):            a[i],b[i]=min(a[i],b[i]),max(a[i],b[i])            if a[i]==1 and b[i]==1:                heappush(p11,p[i])            elif a[i]==1 and b[i]==2:                heappush(p12,p[i])            elif a[i]==1 and b[i]==3:                heappush(p13,p[i])            elif a[i]==2 and b[i]==2:                heappush(p22,p[i])            elif a[i]==2 and b[i]==3:                heappush(p23,p[i])            else:                heappush(p33,p[i])        nq=I()        c=list(In())        ans=[]        for i in range(nq):            q=c[i]            cost=float('inf')            co=-1            if q==1:                if len(p11) and cost>p11[0]:                    co='p11'                    cost=p11[0]                if len(p12) and cost>p12[0]:                    co='p12'                    cost=p12[0]                if len(p13) and cost>p13[0]:                    co='p13'                    cost=p13[0]                if co=='p11':                    ans.append(heappop(p11))                elif co=='p12':                    ans.append(heappop(p12))                elif co=='p13':                    ans.append(heappop(p13))                else:                    ans.append(-1)            elif q==2:                if len(p22) and cost>p22[0]:                    cost=p22[0]                    co='p22'                if len(p12) and cost>p12[0]:                    co='p12'                    cost=p12[0]                if len(p23) and cost>p23[0]:                    co='p23'                    cost=p23[0]                 if co=='p22':                    ans.append(heappop(p22))                elif co=='p12':                    ans.append(heappop(p12))                elif co=='p23':                    ans.append(heappop(p23))                else:                    ans.append(-1)            elif q==3:                if len(p33) and cost>p33[0]:                    cost=p33[0]                    co='p33'                if len(p13) and cost>p13[0]:                    co='p13'                    cost=p13[0]                if len(p23) and cost>p23[0]:                    co='p23'                    cost=p23[0]                 if co=='p33':                    ans.append(heappop(p33))                elif co=='p13':                    ans.append(heappop(p13))                elif co=='p23':                    ans.append(heappop(p23))                else:                    ans.append(-1)        print(*ans)     except:        pass        M = 998244353P = 1000000007 if __name__ == '__main__':    # for _ in range(I()):main()    for _ in range(1):main()#End# #        ******************* All The Best *******************   #	     	 	    	 		 	   	   				
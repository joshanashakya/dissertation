from sys import stdin,stdoutfrom bisect import bisect_right as brfrom bisect import bisect_left as blfrom bisect import insort_left as ilfrom math import gcddef cho(n):    return n*(n-1)//2def val(n):    ans=0    while n:        if n&1:            ans+=1        n//=2    return ansn=int(stdin.readline())lst=[int(i) for i in stdin.readline().split()]lst2=[]for i in lst:    lst2+=[val(i)]lst2.sort()temp=lst2[0]c=[1]ans=0for i in lst2[1:]:    if i==temp:        c[-1]+=1    else:        c+=[1]    temp=ifor i in c:    ans+=cho(i)stdout.write(str(ans))

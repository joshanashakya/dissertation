# -*- coding: utf-8 -*-"""Created on Sun Apr 11 13:43:45 2021 @author: Yogesh Panjwani"""n,l=map(int,input().split())a=list(map(int,input().split()))d=0a.sort()for i in range(0,len(a)-1):    d=max(d,a[i+1]-a[i])d=d/2f=0g=0if 0 not in a:    if a[0]-0 > d:        f=a[0]if l not in a:    if l-a[len(a)-1] > d:        g=l-a[len(a)-1] j=max(f,g)d=max(j,d)print(d)

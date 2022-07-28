# -*- coding: utf-8 -*-"""Created on Sun Apr 11 14:02:32 2021 @author: Yogesh Panjwani"""n,m,a,b=map(int,input().split())if m*a<b:    print(n*a)else:    c=(n//m)*b  +  min((n%m)*a,b)     print(c)

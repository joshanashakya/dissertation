# -*- coding: utf-8 -*-"""Created on Tue Mar 30 19:32:51 2021 @author: nehas"""n=int(input())c=2print(c,end=" ")for i in range(2,n):    c=c+i    if(c>n):        c=c-n    print(c,end=" ")

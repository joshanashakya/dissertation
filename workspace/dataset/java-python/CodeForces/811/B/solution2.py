#!/usr/bin/env python# coding: utf-8 # In[2]:  a, b = input().split()a = int(a)b = int(b)seq = input().split()for i in range(0,a):    seq[i]=int(seq[i])    for case in range(0,b):    l,r,x = input().split()    l = int(l)    r = int(r)    x = int(x)#     seq_segm = seq[l-1:r]#     seq_segm.sort()#     new_seq = []#     if l==1:#         if r==a:#             new_seq = seq_segm#         else:#             new_seq = seq_segm+seq[r:a]    #     elif l>=2:#         if r==a:#             new_seq = seq[0:l-1]+seq_segm#         else:#             new_seq = seq[0:l-1]+seq_segm+seq[r:a]    cnt=0    for j in range(l-1,r):        if seq[j]<seq[x-1]:            cnt+=1                #print(new_seq)    #if new_seq[x-1]==seq[x-1]:    if cnt==x-l:        print('Yes')    else:        print('No')  # ##### 
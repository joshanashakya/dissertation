import sys,mathsys.setrecursionlimit(10**8)'''def fun():    for i in range(16):        for j in range(4):            if i&(1<<j):                print(j,end='')        print()import binarytreefrom collections import dequebst = binarytree.tree(height=4,is_perfect=True)print(bst)def s(bst):    if bst:        bst.left,bst.right = bst.right,bst.left        s(bst.right)        s(bst.left)s(bst)print(bst)'''t = int(input())for _ in range(t):    n = int(input())    a = list(map(int,input().split()))    for i in range(0,n):        if i%2 == 1:            if a[i] <0:                a[i] = 0-a[i]        else:            if a[i] >0:                a[i] = 0-a[i]    print(' '.join(map(str,a))) 
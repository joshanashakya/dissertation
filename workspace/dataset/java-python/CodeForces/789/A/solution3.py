import sys,mathsys.setrecursionlimit(10**8)'''def fun():    for i in range(16):        for j in range(4):            if i&(1<<j):                print(j,end='')        print()import binarytreefrom collections import dequebst = binarytree.tree(height=4,is_perfect=True)print(bst)def s(bst):    if bst:        bst.left,bst.right = bst.right,bst.left        s(bst.right)        s(bst.left)s(bst)print(bst)'''n, k = map(int,input().split())lst = list(map(int,input().split()))s=0for i in range(n):    s+=math.ceil(lst[i]/k)print(math.ceil(s/2))
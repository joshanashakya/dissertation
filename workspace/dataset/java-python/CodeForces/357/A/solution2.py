import sys,mathsys.setrecursionlimit(10**8)'''def fun():    for i in range(16):        for j in range(4):            if i&(1<<j):                print(j,end='')        print()import binarytreefrom collections import dequebst = binarytree.tree(height=4,is_perfect=True)print(bst)def s(bst):    if bst:        bst.left,bst.right = bst.right,bst.left        s(bst.right)        s(bst.left)s(bst)print(bst)''' n = int(input())s = list(map(int,input().split()))x,y = map(int,input().split())ss = 0pika = 1for i in range(n):    ss+=s[i]    if x<=ss<=y and x<=sum(s[i+1:])<=y:        print(i+2)        pika = 0        breakif pika == 1:    print(0)
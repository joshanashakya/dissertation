from copy import deepcopyfor _ in range(int(input())):    a=int(input())    l3=[]    l1=list(map(int,input().split()))    l2= list(map(int, input().split()))    l=deepcopy(l1)    l.sort()    if l1==l :        print('Yes')    elif l2.count(0)==a or l2.count(1)==a:        print('No')    else:        print('Yes') 

n,d=map(int,input().split())arr = []for _ in range(n):    a,b,c=input().split()    curr = [a,b,int(c)]    arr.append(curr)ans = []for i in range(n):    for j in range(i+1,n):        if abs(arr[i][2]-arr[j][2])<=d and abs(arr[i][2]-arr[j][2])>0:            if arr[i][0]==arr[j][1] and arr[i][1]==arr[j][0]:                ans.append((arr[i][1],arr[i][0]))        elif  abs(arr[i][2]-arr[j][2])>d:            breakif ans==[]:    print(0)else:    distinct_ans=[]    for i in ans:        i=list(i)        x=i.sort()        distinct_ans.append(i)    stack = []    for i in distinct_ans:        if i not in stack:            stack.append(i)    print(len(stack))    for i in stack:        for j in i:            print(j,end=' ')        print()
from collections import defaultdictfrom sys import stdin, stdoutimport mathn,m,k=map(int,stdin.readline().split())mat=[]for _ in range(n):    mat.append(list(map(int,stdin.readline().split())))values=[0]*10sendby=defaultdict(lambda:0)for _ in range(k):    x,y=map(int,stdin.readline().split())    values[y-1]+=1    sendby[x-1]+=1for i in range(n):    temp=0    for j in range(m):        if(mat[i][j]==1):            temp+=values[j]    print(temp-sendby[i],end=" ") 

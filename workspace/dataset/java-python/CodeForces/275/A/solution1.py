import sys # sys.stdin = open('input.txt', 'r')  # sys.stdout = open('output.txt', 'w')    # T = int(input())# for t in range(T):n=3mat =[]for i in range(n):    t = list(map(int,input().split()))    mat.append(t)ans=[[1 for i in range(3)] for j in range(3)]for i in range(3):        for j in range(3):            s=mat[i][j]            if(j-1>=0):                s+=mat[i][j-1]            if(j+1<3):                s+=mat[i][j+1]            if(i-1>=0):                s+=mat[i-1][j]            if(i+1<3):                s+=mat[i+1][j]            # print(i,j,s)            if(s%2!=0):                ans[i][j]=0    for i in ans:    for j in i:        print(j,end="")    print() 
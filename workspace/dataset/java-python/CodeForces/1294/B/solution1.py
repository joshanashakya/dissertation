t=int(input())for i in range(t):    n=int(input())    li=[]    for i in range(n):        x=list(map(int,input().split()))        li.append(x)        li.sort()        s='R'*li[0][0]+'U'*li[0][1]    for i in range(1,n):        if li[i-1][0]>li[i][0] or li[i-1][1]>li[i][1]:            print("NO")            break        x=li[i][0]-li[i-1][0]        y=li[i][1]-li[i-1][1]        s=s+('R'*x)+'U'*y                else:        print("YES")        print(s)          
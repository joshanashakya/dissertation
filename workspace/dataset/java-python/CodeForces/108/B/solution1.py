def datatypes(x,answer):    for i in range(1,n):        if x[i]<2*x[i-1] and x[i]!=x[i-1]:            answer="YES"            break    print(answer)    n=int(input())x = list(map(int,input().split()))x.sort()answer="NO"datatypes(x,answer)   

a=int(input())o=0while a>0:    N=[i for i in input()]    i=1    while i<len(N):        if N[i]!=' ':            N[i-1]=int(N[i-1])*10+int(N[i])            N.pop(i)        else:            N[0]=int(N[0])            N.pop(i)            i=i+1    N[-1]=int(N[-1])     if N[0]+2<=N[1]:        o=o+1    a=a-1    print(o)            
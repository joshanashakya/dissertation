n=int(input())a=[]b=[]for j in range(n):    a+=[input()]for j in range(n):    i=input()    if i in a:        a.remove(i)    else:        b+=[i]print(len(b))

import sysdef f(i,s):    if i==n:        if s%360==0:            print("YES")            sys.exit()        return    f(i+1,s+b[i])    f(i+1,s-b[i])n=int(input())b=[]for i in range(n):    b.append(int(input()))f(0,0)print("NO") 

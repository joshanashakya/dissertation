N,a,b=int(input()),int(input()),int(input())queue=[(N,1,4,2)]res=10000while queue:    n,amount,x,y=queue.pop()    if x==0 and y==0:res=min(res,amount);continue    if x>0:        if n>=a:queue.append((n-a,amount,x-1,y))        else:queue.append((N-a,amount+1,x-1,y))    if y>0:        if n>=b:queue.append((n-b,amount,x,y-1))        else:queue.append((N-b,amount+1,x,y-1))print(res)
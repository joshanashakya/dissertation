n,k=[x for x in input().split()]cnt=0k=int(k)l=len(n)for i in range(l-1,-1,-1):    if k<=0:        break    elif n[i]=='0':        k-=1    else:        cnt+=1if k<=0:    print(cnt)else:    print(l-1)    

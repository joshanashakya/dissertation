n=int(input())a=int(input())b=int(input())l=[a,a,a,a,n]l.sort()cur=0ans=0e=[]for i in range(5):    cur+=l[i]    if cur>n:        e.append(cur-l[i])        cur=l[i]        ans+=1e.sort()i=0c=0#print(e)e.append(0)e.append(0)while(i<len(e)):    if n-e[i]>=b:        c+=1        e[i]+=b    else:        i+=1    if c==2:        breakc=0if e[-1]==0:    c=1if e[-2]==0:    c+=1u=len(e)-cc=0a,b=b,al=[a,a,n]l.sort()cur=0ans=0e=[]for i in range(3):    cur+=l[i]    if cur>n:        e.append(cur-l[i])        cur=l[i]        ans+=1e.sort()i=0c=0#print(e)e.append(0)e.append(0)e.append(0)e.append(0)while(i<len(e)):    if n-e[i]>=b:        c+=1        e[i]+=b    else:        i+=1    if c==4:        breakc=0if e[-1]==0:    c=1if e[-2]==0:    c+=1if e[-3]==0:    c+=1if e[-4]==0:    c+=1a,b=b,aif 2*a+b==n:    u=2if 4*a+2*b==n:    u=1print(min(u,len(e)-c))

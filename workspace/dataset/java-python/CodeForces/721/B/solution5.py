n,k=map(int, input().split())s=[]for i in range (n):    a=input()    s.append(a)flag=Trueb=0w=0d=0l=0password=input()for i in range (n):        if len(s[i])<len(password):            d+=1        elif len(s[i])==len(password):            l+=1x=d+l-1w=x+(x//k)*5+1b=d+(d//k)*5+1print(b, w)

seive=[]def precalc(n):    i=2    while(i*i<=n):        if(seive[i]):            j=i*i            while(j<=n):                seive[j]=False                j+=i        i+=1def main():    global seive    n=int(input())    seive=[True]*(n+1)    precalc(n)    res,cnt=[],0    for i in range(2,n+1):        if(seive[i]):            res.append(i)    for i in range(2,n+1):        temp=0        for j in range(2,n+1):            if(seive[j] and i%j==0):                temp+=1        if(temp==2):            cnt+=1    print(cnt)main()
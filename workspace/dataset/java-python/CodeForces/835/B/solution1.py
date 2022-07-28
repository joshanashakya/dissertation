k=int(input())n=input()sum=0for i in n:    sum+=int(i)cnt=0n=sorted(n)i=0while(k>sum):    if n[i]!='9':        sum+=(9 - int(n[i]))        cnt+=1    i+=1print(cnt)

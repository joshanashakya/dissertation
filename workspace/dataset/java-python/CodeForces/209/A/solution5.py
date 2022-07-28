n = int(input())mod = int(1e9+7)dp = []cnt = [0,0]for i in range(n):    x = i%2==0    y = (cnt[1-x]+1)%mod    dp.append(y)    cnt[x]+= yans = 0for i in dp:    ans+=i    ans%=mod print(ans)

n,k = map(int,input().split())s = sorted(input())last  = ord('a')-2ans,len = 0,0for i in range(0,n):    if ord(s[i])>=last+2:        last = ord(s[i])        ans += ord(s[i]) - ord('a') + 1        len += 1        if (len >= k):            print(ans)            exit()  print(-1)
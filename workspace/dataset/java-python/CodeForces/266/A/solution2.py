n = int(input())s = input()ans = 0c = 0n = len(s)for i in range(n-1):    #print(ans,c)    if(s[i] == s[i+1]):        c += 1    else:        ans += c        c = 0if(c > 0):    ans += cprint(ans)

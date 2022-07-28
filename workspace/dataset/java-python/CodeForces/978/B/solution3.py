n = int(input())s = input()ans = 0for i in range(n-2):     if s[i]=='x' and s[i+1]=='x' and s[i+2]=='x':          ans+=1print(ans)

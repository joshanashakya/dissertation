n,m=map(int,input().split())s=input()t=input()if m>=n-1 and s[:s.find('*')]==t[:s.find('*')] and s[s.find('*')+1:]==t[len(t)-len(s)+s.find('*')+1:]:    print('YES')else:    print('NO')

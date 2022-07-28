n, k = map(int,input().split())s = input()p = len(s)-1while s[:p] != s[-p:]:    p =  p -1print(s + s[p:]*(k-1))

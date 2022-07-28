for i in range(int(input())):    n,a,b= map(int,input().split())    s = 'abcdefghijklmnopqrstuvwxyz'    res = s[0:b]*(n//b)    c = n-len(res)    print(res+s[0:c])

n = int(input())for i in range(n):    a,b = [int(i) for i in input().split()]    s = [int(i) for i in input().split()]    s.sort()    total = sum(s)    j = 0    while a>0 and total//a<b:        a-=1        total-=s[j]        j+=1    print(a)

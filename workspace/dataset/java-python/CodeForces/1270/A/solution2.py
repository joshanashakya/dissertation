t = int(input())for i in range(t):    n, k1, k2 = map(str, input().split())    s1, s2 = input().split(), input().split()    if n in s1:        print("Yes")    else:        print("No")

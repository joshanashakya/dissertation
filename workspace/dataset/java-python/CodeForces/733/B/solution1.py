n = int(input())L = 0R = 0a = []pas = 0for _ in range(n):    l, r = map(int,input().split())    L += l    R += r    a.append(l - r)b = abs(L - R)k = bfor i in range (n):    if abs((L-a[i])-(R+a[i])) > k:        k = abs((L-a[i]) - (R+a[i]))        pas = i + 1if k==b:    print(0)else:    print(pas)
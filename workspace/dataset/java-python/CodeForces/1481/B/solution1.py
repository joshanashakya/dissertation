t = int(input())
for _ in range(t):    n, k = map(int, input().split())
ali = list(map(int, input().split()))
ans = -1
for i in range(k):        flag = 0
for j in range(n - 1):            if
    (ali[j] < ali[j + 1]): ali[j] = ali[j] + 1
ans = j
flag = 1
break  # print(ali)        if(flag == 0):            ans = -1            print(-1)            break     if(ans != -1):        print(ans + 1)          

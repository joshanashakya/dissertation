n = int(input())l = list(map(int,input().split()))l.sort()if l[-3] + l[-2] > l[-1]:    l[-2],l[-1] = l[-1],l[-2]    print('YES')    print(*l)else:    print('NO')

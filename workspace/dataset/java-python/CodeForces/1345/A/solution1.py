n = int(input())for i in range(n):    n,k = list(map(int, input().split()))    if (n == 1 or k == 1) or n == 2 and k == 2:        print('YES')    else:        print('NO')

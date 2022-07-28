from sys import stdinn = int(stdin.readline())s = stdin.readline()[:-1]for i in range(1, n):    if s[i] < s[i-1]:        print('YES')        print(i, i+1)        breakelse:    print('NO')

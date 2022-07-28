s = 0a = [list(map(int, input().split())) for i in range(int(input()))]for i in range(len(a)):    for j in range(len(a)):        if a[i][0] == a[j][1]:            s += 1print(s)

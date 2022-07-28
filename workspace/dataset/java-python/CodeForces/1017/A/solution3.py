n = int(input())l = []for i in range(n):    a = list(map(int, input().split()))    l.append(sum(a))cnt = 1for i in l:    if i > l[0]:        cnt += 1print(cnt)

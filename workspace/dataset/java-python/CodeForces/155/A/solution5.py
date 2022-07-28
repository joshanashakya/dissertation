n = int(input())l = list(map(int, input().split()))c = 0for i in range(1, n):    if l[i] > max(l[0:i]) or l[i] < min(l[0:i]):        c += 1 print(c)

a = int(input())l = list(map(int, input().split()))k = max(l)l = sorted(l)p = 0for i in range(len(l)-1):    p += (k - l[i])print(p)

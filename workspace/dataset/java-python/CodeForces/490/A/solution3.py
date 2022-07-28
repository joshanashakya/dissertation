input()n = list(map(int, input().split(" ")))m = [[], [], []]for i in range(len(n)):        m[n[i] - 1].append(i + 1)print(min(map(len,m)))for i in zip(*m):    print(*i)

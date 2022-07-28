a, b = [], []for _ in range(int(input())):    l = list(map(int, input().split()))    a.append(l[0])    b.append(l[1])print(max(max(a) - min(a), max(b) - min(b)) ** 2)

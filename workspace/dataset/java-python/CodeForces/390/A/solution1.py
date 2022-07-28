n = int(input())x = []y = []for i in range(n):    xt, yt = list(map(int, input().split()))    x.append(xt)    y.append(yt)x = list(set(x))y = list(set(y)) print(min(len(x), len(y)))

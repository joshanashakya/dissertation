n = int(input())b = list(map(int, input().split()))s = [0]x = 0g = []for i in b:    x += 1    if i >= 1 and i - max(s) == 1:        g.append(2000 + x)        s.append(i)    else:        continues.remove(0)k = list(zip(g, s))h = []for p in range(len(k)):    h.append(k[p][0])if len(s) == 0:    print(0)else:    print(len(h))    print(*h)
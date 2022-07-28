k=int(input())l=[0]*10for i in range(4):    for j in input():        if (j != '.'):            l[int(j)] += 1for i in range(10):    if l[i] > k*2:        print("NO")        exit()print("YES")

n = int(input())lst = sorted(list(map(int, input().split())))t = int(input())ans = 1for i in range(len(lst) - 1):    temp = 1    k = i + 1    while k < len(lst) and lst[k] - lst[i] <= t:        temp += 1        k += 1    if temp > ans:        ans = tempprint(ans)

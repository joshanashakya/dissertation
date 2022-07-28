def cal(n):    s = 0    while n > 0:        s += (n%10)        n//=10    return s n = int(input())curr = 1while n > 0:    curr += 1    if cal(curr) == 10:        n -= 1print(curr)

for i in range(int(input())):    n = int(input())    items = list(map(int, input().split(" ")))    a = sum(items)    ans = a // n    if a % n != 0: ans += 1    print(ans)

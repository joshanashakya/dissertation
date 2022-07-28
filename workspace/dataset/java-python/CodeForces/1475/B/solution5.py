for _ in range(int(input())):    n = int(input())
for i in range(n // 2021 + 1):        if
not (n - 2021 * i) % 2020: print("YES")
break else:        print("NO")

n, m = map(int, input().split())a = {input() for _ in range(n)}b ={input() for _ in range(m)}u = len(a.intersection(b))print("NO") if m - u + u // 2 >= n - u + (u + 1) // 2 else print("YES")

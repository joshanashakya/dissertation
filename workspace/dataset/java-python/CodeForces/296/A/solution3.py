from collections import Counter n = int(input())x = list(map(int, input().split())) c = Counter(x)if 2 * max(c.values()) > n + 1:    print("NO")else:    print("YES")

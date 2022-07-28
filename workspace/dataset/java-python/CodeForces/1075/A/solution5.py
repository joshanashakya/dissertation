n = int(input())x, y = list(map(int, input().split()))wm = max(x-1, y-1)bm = max(n-x, n-y)print("Black" if bm < wm else "White")

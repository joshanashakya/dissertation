a, b, c = map(int, input().split())arr = sorted(map(int, input().split())) ans = arr[-b] - arr[c-1] print(ans)

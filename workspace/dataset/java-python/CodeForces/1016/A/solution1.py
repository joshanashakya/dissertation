n, m = map(int, input().split())arr = list(map(int, input().split()))curr = 0ans = []for n in arr:    curr += n    turned = curr//m    ans.append(turned)    curr %= m print(*ans)

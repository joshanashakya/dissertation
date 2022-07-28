n, m = map(int, input().split())right = list(map(int, input().split()))wrong = list(map(int, input().split()))ans = max(2 * min(right), max(right))print(-1) if min(wrong) <= ans else print(ans)

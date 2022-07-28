n = int(input())s = list(map(int, input().split()))c = n - s.count(max(s)) - s.count(min(s))print(c if c >= 0 else 0)

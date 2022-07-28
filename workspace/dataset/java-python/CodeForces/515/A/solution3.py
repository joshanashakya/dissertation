a, b, s = map(int, input().split())d = abs(a) + abs(b)print('Yes' if d <= s and d % 2 == s % 2 else 'No')

Max = -99999999999L
eader = '' for _ in range(int(input())):    handle, plus, minus, a, b, c, d, e = input().split()
plus, minus, a, b, c, d, e = map(int, [plus, minus, a, b, c, d, e])
score = plus * 100 - minus * 50 + a + b + c + d + e     if Max < score:        Max = score
Leader = handle print(Leader)

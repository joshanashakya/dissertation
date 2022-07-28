visitor = dict()for __ in range(int(input())):	h, m = map(int, input().split())	visitor[(h, m)] = visitor.get((h, m), 0) + 1print(max(visitor.values()))

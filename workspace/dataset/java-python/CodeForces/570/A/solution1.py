n, m = map(int, input().split()) wins = [0]*nfor _ in range(m):    t = list(map(int, input().split()))    winner = 0    for x in range(1, n):         if t[x] > t[winner]: winner = x     wins[winner] += 1 winner = 0for x in range(1, n):    if wins[x] > wins[winner]: winner = x print(winner+1)

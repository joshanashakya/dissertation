n = int(input())row = set()col = set()for _ in range(n):    a,b = list(map(int, input().split()))    row.add(a)    col.add(b)print(min(len(row),len(col)))

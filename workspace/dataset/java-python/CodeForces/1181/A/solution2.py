x, y, z = map(int, input().split())cnt = (x + y) // zif x % z + y % z < z:  given = 0else:  given = min(z- x % z, z- y % z)print(cnt, given)

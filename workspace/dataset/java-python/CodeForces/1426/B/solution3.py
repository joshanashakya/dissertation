p = lambda: list(map(int, input().split())) T = int(input())
for _ in range(T):    N, M = p()
tiles = [[p(), p()] for _ in range(N)]
if M & 1: print(
    "NO"); continue   # We need at least one symmetric 	# tile (for the main diagonal)	symm = False	for tile in tiles:		if tile[0][1] == tile[1][0]:			symm = True			break	print("YNEOS"[symm<1::2])

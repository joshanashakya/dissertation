p = lambda: list(map(int, input().split()))  T = int(input())
for _ in range(T):    N, M = p(); S = 0
a = [p() for _ in range(N)]
for i in range(N // 2):        for
j in range(M // 2): x, y = N - i - 1, M - j - 1
l = sorted([a[i][j], a[i][y], a[x][j], a[x][y]])
changeTo = round((l[2] + l[
    1]) / 2)  # changeTo = round(sum(l)/4)			S += sum([abs(n-changeTo) for n in l])	if M&1:		# Vertical thingies		for i in range(N//2):			l = [a[i][M//2], a[N-i-1][M//2]]			changeTo = round((l[1]+l[0])/2)			# changeTo = round(sum(l)/2)			S += sum([abs(n-changeTo) for n in l])	if N&1:		# Horizontal thingies		for i in range(M//2):			l = [a[N//2][i], a[N//2][M-i-1]]			changeTo = round((l[1]+l[0])/2)			# changeTo = round(sum(l)/2)			S += sum([abs(n-changeTo) for n in l])	print(S)

import sys n = int(input())
d = []
for i in range(n):    d.append(input())
ans = [] bad = 'No solution'
low = 1000
for date in d:    lowest = 100500
for i in range(10):        for
j in range(i == 0, 5): changed = date[:j] + str(i) + date[j + 1:]
if lowest > int(changed) >= low:                lowest = int(changed)
if lowest > 2011:        print(bad)
sys.exit(0)
ans.append(str(lowest))
low = lowest print('\n'.join(ans))

def to_int(s):
    return int(s)


ndm = list(map(to_int, input().split(' ')))

n = ndm[0]
d = ndm[1]
m = ndm[2]

values = list(map(to_int, input().split(' ')))

good = []
bad = []
for v in values:
    if v <= m:
        good.append(v)
    else:
        bad.append(v)

good.sort(reverse=True)
bad.sort(reverse=True)

goodSums = [0]
for i in good:
    goodSums.append(goodSums[-1] + i)

if len(bad) == 0:
    print(goodSums[-1])
    exit()

badSums = [0]
for i in bad:
    badSums.append(badSums[-1] + i)

sum = 0

minGood = n - ((len(bad) - 1) * (d + 1) + 1)
if minGood < 0:
    minGood = 0

for i in range(minGood, len(goodSums)):
    nLeft = n - i
    exceed = nLeft // (d + 1)
    if not nLeft % (d + 1) == 0:
        exceed += 1
    sum = max(sum, goodSums[i] + badSums[exceed])

print(sum)

from collections import Counter string1 = input()string2 = input() x1 = Counter(string1)x2 = Counter(string2) string1 = list(string1)string2 = list(string2)q = Counter()q['4'] = abs(x1['4'] - x2['4'])q['7'] = abs(x1['7'] - x2['7'])if q['4'] < q['7']:    w = '4'else:    w = '7'ans = 0dp = 0for i in range(len(string1)):    if string1[i] != string2[i]:        if q[w] > 0:            ans += 1            q[w] -= 1        else:            dp += 1dp //= 2print(ans + dp)

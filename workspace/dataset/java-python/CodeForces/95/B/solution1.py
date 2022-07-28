def run(n):
    l = len(n)
    if l % 2 == 1:
        result = '4' * (l // 2 + 1) + '7' * (l // 2 + 1)
        print(result)
        return result

    if n > ('7' * (l // 2) + '4' * (l // 2)):
        result = '4' * (l // 2 + 1) + '7' * (l // 2 + 1)
        print(result)
        return result

    def set_range(p, start, end, num):
        for i in range(start, end):
            p[i] = num

    result = [None] * l

    for i in range(l):
        d = int(n[i])
        if d < 4:
            set_range(result, i, l, '4')
            break
        elif d == 4:
            result[i] = '4'
        elif d < 7:
            result[i] = '7'
            set_range(result, i + 1, l, '4')
            break
        elif d == 7:
            result[i] = '7'
        else:
            k = i - 1
            while result[k] == '7':
                k -= 1
            result[k] = '7'
            set_range(result, k + 1, l, '4')
            break
    diff = (result.count('7') - result.count('4')) // 2
    if diff > 0:
        count = 0
        last_4 = -1
        for k in range(l):
            if result[k] == '7':
                count += 1
            if result[k] == '4':
                last_4 = k
            if count == l // 2:
                result[last_4] = '7'
                u = l // 2 - result[:last_4].count('4')
                set_range(result, last_4 + 1, last_4 + u + 1, '4')
                set_range(result, last_4 + u + 1, l, '7')
                break
    elif diff < 0:
        k = l - 1
        while diff != 0:
            if result[k] == '4':
                result[k] = '7'
                diff += 1
            k -= 1
    s = ''.join(result)
    print(s)
    return s


n = input()
run(n)

# luckynum = []
# for i in range(10000000):
# 	s = len(str(i))
# 	if s % 2 == 1:
# 		continue
# 	if str(i).count('4') == s // 2 and str(i).count('7') == s // 2:
# 		luckynum.append(i)
# print(luckynum[:10])

# for i in range(10000000):
# 	k = 0
# 	while (luckynum[k] < i):
# 		k += 1
# 	x = str(luckynum[k])
# 	y = run(str(i))
# 	print(i, x, y)
# 	assert(x == y)

def val(c):    if 'A' <= c <='Z':        return ord(c) - 65 + 10    else:        return int(c) def calc(h, b):    ans = 0    i = 0    for c in h[::-1]:        v = val(c)        ans += int(v) * (b**i)        i += 1    return ans  h, m = [x for x in input().split(":")] min_base = -1for c in h:    min_base = max(min_base, val(c)+1)for c in m:    min_base = max(min_base, val(c)+1) # print(min_base) answers = []while True:    hour = calc(h, min_base)    min = calc(m, min_base)    if hour > 23 or min > 59 or min_base > 60:        break     else:        answers.append(min_base)    min_base+= 1 if len(answers) == 0:    print(0)elif min_base > 60:    print(-1)else:    print(*answers)

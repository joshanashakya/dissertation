n = int(input())num = input()s = []for ch in num:    s.append(int(ch))s.sort()total = sum(s)if total >= n:    print(0)    exit()total = n - totali, count = 0, 1 while i < len(s):    if (9 - s[i]) < total:        total -= 9 - s[i]        count += 1        i += 1    else:        print(count)        exit()

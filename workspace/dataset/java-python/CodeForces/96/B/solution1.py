n = int(input())
l = [0]
i = 0
while True:
    t = l[i]
    if t >= n:
        if str(t).count('7') == str(t).count('4'):
            print(t);
            break
    l += [t * 10 + 4, t * 10 + 7]
    i += 1

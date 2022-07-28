a = int(input())
summa = 0
s = []
for i in range(a):
    h = int(input())
    summa += h
    s.append(h)

if (summa / a) != int(summa / a):
    print("Unrecoverable configuration.")
else:
    v = summa // a
    c = 0
    r = 0
    ans = []
    for i in range(a):
        if s[i] != v:
            c += 1
    if c > 2:
        print("Unrecoverable configuration.")
        exit(0)
    c = 0
    for i in range(a):
        if s[i] != v:
            if c == 0:
                c += 1
                r = v - s[i]
                ans.append(i + 1)
            elif c == 1:
                c += 1
                if abs(v - s[i]) != abs(r):
                    print("Unrecoverable configuration.")
                    exit(0)
                else:
                    if r > 0:
                        print(str(r) + " ml. from cup #" + str(ans[0]) + " to cup #" + str(i + 1) + ".")
                        exit(0)
                    else:
                        print(str(abs(r)) + " ml. from cup #" + str(i + 1) + " to cup #" + str(ans[0]) + ".")
                        exit(0)
            else:
                print("Unrecoverable configuration.")
                exit(0)
    if not c:
        print("Exemplary pages.")

for i in range(int(input())):
    s = input()
    a = sorted([len(i) for i in s.split('0')], reverse=True)
    s = 0
    for i in range(0, len(a), 2):
        s += a[i]
    print(s)

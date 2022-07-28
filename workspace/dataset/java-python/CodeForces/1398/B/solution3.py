t = int(input())
for _ in range(t):
    s = input()
    q = ""
    ali = []
    for i in range(len(s)):
        if (s[i] != "1"):
            if (len(q) != 0):
                ali.append(int(q))
            q = ""
        else:
            q += "1"
    if (len(q) != 0):
        ali.append(int(q))
    ali = sorted(ali, reverse=True)
    ans = 0
    for i in range(0, len(ali), 2):
        q = str(ali[i])
        ans += len(q)

    print(ans)

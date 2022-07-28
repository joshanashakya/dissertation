t = int(input())

while t:
    n = int(input())
    s = ""

    for i in range(0, n):
        s += str(input())

    s = sorted(s)
    c = True

    for i in range(ord(s[0]), ord(s[len(s) - 1]) + 1):
        if s.count(chr(i)) % n != 0:
            c = False
            break

    if c == True:
        print("YES")
    else:
        print("NO")

    t -= 1

n = int(input())
a = []
for i in range(n):
    a.append(input().rstrip())
w = list(input().rstrip())
c = input().rstrip()
m = len(w)
z = []
i = 0
while i < m:
    for j in range(n):
        if w[i].lower() == a[j][0].lower():
            if i + len(a[j]) <= m:
                f = 1
                for k in range(i, i + len(a[j])):
                    if w[k].lower() != a[j][k - i].lower():
                        f = 0
                        break
                if f:
                    if len(z) != 0:
                        if z[-1][1] >= i:
                            z[-1][1] = max(i + len(a[j]) - 1, z[-1][1])
                        else:
                            z.append([i, i + len(a[j]) - 1])
                    else:
                        z.append([i, i + len(a[j]) - 1])
    i += 1
for i in z:
    for k in range(i[0], i[1] + 1):
        if w[k].isupper():
            if w[k] != c.upper():
                w[k] = c.upper()
            else:
                if w[k] != "A":
                    w[k] = "A"
                else:
                    w[k] = "B"
        else:
            if w[k] != c.lower():
                w[k] = c.lower()
            else:
                if w[k] != "a":
                    w[k] = "a"
                else:
                    w[k] = "b"
print("".join(w))

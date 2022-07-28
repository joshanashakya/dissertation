n = int(input())

d = {}

for i in range(n):
    s = int(input())
    if s in d:
        d[s] += [i + 1]
    else:
        d[s] = [i + 1]

mx = max(d)
mn = min(d)
l = len(d)

if l == 1:
    print("Exemplary pages.")
    exit()
elif l == 2:
    if len(d[mx]) != 1 or len(d[mn]) != 1:
        print('Unrecoverable configuration.')
        exit()
    if (mx + mn) % 2:
        print("Unrecoverable configuration.")
        exit()
elif l == 3:
    if len(d[mx]) != 1 or len(d[mn]) != 1:
        print('Unrecoverable configuration.')
        exit()
    md = (set(d) - {mx, mn}).pop()
    if (mx + mn) / 2 != md:
        print("Unrecoverable configuration.")
        exit()
else:
    print("Unrecoverable configuration.")
    exit()

print((mx - mn) // 2, ' ml. from cup #', *d[mn], ' to cup #', *d[mx], '.', sep='')

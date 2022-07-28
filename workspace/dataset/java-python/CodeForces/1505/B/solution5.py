def croot(s):
    s = list(s)
    s = list(map(int, s))
    s = sum(s)
    return str(s)


s = input()
while len(s) > 1:
    s = croot(s)
print(s)

n = int(input())  # how many word
b = []
for i in range(n):
    b.append(input())  # put the word in a list
w = input()  # what we whant to change
let = input()  # which we change in to

bad = []
for i in range(len(w)):
    bad.append(True)
for i in range(len(w)):
    mx = 0
    for j in range(n):
        if w[i:].lower().startswith(b[j].lower()):
            mx = max(mx, len(b[j]))
    for j in range(mx):
        bad[i + j] = False

ans = ''
for i in range(len(w)):
    if bad[i]:
        ans += w[i]
    else:
        if w[i].lower() == let:
            newlet = 'a' if let != 'a' else 'b'
            ans += newlet.lower() if w[i].lower() == w[i] else \
                newlet.upper()
        else:
            if w[i].lower() == w[i]:
                ans += let
            else:
                ans += let.upper()

print(ans)

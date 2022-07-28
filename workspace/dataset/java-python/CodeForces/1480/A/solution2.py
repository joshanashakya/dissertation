for t in range(int(input())):    s = input()
r = ''
for i in range(len(s)):        if
i % 2 == 0:
if s[i] != 'a':
    r += 'a'            else:
    r += 'b' else:            if s[i] != 'z':
    r += 'z'            else:
    r += 'y'
print(r)

t = int(input())
for i in range(t):    s = list(map(str, input()))
for j in range(len(s)):        if
j % 2 == 0:
if s[j] == "a":
    s[j] = "b"            else:
    s[j] = "a" else:            if s[j] == "z":
    s[j] = "y"            else:
    s[j] = "z"
print(''.join(map(str, s)))     

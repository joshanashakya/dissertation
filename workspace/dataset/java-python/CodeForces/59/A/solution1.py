s = input()
countc = 0
counts = 0
for i in s:    if
    (ord(i) >= 97 and ord(i) <= 122): counts += 1 elif (ord(i) >= 65 and ord(i) <= 90): countc += 1
if (countc > counts):
    print(s.upper())else:
    print(s.lower())

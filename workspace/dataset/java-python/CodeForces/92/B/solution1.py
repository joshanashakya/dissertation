s = list(input()[::-1])
i = 0
l = len(s)
carry = False
c = 0

if s.count('1') == 1:
    print(l - 1)
    exit(0)

while i < l:
    if s[i] == '1':
        if not carry:
            c += 2
            i += 1
            carry = True
        else:
            s[i] = '0'
            c += 1
            i += 1
    else:
        if carry:
            s[i] = '1'
            carry = False
        else:
            c += 1
            i += 1

print(c)

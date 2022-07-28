n = input()
r = n.index('.')
if n[r - 1] == '9':
    print('GOTO Vasilisa.')
else:
    if n[r + 1] >= '5':
        print(int(n[:r]) + 1)
    else:
        print(n[:r])

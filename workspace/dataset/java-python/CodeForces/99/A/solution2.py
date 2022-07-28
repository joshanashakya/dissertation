n = input()
idx = n.index('.')

if n[idx - 1] == '9':
    print("GOTO Vasilisa.")
else:
    if n[idx + 1] < '5':
        print(n[:idx])
    else:
        print(int(n[:idx]) + 1)

a, b = input().split(".")

if a[-1] == "9":
    print("GOTO Vasilisa.")
else:
    if int(b[0]) < 5:
        print(int(a))
    else:
        print(int(a) + 1)

n = input()

ans = ""
capture_next = False
for char in n:
    if char == ".":
        capture_next = True

    elif capture_next:
        last_digit = char
        break

    else:
        ans += char

if ans[-1] == "9":
    print("GOTO Vasilisa.")
else:
    if int(last_digit) < 5:
        print(ans)

    else:
        s = ans[:-1] + str(int(ans[-1]) + 1)

        print(s)

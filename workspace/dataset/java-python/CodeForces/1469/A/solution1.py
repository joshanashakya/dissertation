for i in range(int(input())):    s = str(input())
n = len(s)
if n % 2 != 0:
    print("NO")    elif s[0] == ")" or s[n - 1] == "(":
    print("NO")    else:
    print("YES")

for _ in range(int(input())):    s = input()
n = len(s)
if n % 2 != 0 or s[0] == ')' or s[n - 1] == '(':
    print('No')    else:
    print('YEs')

valid = 'AHIMOTUVWXY' s = input() f = Truefor i in s:    if i not in valid:        f = False        break if s != s[::-1]:    f = False print("YES" if f else "NO")

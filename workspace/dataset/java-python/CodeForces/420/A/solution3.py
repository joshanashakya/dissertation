s = input()def solve(string):    for i in s:        if i not in "AHIMOTUVWXY":            return("NO")    if s[::-1] == s:        return("YES")    else:        return("NO")print(solve(s))

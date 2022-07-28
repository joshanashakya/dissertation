def solve(s):    if


    (s[0] == ")" or s[-1] == "(" or len(s) % 2):
return ("NO") else:        x = s.count("?")
if (x % 2 == 0):            return ("YES")
return ("NO")
for i in range(int(input())):    print(solve(input()))

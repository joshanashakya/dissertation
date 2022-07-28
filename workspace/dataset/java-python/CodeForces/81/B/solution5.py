from sys import stdin, stdoutfrom

math
import gcd, ceil, sqrtii1 = lambda: int(stdin.readline().strip())
is1 = lambda: stdin.readline().strip()
iia = lambda: list(map(int, stdin.readline().strip().split()))
isa = lambda: stdin.readline().strip().split()
mod = 1000000007 s = is1()
res = ""
for j, i in enumerate(s):    if
i == ',': res += ", " elif i.isdigit():
if s[j - 1] == " " and res[-1].isdigit():            res += " "
res += i elif i == ".":
if len(res) > 0 and res[-1] != " " and res[-1] != ".":            res += " "
if len(res) >= 3 and res[-1] == "." and res[-2] == '.' and res[-3] == '.':            res += " "
res += "." elif i == " ":
if len(res) > 0 and res[-1] not in "0123456789 .":            res += " "
print(res.strip())

dat = "".join([i for i in input() if i in "hello"]) + " "


def check(inp):    now = "hello"


for step in now:        if
step in inp: inp = inp[inp.index(step) + 1:] else: return "NO"
return "YES"
print(check(dat))

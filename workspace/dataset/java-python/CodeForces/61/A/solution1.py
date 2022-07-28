first = input()
second = input()  res = ""
for u, v in zip(first, second):    if
u == v: res += "0" else:        res += "1"
print(res)

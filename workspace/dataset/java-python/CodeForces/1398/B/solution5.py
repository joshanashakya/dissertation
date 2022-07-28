# import sys
# import math
# sys.stdout=open("python/output.txt","w")
# sys.stdin=open("python/input.txt","r")
t = int(input())
for i in range(t):
    s = input()
    l = list(s)
    c = 0
    s = 0
    new = []
    for i in range(len(l)):
        if l[i] == "1":
            c += 1
            if i == len(l) - 1:
                new.append(c)
                break
        else:
            new.append(c)
            c = 0
    new.sort(reverse=True)
    for i in range(0, len(new), 2):
        s += new[i]
    print(s)

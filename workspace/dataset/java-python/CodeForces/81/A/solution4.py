from collections import deque charlist = list(input())
n = len(charlist)
string = deque(charlist[n - 1])
charlist.pop()
n = len(charlist)
for i in reversed(range(0, n)):    if
    (len(string) == 0): string.append(charlist[i]) elif (string[-1] == charlist[i]): charlist.pop()
string.pop() else:        string.append(charlist[i]) print("".join(string)[::-1])            

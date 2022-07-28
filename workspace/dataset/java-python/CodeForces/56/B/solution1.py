n = int(input())
start, end = 0, 0
flag = 0l
s = list(map(int, input().split()))
for i in range(1, (n + 1)):    if
ls[i - 1] != i: start = i
breakfor
j in range(n, i - 1, -1):
if ls[j - 1] != j:        end = j
breakif
start == 0 and end == 0: flag = 1
print("0 0") else:    for i in range(start - 1, end - 1):        if
ls[i] < ls[i + 1]: print("0 0")
flag = 1
breakif
flag == 0: print(str(start) + " " + str(end))

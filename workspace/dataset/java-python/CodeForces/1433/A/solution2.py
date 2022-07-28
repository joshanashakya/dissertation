t = int(input())
ans = [] for _ in range(t):    s = input()
c = 1
start = '1'     while not (start == s):        if
int(start + start[0]) > 10000: start = str(int(start[0]) + 1)
c += len(start)
continue
start += start[0]
c += len(start)     ans.append(c) for i in ans:    print(i)

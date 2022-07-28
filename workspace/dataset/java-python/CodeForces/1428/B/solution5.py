T = int(input())
for _ in range(T):    N = int(input())
s = input()
c = N
if '<' not in s:
    print(N)    elif '>' not in s:
    print(N)    else:
    l = srt = s.index('>')
C = 0
for i in range(N):            r = s[(i + 1) % N]
if '-' in [s[i], r]:                C += 1
print(C)

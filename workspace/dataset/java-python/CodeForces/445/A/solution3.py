def answer(n, m, a):    ctr = 0    for s in a:        ans = []        for c in s:            if c == '.':                if ctr % 2 == 0:                    ans.append('B')                else:                    ans.append('W')            else:                ans.append('-')            ctr += 1        print(''.join(ans))        return def answer2(n, m, a):    for r in range(n):        ans = []        for c in range(m):            if (r+c) % 2 == 0 and a[r][c] == '.':                ans.append('B')            elif (r+c) % 2 == 1 and a[r][c] == '.':                ans.append('W')            else:                ans.append('-')        print(''.join(ans)) def main():    n, m = [int(i) for i in input().split()]    a = [0] * n    for j in range(n):        a[j] = input()    answer2(n, m, a)     returnmain()

# https://codeforces.com/problemset/problem/999/B n = int(input())s = input() for i in range(1, n + 1):     if n % i == 0:        temp = s[0: i]        s = temp[::-1] + s[i:n] print(s)

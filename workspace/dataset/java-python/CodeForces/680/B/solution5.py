# link: https://codeforces.com/contest/680/problem/Bif __name__ == "__main__":    n,a = list(map(int, input().split()))    criminals = list(map(int, input().split()))    if (a==1) or (a==n):        c = 0        for i in range(n):            if criminals[i] == 1:                c += 1        print(c)                else:        a = a - 1        m = min(a, (n-1-a))        if abs(a-m) == 0:            start = 0            end = a + m            c = 0            s = end            while start<=end:                if criminals[start] == 1  and criminals[end] == 1:                     c = c + 2                    start = start + 1                end = end - 1            if s+1<n:                        for i in range(s+1,n):                    if criminals[i] == 1:                        c += 1            if criminals[a] == 1:                print(c-1)            else:                print(c)              elif (a+m) == n-1:            start = abs(a-m)            end = n-1            c = 0            e = start            while start<=end:                if criminals[start] == 1 and criminals[end] == 1:                    c = c + 2                start = start + 1                end = end - 1            for i in range(0,e):                if criminals[i] == 1:                    c += 1            if criminals[a] == 1:                print(c-1)            else:                print(c)              
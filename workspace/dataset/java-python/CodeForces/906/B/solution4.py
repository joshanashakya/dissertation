import random n, m = map(int, input().split()) if n < 4 and m < 4 and not((n == 1 and m == 1) or (m == 3 and n == 3)): print("NO"); quit() pedy = [list() for i in range(n * m + 1)] for i in range(n * m):     if i % m != 0: pedy[i+1].append(i)     if i % m != m - 1: pedy[i + 1].append(i + 2)     if i >= m: pedy[i + 1].append(i - m + 1)     if i < (n - 1) * m: pedy[i + 1].append(i + m + 1) Arr = [x for x in range(1, n*m + 1)]; Arr = Arr[::2] + Arr[1::2]; pp = 0; s = "" while (not pp):     pp = 1;     for i in range(n):         for j in range(m):             if (i + 1 != n and Arr[i * m + m + j] in pedy[Arr[i * m + j]]) or (j + 1 != m and Arr[i * m + 1 + j] in pedy[Arr[i * m + j]]):                 pp = 0; break         if not pp: break     if not pp: random.shuffle(Arr) print("YES") for i in range(n):     for j in range(m):         s += str(Arr[i  * m + j]) + " "     print(s); s = ""     # Made By Mostafa_Khaled
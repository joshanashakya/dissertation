alpha = 'abcdefghijklmnopqrstuvwxyz' for _ in range(int(input())):    n, k = map(int, input().split())    fre = n//k    s = ''     for i in range(k):        s = s + fre*alpha[i]     for i in range(n - fre*k):        s = s + alpha[i]     print(s)

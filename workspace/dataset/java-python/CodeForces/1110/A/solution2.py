a, b = map(int, input().split())arr = list(map(int, input().split()))a = a%2ans = 0i = 1for n in arr:    x = n * a**(b-i)    ans += x    i += 1  if ans % 2 == 1:    print("odd")else:    print("even")

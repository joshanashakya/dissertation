for _ in range(int(input())):    n = input()
fx = n[::-1]
ffx = fx[::-1]
if int(ffx) == int(n):
    print(len(n))    else:
    print(len(fx))

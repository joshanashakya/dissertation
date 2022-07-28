def fun(x):    i = 1; ct = 0


while i < 32 and x > 0:        x -= (2 ** (i - 1)) * ((2 ** i) - 1)
i += 1;
ct += 1
return ct if x == 0 else ct - 1
for _ in range(int(input())):    x = int(input())     print(fun(x))

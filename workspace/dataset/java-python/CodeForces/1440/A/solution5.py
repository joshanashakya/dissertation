I = inputfor
_ in [0] * int(I()): n, c, d, h = map(int, I().split());
k = I().count('0');
print(min(a * (h - c + d) + b * (h + c - d) + k * (c - d) + n * dfor
a in (0, k)
for b in (0, n - k)))

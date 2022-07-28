_, s, _, *l = open(0)
a, b, *d = [0] * 7 ** 6
for s in s.split() + l: f = s[0] < '0';t = int(s[f:]);e = s[0] == '-';k = 1 - 2 * e;m = d[t] - e;d[
    t] += k;a += m % 2 * k;b += m % 4 // 3 * k;print('NYOE S'[a - 3 > 0 < b:f * 6:2])

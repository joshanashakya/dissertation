from operator import itemgetter
import functools as ft

if __name__ == '__main__':
    n = int(input())
    s = lambda v, a, b: "%s ml. from cup #%s to cup #%s." % (v, a, b)
    a, d, ans = list(), dict(), ["Exemplary pages.", "Unrecoverable configuration."]

    for i in range(n):
        k = int(input())
        a.append(k)
        d[k] = d.get(k, 0) + 1

    k, t = -1, 0
    d = sorted(d.items(), key=itemgetter(1))

    while k < n - 1 and d[k + 1][1] == 1:
        k += 1
        t += d[k][0]

    if len(d) == 1:
        print(ans[0])
    elif (len(d) == 2 or len(d) == 3) and k > 0:
        mx, mn = max(d[:k + 1]), min(d[:k + 1])
        if k == 1 and (k == len(d) - 1 and t % 2 == 0) or (
                k == len(d) - 2 and abs(mx[0] - d[k + 1][0]) + mn[0] == d[k + 1][0]):
            print(s(abs(mx[0] - mn[0]) // 2 if k == len(d) - 1 else abs(mx[0] - d[k + 1][0]), a.index(mn[0]) + 1,
                    a.index(mx[0]) + 1))
        elif k == 2 and k == len(d) - 1 and t // 3 == t - (mx[0] + mn[0]) and t - (mx[0] + mn[0]) == 2 * (
                mx[0] + mn[0]) - t:
            print(s(t - (mx[0] + mn[0]), a.index(mn[0]) + 1, a.index(mx[0]) + 1))
        else:
            print(ans[1])
    else:
        print(ans[1])

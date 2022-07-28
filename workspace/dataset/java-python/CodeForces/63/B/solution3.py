def solve(x, a):    a.sort()


c = 0
while a[0] != x:        for
i in range(len(a)):
if i != len(a) - 1:                if
a[i] != a[i + 1]: a[i] = a[i] + 1 else:                a[i] = a[
                                                                  i] + 1  # print(a)        c = c + 1    return c  for _ in range(1):    x = [int(x) for x in input().split()]    x = x[1]    a = [int(x) for x in input().split()]    print(solve(x, a))

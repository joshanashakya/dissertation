for case in range(int(input())):    c, s = [int(x) for x in input().split()]    mn = s // c    c2 = 0    if mn != 0:        c2 = s % c    else:        c2 = s     c -= c2    # print(c, c2, mn)     ans = c2 * (mn+1) * (mn+1) + c * mn * mn     print(ans)

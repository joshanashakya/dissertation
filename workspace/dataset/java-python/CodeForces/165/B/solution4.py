def geo_sum(v, k):    res = 0    aux = v    while aux:        res +=  aux        aux //= k    return res def find_v(n, k):    st, end = 1, n    while st < end:        mid = (st + end)//2        s = geo_sum(mid, k)        if s == n:            return mid        if s < n:            st = mid + 1        else:            end = mid    return end def solve():    n, k = map(int, input().split())    v = find_v(n, k)    print(v) if __name__ == '__main__':    solve()
if __name__ == '__main__':    Y = lambda: list(map(int, input().split()))    P = lambda: map(int, input().split())     n, m = P()    c = [0]*n     while m > 0:        a = Y()        c[a.index(max(a))] += 1        m -= 1    print(c.index(max(c)) + 1)
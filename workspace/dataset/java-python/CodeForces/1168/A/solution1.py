import sys  def input():    return sys.stdin.readline().rstrip()  def slv():    n, m = map(int, input().split())    a = list(map(int, input().split()))     def minimum(K, v, lower_bound):        if v >= lower_bound:            if m + lower_bound - v <= K:                return lower_bound            else:                return v        else:            if lower_bound - v >= K:                return v + K            else:                return lower_bound     def possible(K):        if K < 0:            return False        V = 0        for v in a:            nextV = minimum(K, v, V)            if V <= nextV:                V = nextV            else:                return False        return True     l = -1    r = m * m + 10    while r - l > 1:        med = (r + l)//2        if possible(med):            r = med         else:            l = med    print(r)    return  def main():    t = 1    for i in range(t):        slv()    return  if __name__ == "__main__":    main()
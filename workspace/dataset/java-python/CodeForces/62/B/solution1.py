# https://codeforces.com/problemset/problem/62/B# bin search  def search(val):    l = 0    r = 1     while l <= r:        pass  def calc_f(arr, val):    n = len(arr)     l = 0    r = n - 1    last_less = False     while l <= r:        m = l + (r - l) // 2         if arr[m] < val:            l = m + 1            last_less = True        elif arr[m] > val:            r = m - 1            last_less = False        else:            return abs(val - arr[m])     if last_less:        nearest = l, l - 1    else:        nearest = r, r + 1     min_diff = 10**6    for v in nearest:        if 0 <= v < n:            min_diff = min(min_diff, abs(val - arr[v]))     return min_diff  def main():    n = int(input().split()[0])    s = input()     d = {}    for i, char in enumerate(s):        arr = d.get(char, [])        arr.append(i)        d[char] = arr     for i in range(n):  # 2 * 10^5 max str length for all potential strings        c = input()        nc = len(c)         f = 0        for j, char in enumerate(c):            if char not in d:                f += nc            else:                f += calc_f(d[char], j)         print(f)  if __name__ == '__main__':    main()
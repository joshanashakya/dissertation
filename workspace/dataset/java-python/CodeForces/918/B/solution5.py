if __name__ == "__main__":    n,m = list(map(int,input().split()))    d = {}    while n:        s = input().split(" ")        d[s[-1] + ';'] = s[0]        n = n - 1    while m:        ss = input()        print( ss.split(" ")[0] + ' '+ss.split(" ")[-1] + ' #' + d[ss.split(" ")[-1]] )        m = m - 1    
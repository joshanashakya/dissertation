for _ in range(int(input())):    a,b = map(int, input().split())    low = b//a    hg = b%a    res = (a-hg)*low**2 + hg*(low+1)**2    print(res)

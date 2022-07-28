n,m,k = map(int, input().split())cells = 0for i in range(0, k):    cells += 2*(m+n -2- i*(8))print(cells)

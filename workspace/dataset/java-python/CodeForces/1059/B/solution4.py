n, m = map(int, input().split())tab = []mat = [] for _ in range(n):    tab.append(list(input())) for i in range(n):    mat.append(list(['.']*m)) n -= 2m -= 2 for i in range(n):    for ii in range(m):        if (tab[i][ii] == '#' and tab[i+1][ii] == '#' and tab[i+2][ii] == '#' and tab[i+2][ii+1] == '#' and tab[i+2][ii+2] == '#' and tab[i+1][ii+2] == '#' and tab[i][ii+2] == '#' and tab[i][ii+1] == '#'):            mat[i][ii] = '#'            mat[i+1][ii] = '#'            mat[i+2][ii] = '#'            mat[i+2][ii+1] = '#'            mat[i+2][ii+2] = '#'            mat[i+1][ii+2] = '#'            mat[i][ii+1] = '#'            mat[i][ii+2] = '#' print('YES' if (tab == mat) else 'NO')

n, m = map(int, input().split())mat = []cor = [] for _ in range(n):    mat.append(input()) for i in range(n):    for j in range(m):        if mat[i][j] == '*':            cor.append((i, j)) if cor[0][1] == cor[1][1]:  # Right Top Corner Missing    print(cor[0][0] + 1, cor[2][1] + 1)elif cor[0][1] == cor[2][1]:  # Left Top / Right Bottom Corner Missing    if cor[0][0] == cor[1][0]:  # Right Bottom Corner Missing        print(cor[2][0] + 1, cor[1][1] + 1)    else:  # Left Top Corner Missing        print(cor[0][0] + 1, cor[1][1] + 1)else:  # Left Bottom Corner Missing    print(cor[2][0]+1, cor[0][1]+1)
x, y = map(int, input().split())m = int(input()) MOD = int(1e9+7) def matrix_multi(a, b):    n = len(a)    c = [[0]*n for _ in range(n)]    for i in range(n):        for j in range(n):            for k in range(n):                c[i][j] = (c[i][j] + a[i][k]*b[k][j]) % MOD    return c def fast_power(a, k):    if k == 1:        return a    tmp = fast_power(a, k//2)    if k % 2:        return matrix_multi(matrix_multi(tmp, tmp), a)    else:        return matrix_multi(tmp, tmp) base_matrix = [[1, -1], [1, 0]] if m == 1:    print((x+MOD)%MOD)elif m == 2:    print((y+MOD)%MOD)else:    ans_matrix = fast_power(base_matrix, m-2)    print((y*ans_matrix[0][0] + x*ans_matrix[0][1] + MOD) % MOD)

n = int(input())matrix = [[1 for i in range(n)] for j in range(n)]for i in range(1,n):    for j in range(1,n):        matrix[i][j] = matrix[i-1][j]+matrix[i][j-1]print(matrix[n-1][n-1])

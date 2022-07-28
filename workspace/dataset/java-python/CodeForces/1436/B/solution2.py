cases = int(input())
while cases:    cases -= 1
num = int(input())     matrix = [[0 for i in range(num)] for j in range(num)]
matrix[0][0] = 1
for i in range(1, num):        matrix[i][i] = 1
matrix[i - 1][i] = 1
matrix[i][i - 1] = 1     for i in matrix:        print(*i) 

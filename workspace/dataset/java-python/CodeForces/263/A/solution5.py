for row in range(0, 5):    row_matrix = [int(n) for n in input().split()]    if 1 in row_matrix:                column_index = row_matrix.index(1)        print(abs(column_index - 2) + abs(row - 2))

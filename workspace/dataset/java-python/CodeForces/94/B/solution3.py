def createMatrix(rowCount, colCount, dataList):
    mat = []
    for i in range(rowCount):
        rowList = []
        for j in range(colCount):
            # you need to increment through dataList here, like this:
            rowList.append(dataList[rowCount * i + j])
        mat.append(rowList)

    return mat


def check_range(friends_mat):
    # Look for either three people that know each other or three that do not
    for i in range(2, 5):
        for j in range(0, i):
            for k in range(0, j):
                # If a knows b and b knows c, a knows c
                if (friends_mat[i][j] == 1 and friends_mat[i][k] == 1 and friends_mat[k][j] == 1) or (
                        friends_mat[i][j] == 0 and friends_mat[i][k] == 0 and friends_mat[k][j] == 0):
                    return True
    return False


# Create the adjacence matrix
alpha = [0] * 25
friends_relations = createMatrix(5, 5, alpha)

n = int(input())
# Filling relations
while n:
    A = list(map(int, input().split()))
    row = A[0]
    col = A[1]
    # Bi directional relation
    friends_relations[row - 1][col - 1] = 1
    friends_relations[col - 1][row - 1] = 1
    n -= 1

if check_range(friends_relations):
    print("WIN")
else:
    print("FAIL")

def canVisitCol(visitY, x, y):
    visitY -= 1
    visitY %= (m)
    # if visitY<m and visitY>=0 and board[x-1][visitY]==0:
    # 	return 1
    # print(">>",visitY)
    if board[x - 1][visitY] == 0:
        board[x - 1][visitY] = 1
        return visitY + 1
    return 0


def canVisitRow(visitX, x, y):
    visitX -= 1
    visitX %= (n)
    # print(">",visitX)
    # if visitX<n and visitX>=0 and board[visitX][y-1]==0:
    # 	return 1
    if board[visitX][y - 1] == 0:
        board[visitX][y - 1] = 1
        return visitX + 1
    return 0


n, m, iniX, iniY = map(int, input().split())

board = []
for _ in range(n):
    board.append([0] * m)

currX = iniX;
currY = iniY
board[currX - 1][currY - 1] = 1
print(currX, currY)
while True:
    # print(board)
    tmp = canVisitCol(currY + 1, currX, currY)
    if tmp:
        currY = tmp
        print(currX, currY)
        continue

    tmp = canVisitCol(currY - 1, currX, currY)
    if tmp:
        currY = tmp
        print(currX, currY)
        continue

    tmp = canVisitRow(currX + 1, currX, currY)
    if tmp:
        currX = tmp
        print(currX, currY)
        continue

    tmp = canVisitRow(currX - 1, currX, currY)
    if tmp:
        currX = tmp
        print(currX, currY)
        continue

    else:
        break

import sysimport mathimport bisect def query(A, x, y):    n = len(A)    m = len(A[0])    if x >= 0 and x + 1 < n and y >= 0 and y + 1 < m:        cnt = 0        if A[x][y] == 1:            cnt += 1        if A[x][y+1] == 1:            cnt += 1        if A[x+1][y] == 1:            cnt += 1        if A[x+1][y+1] == 1:            cnt += 1        if cnt == 4:            return True    return False def main():    n, m, q = map(int, input().split())    A = []    for i in range(n):        A.append([0] * m)    ans = 0    for i in range(q):        x, y = map(int, input().split())        x -= 1        y -= 1        if A[x][y] == 0:            A[x][y] = 1            if query(A, x - 1, y - 1):                ans = i + 1                break            if query(A, x - 1, y):                ans = i + 1                break            if query(A, x, y - 1):                ans = i + 1                break            if query(A, x, y):                ans = i + 1                break        '''        print('x: %d, y: %d' % (x, y))        for j in range(n):            print('A[%d]: %s' % (j, str(A[j])))        '''    print(ans) if __name__ == "__main__":    main()
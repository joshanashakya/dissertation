import sysfrom collections import Counterdef fmax(n,m,a):    c = [0]*m    b = [0]*n     if n ==3*m:        for i in range(n//3):            for j in range(3):                b[a[i][j]-1]= j+1                    for i in range(m):        flag =1        for j in range(3):            if  b[a[i][j]-1] != 0 :                index = b[a[i][j]-1]                if j==0 and index==1:                    continue                b[a[i][index-1]-1] = j+1                continue            b[a[i][j]-1] = j+1                 return b                   if __name__ == '__main__':        input = sys.stdin.read()    data = list(map(int, input.split()))    n = data[0]    m = data[1]    l = 0    a = []    for i in range(m):        a.append(list(map(int,(data[l+2:l+5]))))        l = l+3            print(*fmax(n,m,a))
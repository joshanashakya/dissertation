if __name__ == '__main__':    n = int(input())    x = [list(input()) for i in range(n)]    y = [['.' for j in range(n)] for i in range(n)]     error = False    for i in range(n):        for j in range(n):            if x[i][j] == '.' and y[i][j] == '.':                continue            elif x[i][j] == '.' and y[i][j] == '#':                error = True                break            elif x[i][j] == '#' and y[i][j] == '.':                if j == 0 or j == n - 1 or i > n - 3 or (                    y[i][j] == '#' or y[i + 1][j - 1] == '#' or y[i + 1][j] == '#' or y[i + 1][j + 1] == '#' or                    y[i + 2][j] == '#'                ):                    error = True                    break                else:                    y[i][j] = '#'                    y[i + 1][j - 1] = '#'                    y[i + 1][j] = '#'                    y[i + 1][j + 1] = '#'                    y[i + 2][j] = '#'     if not error:        print('YES')    else:        print('NO') 		    		  		  	  	   		   	 	
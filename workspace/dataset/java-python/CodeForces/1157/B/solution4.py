def solve(n, x, f):    start = None    end = None    for i in range(n):        if start is None:            if f[int(x[i])] > x[i]:                start, end = i, i        if start is not None:            if f[int(x[i])] < x[i]:                break            end = i    if start is None:        return x    # print('start:', start)    # print('end:', end)    return ''.join([x[i] if i < start or i > end else f[int(x[i])] for i in range(n)]) if __name__ == '__main__':    n = int(input())    x = input()    f = ['0', *input().split()]    print(solve(n, x, f)) 				       				 				     	  			

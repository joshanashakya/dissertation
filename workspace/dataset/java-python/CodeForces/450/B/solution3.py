def rec(x, y, n):    if n == 1:        return x    if n == 2:        return y    #n >= 3    if n == 3:        return (y-x)    # >= 4    return rec(x, y, (n-1)) - rec(x, y, (n-2))    return def answer(x, y, n):    #    #print('ans=', ans)    n = ((n-1) % 6) + 1    ans = rec(x, y, n)    return ans def main():    x, y = [int(i) for i in input().split()]    n = int(input())    print(answer(x, y, n) % (10**9 + 7))      returnmain()
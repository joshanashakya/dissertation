n = int(input())ans = [-1]n += 1while n > 0:    n += 1    add = min(n,1000000)    ans.append(add)    n -= addprint(len(ans))for i in ans:    print(i,end=" ")print()

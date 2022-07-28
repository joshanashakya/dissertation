import mathdef

getint():
return [int(i) for i in input().split()]


def getstr():    return [str(i) for i in
                         input().split()]  # --------------------------------------------------------------------------def solve():    n=int(input())    string=input()    ans=""    for i in string:        if i in "trygu":            ans+=i        else:            print(i,end="")    print(ans)#--------------------------------------------------------------------------for _ in range(int(input())):    solve()

from collections import Counterimport math def solve():    n=int(input())    return int(math.ceil(n/2)-1) for i in range(int(input())):    print(solve())

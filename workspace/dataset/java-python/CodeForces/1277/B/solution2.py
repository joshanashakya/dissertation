for _ in range(int(input())):    input()    l=list(map(int,input().split()))    s=set()    for x in l:        while x%2==0 and x not in s:            s.add(x)            x//=2    print(len(s))

def solve():        first = input()    second = input()     pos = 0     for i in second:        if i == first[pos]:            pos += 1     print(pos + 1) #t = int(input())t = 1while t:    solve()    t -= 1
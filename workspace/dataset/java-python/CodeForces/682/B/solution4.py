n = int(input())w = list(map(int,input().split()))w.sort()ans = 1for i in w:    ans += i >= ansprint(ans)  

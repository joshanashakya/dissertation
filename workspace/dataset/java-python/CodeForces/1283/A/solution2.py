def solution(h, m):    return ((23 - h) * 60)+(60 - m) t = int(input())while t:    t = t - 1    h, m = map(int, input().split())    print(solution(h, m))

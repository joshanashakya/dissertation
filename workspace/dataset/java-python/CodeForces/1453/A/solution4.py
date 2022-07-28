t = int(input()) for tc in range(t):    n, m = map(int, input().split())
bottom = [int(b) for b in input().split()]
left = [int(l) for l in input().split()]     print(len(bottom + left) - len(set(bottom + left))) 

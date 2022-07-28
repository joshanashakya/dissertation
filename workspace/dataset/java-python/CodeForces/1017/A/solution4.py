n = int(input())l = []for i in range (0,n):    E,G,M,H = map(int, input().strip().split())    l.append(E+ G+ M+H) jh = l[0]l.sort(reverse=True)print(l.index(jh) + 1)

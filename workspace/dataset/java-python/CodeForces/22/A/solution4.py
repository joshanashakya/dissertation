n=int(input())m=(sorted(list(set(map(int,input().strip().split())))))[:n]print(m[1] if len(m)>1 else "NO")

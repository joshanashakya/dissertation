a, b = map(int,input().strip().split())c = input().strip().split()d = input().strip().split()e = int(input().strip())for i in range(e):    f = int(input().strip())    print(c[((f-1))%a]+d[(f-1)%b])

distance=lambda x: (x.find('S')-x.find('G'))def main():    n,m=map(int,input().split())    s={distance(input()) for i in range(n)}    if min(s)<0: print(-1)    else: print(len(s))main()

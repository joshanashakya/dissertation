import sysfrom os import pathif (path.exists('input.txt') and path.exists('output.txt')):    sys.stdout = open('output.txt', 'w')    sys.stdin = open('input.txt', 'r')  def main():    N, D = map(int, input().split())    times = list(map(int, input().split()))    crack = 0    for i in range(N):        if i < N - 1:            D -= times[i] + 10            crack += 2        else:            D -= times[i]            crack += D // 5     if D < 0:        print(-1)    else:        print(crack)   main()

import sys  def input():    return sys.stdin.readline().rstrip()   INF = 1 << 64  def filter(ord, M):    if (1 << ord) <= M:        return min(M - (1 << ord) + 1, (1 << ord))     else:        return 0  def slv():    d, mod = map(int, input().split())    K = d.bit_length() - 1    DP = [[0]*(K + 1) for i in range(K + 1)]    for i in range(K + 1):        DP[0][i] = filter(i,d)    for i in range(1,K + 1):        #DP[i] <- DP[i - 1]        for bit in range(K + 1):            if bit == 0:                if i == 0:                    DP[i][bit] = 1            else:                for last_bit in range(bit):                    DP[i][bit] += DP[i - 1][last_bit]*filter(bit,d)                DP[i][bit] %= mod     ans = sum(DP[i][j] for i in range(K + 1) for j in range(K + 1))    ans %= mod     print(ans)       return  def main():    t = int(input())    for i in range(t):        slv()    return  if __name__ == "__main__":    main()

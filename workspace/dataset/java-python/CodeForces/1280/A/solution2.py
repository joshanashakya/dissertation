import sys  def input():    return sys.stdin.readline().rstrip()  MOD = int(1e9 + 7)  def slv():    x = int(input())    gen = list(input())    gen = list(map(int, gen))    S = gen.copy()    ans = len(S)    for op in range(x):        if len(S) > x:            rep = S[op]            ans = (ans - (op + 1)) * rep + (op + 1)            ans %= MOD        else:            rep = S[op]            L = len(S)            for _ in range(rep - 1):                for i in range(op + 1,L):                    S.append(S[i])            ans = len(S)        #print("op,ans : ",op,ans)    print(ans % MOD)    return  def main():    t = int(input())    for i in range(t):        slv()    return  if __name__ == "__main__":    main()

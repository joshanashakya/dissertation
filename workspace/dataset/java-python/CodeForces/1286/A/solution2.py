import sysfrom array import array  # noqa: F401import typing as Tp  # noqa: F401  def input():    return sys.stdin.buffer.readline().decode('utf-8')  def output(*args):    sys.stdout.buffer.write(        ('\n'.join(map(str, args)) + '\n').encode('utf-8')    )  def main():    n = int(input())    a = list(map(int, input().split()))    odd_rem = len([i for i in range(1, n + 1, 2) if i not in a])    zero_cnt = a.count(0)     dp = [[[10**6] * 2 for _ in range(odd_rem + 1)] for _ in range(n)]     if a[0] == 0:        if zero_cnt > odd_rem:            # put even            dp[0][odd_rem][0] = 0        if odd_rem > 0:            # put odd            dp[0][odd_rem - 1][1] = 0         zero_cnt -= 1    else:        dp[0][odd_rem][a[0] & 1] = 0     for i in range(1, n):        is_zero = a[i] == 0        parity = a[i] & 1        for j in range(min(odd_rem, zero_cnt) + 1):            for k in range(2):                if not is_zero:                    dp[i][j][parity] = min(                        dp[i][j][parity],                        dp[i - 1][j][k] + (1 if parity != k else 0)                    )                else:                    if zero_cnt > j:                        # put even                        dp[i][j][0] = min(                            dp[i][j][0],                            dp[i - 1][j][k] + (1 if k == 1 else 0)                        )                    if j > 0:                        # put odd                        dp[i][j - 1][1] = min(                            dp[i][j - 1][1],                            dp[i - 1][j][k] + (1 if k == 0 else 0)                        )         if is_zero:            zero_cnt -= 1     print(min(dp[-1][0]))  if __name__ == '__main__':    main()

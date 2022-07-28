from sys import stdin, stdout

input = stdin.readline


def main():
    # t = int(input())
    t = 1
    for i in range(t):
        n = int(input())
        # n1, n2, k1, k2 = map(int,input().split())
        ai = list(map(int, input().split()))
        ans = sum(ai) - n
        if n > 33:
            print(ans)
            return
        base = 2
        num = 10 ** 10 * 5
        ai.sort()
        while base ** (n - 1) < num:
            ans = min(ans, sum([abs(ai[i] - base ** i) for i in range(n)]))
            base += 1
        print(ans)


main()

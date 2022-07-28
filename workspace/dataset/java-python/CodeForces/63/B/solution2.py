from collections import Counter if __name__ == '__main__':    cin = input
n, k = map(int, cin().split())
d, cnt = Counter([int(i) for i in cin().split()]), 0
while d[k] < n:        for
i in range(k - 1, 0, - 1):
if d[i]:                d[i + 1] += 1
d[i] -= 1
cnt += 1
print(cnt)

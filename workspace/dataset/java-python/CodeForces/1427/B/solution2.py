for _ in range(int(input())):    n, k = map(int, input().split())
s = input()
lnth = sorted(map(len, s.strip('L').split('W')), reverse=True)
m = len(lnth) + k - 1
while lnth and lnth[-1] <= k:        k -= lnth.pop()
print((2 * min(n, m) - len(lnth) or 1) - 1)    

n = int(input())a = []while n > 0:    a.append(n%10)    n //= 10print(max(a))n = [0, ]*max(a)for i in range(len(a)):    for j in range(a[i]):        n[j] += (10**i)print(*n)

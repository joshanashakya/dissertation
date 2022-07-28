n, k = list(map(int, input().split()))a = list(map(int, input().split()))temp = max(a)ans = 0while sum(a)/len(a) < (k - 0.5):#     print(sum(a)/len(a) < (k - 0.5))    a.append(k)    ans +=1print(ans)

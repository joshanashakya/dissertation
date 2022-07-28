n = int(input())a = list(map(int, input().split()))mxi = a.index(max(a))a.reverse()mni = n-1-a.index(min(a))res = mxi + n-1-mniif mxi > mni: res -= 1print(res)

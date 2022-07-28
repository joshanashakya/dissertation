n = int(input())s = input()cnt = {}for x in s:  cnt[x] = cnt.get(x, 0) + 1ans = min(cnt.get('L', 0), cnt.get('R', 0)) + min(cnt.get('U', 0), cnt.get('D', 0))print(ans * 2)

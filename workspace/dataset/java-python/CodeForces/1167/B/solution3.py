from math import gcdans = []print('? 1 2', flush=True)a = int(input())print('? 1 3', flush=True)b = int(input())print('? 1 4', flush=True)c = int(input())print('? 1 5', flush=True)d = int(input())ans.append(gcd(gcd(a, b), gcd(c, d)))if ans[0] in [2 * 15, 2 * 23]:    ans[0] //= 2ans.append(a // ans[0])ans.append(b // ans[0])ans.append(c // ans[0])ans.append(d // ans[0])ans.append([x for x in [4, 8, 15, 16, 23, 42] if x not in ans][0])print('!', *ans)

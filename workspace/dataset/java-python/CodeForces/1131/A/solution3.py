w1, h1, w2, h2 = map(int, input().split()) ans = w1 + 4ans += (w1 - w2)ans += h1 * 2ans += h2 * 2ans += w2print(ans)

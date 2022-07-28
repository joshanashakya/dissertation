n = int(input())
if 1 <= n <= 100:    for
i in range(n): words = input()
if len(words) > 10:
    print(words[0] + str(len(words) - 2) + words[-1])        else:
    print(words)

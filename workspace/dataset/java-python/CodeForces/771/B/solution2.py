'''input8 3NO NO YES YES YES NO'''n, k = map(int, input().split())s = input().split()names = [chr(ord('A') + (i // 26)) + chr(ord('a') + (i % 26))         for i in range(1, n + 1)]for i in range(len(s)):    if(s[i] == 'NO'):        names[i + k - 1] = names[i]for name in names:    print(name, end=' ')

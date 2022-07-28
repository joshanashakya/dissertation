n = int(input())string = ''.join(map(str, input().split()))maxx = 0for i in range(n+1):    maxx = max(maxx, string[:i].count('0')+string[i:].count('1'))print(maxx)

s = input()k = int(input())w = list(map(int, input().split()))fs=0for i in range(len(s)):    fs+=w[ord(s[i])-97]*(i+1)m=max(w)for i in range(len(s),len(s)+k):    fs+=m*(i+1)print(fs)

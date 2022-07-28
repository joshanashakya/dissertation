n = str(input())t = [0]*(len(n))j = 0for i in range(len(n)):  t[j] = n[len(n) - 1] + n[:len(n) - 1]  n = t[j]  j+=1x = set(t)print(len(x))  

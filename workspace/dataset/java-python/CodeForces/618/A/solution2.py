n = int(input())x = bin(n)[2:]ll = len(x)res = []for i in range(ll):    if x[i] == "1":        res.append(str(ll - i))print(" ".join(res))

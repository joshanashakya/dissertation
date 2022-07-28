n,k = map(int,input().split()) alphabet= "abcdefghijklmnopqrstuvwxyz" rep='' seq = alphabet[:k] for i in range(n):    rep+=seq[i%k] print(rep)

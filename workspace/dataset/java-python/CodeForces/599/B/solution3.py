from collections import Counter n,m = map(int,input().split())F = list(map(int,input().split()))B = list(map(int,input().split()))x = Counter(F)y = Counter(B)ok = Trueambi = Falseres = []for i in y.keys():  if x[i] == 0:    ok = False  if x[i]>=2:    ambi = Trued = dict()for i in range(len(F)):  if F[i] in d.keys():    continue  else:    d[F[i]] = i+1  if ok == False:  print("Impossible")elif ambi == True:  print("Ambiguity")else:  print("Possible")  res = []  for i in range(len(B)):    res.append(d[B[i]])  print(*res)
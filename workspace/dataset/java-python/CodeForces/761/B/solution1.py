n,L = map(int,input().split())kefa = list(map(int,input().split()))sasha = list(map(int,input().split()))def check(kefa,sasha):  X = [(kefa[i]-sasha[i] + L)%L for i in range(n)]  if len(set(X)) == 1:    return True  else:    return Falsedef rotate(arr, n):     x = arr[n - 1]           for i in range(n - 1, 0, -1):         arr[i] = arr[i - 1]              arr[0] = x    return arrok = Falsefor l in range(n+1):    sasha = rotate(sasha,n)  if check(kefa,sasha) == True:    ok = Trueif ok == True:  print("Yes")else:  print("No")
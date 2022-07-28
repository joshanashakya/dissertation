T, S, q = map(int, input().split())s = S*qcounter = 1while s < T:    s*=q    counter +=1print(counter)

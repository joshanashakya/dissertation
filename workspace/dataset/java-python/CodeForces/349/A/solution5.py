n = int(input())L = [int(X) for X in input().split()]fifty,tfive = (0,0)flag = 0for X in L:    if X == 25:        tfive += 1            elif X == 50:        fifty += 1        if tfive == 0:            flag = 1            break        else:            tfive -= 1     else:        if (fifty == 0 and tfive < 3) or tfive == 0 :            flag = 1            break        elif tfive > 0 and fifty > 0:            tfive -= 1            fifty -= 1        elif fifty == 0 and tfive > 2:            tfive -= 3 if flag == 0:    print("YES")else:    print("NO")
a, b, c = map(int, input().split()) if c < a:    print("NO")else:    # c -=?a     if (c-a) % b <2 and c-a != 1:        print("YES")    else:        print("NO")   

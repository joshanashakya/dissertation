 n = int(input())indices_str = input().split() indices = [] for i in range(n):    indices.append(int(indices_str[i])) mayor = indices[0]menor = indices[0] for i in range(n-1):    if indices[i+1] > mayor:        mayor = indices[i+1]    if indices[i+1] < menor:        menor = indices[i+1]    if menor != 1:    print(1)elif mayor == n:    print(n+1)else:    for i in range(mayor-1):        if not (i+1) in indices:            print(i+1)            break;
na, nb = map(int, input().split())a, b = map(int, input().split())arr_a = list(map(int, input().split()))arr_b = list(map(int, input().split())) if arr_a[a-1] < arr_b[-b]:    print("YES")else:    print("NO")  

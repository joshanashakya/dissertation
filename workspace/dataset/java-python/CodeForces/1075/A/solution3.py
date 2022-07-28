n = int(input())x, y = map(int, input().split())min = x if x < y else ymax = x if x > y else yif min-1 <= n-max :  print("White")else :  print("Black")

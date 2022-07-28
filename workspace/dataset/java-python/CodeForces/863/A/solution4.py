string = input()while string[-1] == '0': string = string[:len(string) - 1]if string == string[::-1]:  print("YES")else:  print("NO")

def change(a: str):    a = a.upper()    a = a.replace("O", "0")    a = a.replace("L", "1")    a = a.replace("I", '1')     return a #везде будет 0     a = change(input()) flag = True for _ in range(int(input())):    b = change(input())     if a == b:        flag = False print("Yes" if flag else "No")
a = input()
b = input() a_no_zeros = a.replace("0", "")
b_no_zeros = b.replace("0", "") add = str(int(a) + int(b))
add_no_zeros = str(int(a_no_zeros) + int(b_no_zeros)) if (add_no_zeros == add.replace("0", "")):
    print("YES")else:
    print("NO")

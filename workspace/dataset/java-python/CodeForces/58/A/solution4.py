import re;

x = input()
x.lower()
if re.search("h.*e.*l.*l.*o", x):
    print("YES")else:
    print("NO")

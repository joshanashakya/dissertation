def rec(n, z, l, x, y):    if


n > z:
return l elif n == z: l.append(n)
return l else:        if n not in l:            l.append(n)
rec(n * x, z, l, x, y)
rec(n * y, z, l, x, y)  

def gcd(x, y):    if


x < y: x, y = y, x
if y == 0:        return x
return gcd(y, x % y)  

def lcm(x, y):    if


x < y: x, y = y, x
gcd_ = gcd(x, y)
return x * y // gcd_  

def main_func():    output_list = []


t = int(input())
for i in range(t):        n = int(input())
r = input()
b = input()
count_r = 0
ountb = 0
for i in range(len(r)):            if
int(r[i]) > int(b[i]): count_r += 1
if int(r[i]) < int(b[i]):
    ountb += 1            else:
    ountb += 1
count_r += 1
if count_r > ountb:
    output_list.append("RED")        elif count_r < ountb:
    output_list.append("BLUE")        else:
    output_list.append("EQUAL")
return "\n".join(output_list)  print(main_func())   

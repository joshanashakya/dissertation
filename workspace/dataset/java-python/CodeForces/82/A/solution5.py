import mathque = int(input()) name = ["Sheldon", "Leonard", "Penny", "Rajesh", "Howard"] n = 0
while que - 5 * math.pow(2, n) > 0:    que -= 5 * math.pow(2, n)
n += 1 print(name[math.ceil(que / math.pow(2, n)) - 1])

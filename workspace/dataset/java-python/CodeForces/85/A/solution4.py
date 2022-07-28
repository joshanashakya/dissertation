a = int(input())
if a % 2 == 0:    print("aabb" * (a // 4) + "aabb"[:a % 4])
print("ccdd" * (a // 4) + "ccdd"[:a % 4])
a -= 2
print('z' + "eeff" * (a // 4) + "eeff"[:a % 4] + 'x')
print('z' + "iijj" * (a // 4) + "iijj"[:a % 4] + 'x') else:    a -= 1
print("z" + "aabb" * (a // 4) + "aabb"[:a % 4])
print("z" + "ccdd" * (a // 4) + "ccdd"[:a % 4])
print("eeff" * (a // 4) + "eeff"[:a % 4] + "x")
print("gghh" * (a // 4) + "gghh"[:a % 4] + "x")

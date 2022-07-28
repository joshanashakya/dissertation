if __name__ == '__main__':  
t = int(input())
result = []
for _ in range(t):        c = input().split()
a, b = int(c[0]), int(c[1])
if a > b:
    difference = a - b        else:
    difference = b - a         dif = difference // 10
mod = 1 if difference % 10 else 0
print(dif + mod) """65 513 4218 41337 420123456789 1000000000100500 9000 """

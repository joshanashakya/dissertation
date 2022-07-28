for _ in range(int(input())):    n = input()
if n == "1":
    count = 0    elif n == "2":
    count = 1    elif int(n[-1]) % 2 == 0 or n == "3":
    count = 2    else:
    count = 3
print(count)

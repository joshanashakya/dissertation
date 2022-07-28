for _ in range(int(input())):    n = int(input())
if (n == 1):
    print(9)    elif (n == 2):
    print(98)    elif (n == 3):
    print(989)    else:
    n -= 3
print("989" + "0123456789" * (n // 10) + "0123456789"[:n % 10])

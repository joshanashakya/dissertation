for _ in range(int(input())):  
n = bin(int(input()))[1:]     if n != "1" and n.count("1") == 1:
    print('NO')    else:
    print('YES')

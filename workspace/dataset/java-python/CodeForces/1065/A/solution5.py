t = int(input())for i in range(t):    temp = [int(x) for x in input().split()]    s = temp[0]    a = temp[1]    b = temp[2]    c = temp[3]    print(((s // c) // a) * (a + b) + (s // c) % a)

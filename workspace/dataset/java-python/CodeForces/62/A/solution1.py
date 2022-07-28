def fingers(a, b):    if


b + 1 >= a and 2 * a + 2 >= b:
return True a, a1 = map(int, input().split())
b, b1 = map(int, input().split())
if fingers(a, b1) or fingers(a1, b) == True:
    print('YES')else:
    print('NO')

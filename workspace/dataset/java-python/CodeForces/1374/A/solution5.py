def main():    t = int(input())    for _ in range(t):        x, y, n = map(int, input().split())        ans = n + (x - (n % x)) - (x - y)        if n % x < y:            ans -= x        print(ans)  if __name__ == '__main__':    main()  '''explaink % x = y 11% 3 ==1211 + ( 3 - 2'rem' ) => 12 - ( 3 - 1 ) => 11 + ( 3 - 2'rem' ) - ( 3 - 1'req' )                                       => n + ( x - ( n % x )) - ( x - y ) 12345 % 7 = 5   '''

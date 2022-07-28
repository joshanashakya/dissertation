n = int(input())mx = n // 7 * 2 + min(n%7, 2)mn = n // 7 * 2 + max(n%7-5, 0) print(mn, mx)  

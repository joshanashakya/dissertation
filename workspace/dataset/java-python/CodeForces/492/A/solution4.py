n = int(input())sum = 0i = 0for i in range (1, n + 1, 1):    for j in range (1, i + 1, 1):        sum += j    if (sum > n):        breakif (n < 4):    print(1) #nhỏ hơn 4 cubes thì chỉ build được 1 hàng duy nhấtelse:    print(i-1) #phải trừ đi 1 cube do sau mỗi lần update tổng ở mỗi hàng, i được cộng thêm 1 trước khi so sánh với điều kiện sum
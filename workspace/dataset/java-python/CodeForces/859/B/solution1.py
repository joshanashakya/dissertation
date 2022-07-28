import mathnum = int(input()) side = math.ceil(num**0.5) if (side - 1) * side >= num:    ans = (side*2-1)*2else:    ans = side * 4print(ans)          

x = input()
n, m = x.split()
n, m = int(n), int(m) 

def is_prime(number):    for


i in range(2, number):
if (number % i == 0):            return False
return True for i in range(n + 1, m + 1):    if
(is_prime(i)):
if (i == m):
    print("YES")        else:
    print("NO")
break elif (i == m): print("NO") 

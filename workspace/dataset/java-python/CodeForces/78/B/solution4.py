n = int(input())
l = "GYOR"
print("VIBGYOR" + l * ((n - 7) // 4) + l[:(n - 7) % 4])

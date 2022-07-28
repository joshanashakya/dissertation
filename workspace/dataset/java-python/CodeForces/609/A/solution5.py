n = int(input())m = int(input())usb = [] for _ in range(n):    usb.append(int(input())) for i, val in enumerate(sorted(usb, reverse=True)):    m -= val     if m <= 0:        print(i+1)        break

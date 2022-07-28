size = int(input())string = input()t = 0for i in range(len(string)):    try:        print(string[i + t], end='')    except IndexError:        break    t += i + 1

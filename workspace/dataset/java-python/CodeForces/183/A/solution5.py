def main():    a = b = 1    for _ in range(int(input())):        s = input()        if s in ("UL", "DR"):            a += 1        elif s in ("UR", "DL"):            b += 1        elif s == "ULDR":            a += 1            b += 1    print(a * b)  if __name__ == '__main__':    main()

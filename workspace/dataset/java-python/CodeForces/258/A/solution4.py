binary = input() try:    charIndex = binary.index("0")except:    charIndex = 0 newBinary = f"{binary[:charIndex]}{binary[charIndex + 1:]}" print(newBinary)

def main():    d = {}    for s in range(3):        s = input()        if(s[1] == '>'):            if(f'{s[0]}g' not in d):                d[f'{s[0]}g'] = 1            else:                d[f'{s[0]}g'] += 1             if(f'{s[2]}s' not in d):                d[f'{s[2]}s'] = 1            else:                d[f'{s[2]}s'] += 1         if(s[1] == '<'):            if(f'{s[0]}s' not in d):                d[f'{s[0]}s'] = 1            else:                d[f'{s[0]}s'] += 1             if(f'{s[2]}g' not in d):                d[f'{s[2]}g'] = 1            else:                d[f'{s[2]}g'] += 1     if(len(d) != 4):        print('Impossible')        return    arr = [''] * 3    for k, v in d.items():         if(v == 2):            if k[1] == 's':                arr[0] = k[0]            else:                arr[2] = k[0]        if(v == 1):            if arr[1] == '':                arr[1] = k[0]            else:                if arr[1] != k[0]:                    print('Impossible')                    return    print(''.join(arr)) if __name__ == "__main__":    main()
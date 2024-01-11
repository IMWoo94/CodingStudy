def solution(a, b):
    answer = f'{a}{b}' if int(f'{a}{b}') >= int(f'{b}{a}') else f'{b}{a}'
    
    str = "aaac"
    str2 = "aaab"
    print(min(str, str2))
    
    return max(int(f'{a}{b}'), int(f'{b}{a}'))
def solution(num_list):
    a = 1
    b = 0
    for num in num_list:
        a *= num
        b += num
    
    answer = 1 if a < b**2 else 0
    return answer